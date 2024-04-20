
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Profile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
               try (PrintWriter out = response.getWriter()) {
             HttpSession session=request.getSession();
           String Enrollment_Number= (String) session.getAttribute("Enrollment_Number");  
          // String enrollmentNumberParam = request.getParameter("Enrollment_Number");
                    if (Enrollment_Number == null || Enrollment_Number.isEmpty()) {
                     out.println("Enrollment number parameter is missing.");
                   return;
            }

            String sql = "SELECT * FROM registration WHERE Enrollment_Number=?";
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");
                    PreparedStatement ps = con.prepareStatement(sql)) {

                   ps.setString(1, Enrollment_Number);
                  try (ResultSet rs = ps.executeQuery()) {
                      
                      out.println("<html>");
out.println("<head>");
out.println("<title>PROFILE</title>");
out.println("<style>");
out.println("body {");
out.println("    font-family: Arial, sans-serif;");
out.println("    background-color: #f0f0f0;");
out.println("}");
out.println("h2 {");
out.println("    text-align: center;");
out.println("}");
out.println("table {");
out.println("    width: 80%;");
out.println("    margin: 0 auto;");
out.println("    border-collapse: collapse;");
out.println("}");
out.println("th, td {");
out.println("    padding: 10px;");
out.println("    text-align: center;");
out.println("    border: 1px solid #000;");
out.println("}");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<hr>");
out.println("<h2>PROFILE</h2>");
out.println("<table>");
out.println("<tr>");
out.println("<th>Email</th><th>Password</th><th>Class</th><th>Branch</th><th>Year</th><th>Name</th><th>Mobile</th><th>Address</th><th>Enrollment Number</th>");
out.println("</tr>");

while (rs.next()) {
    String email = rs.getString("Email");
    String password = rs.getString("passward");
    String Class = rs.getString("class");
    String branch = rs.getString("branch");
    String year = rs.getString("year");
    String name = rs.getString("name");
    String mobile = rs.getString("mobile");
    String address = rs.getString("address");
    String enrollmentNumber = rs.getString("Enrollment_Number");
                     
    out.println("<tr>");
    out.println("<td>" + email + "</td>");
    out.println("<td>" + password + "</td>");
    out.println("<td>" + Class + "</td>");
    out.println("<td>" + branch + "</td>");
    out.println("<td>" + year + "</td>");
    out.println("<td>" + name + "</td>");
    out.println("<td>" + mobile + "</td>");
    out.println("<td>" + address + "</td>");
    out.println("<td>" + enrollmentNumber + "</td>");
    out.println("</tr>");
}

out.println("</table>");
out.println("<hr>");
out.println("<p style=\"text-align: center;\"><a href=\"showStudent.jsp\">Home</a></p>");
out.println("</body>");
out.println("</html>");
                  /*  out.println("<html>");
                    out.println("<head>");
                    out.println("<title>PROFILE</title>");
                    out.println("</head>");
                    out.println("<body bgcolor=lightgreen>");
                    out.println("<hr>");
                    out.println("<h2>PROFILE.....</h2>");
                    out.println("<table border=10 cellspacing=\"9\">");
                    out.println("<tr>");
                    out.println("<th>Email</th><th>Passward</th><th>Class</th><th>Branch</th><th> year</th><th> name</th><th> mobile</th><th>Address</th><th>Enrollment_Number</th>");
                    out.println("</tr>");

                    while (rs.next()) {
                        String Email = rs.getString("Email");
                        String pwd = rs.getString("passward");
                        String Class = rs.getString("class");
                        String branch = rs.getString("branch");
                        String year = rs.getString("year");
                        String name = rs.getString("name");
                        String mobile = rs.getString("mobile");
                        String address = rs.getString("address");
                        String En= rs.getString("Enrollment_Number");
                         
                        out.println("<tr>");
                        out.println("<td>" +Email+ "</td>");
                        out.println("<td>" +pwd+ "</td>");
                        out.println("<td>" +Class+ "</td>");
                        out.println("<td>" +branch + "</td>");
                         out.println("<td>" +year+ "</td>");
                        out.println("<td>" +name + "</td>");
                        out.println("<td>" +mobile + "</td>");
                        out.println("<td>" +address+ "</td>");
                        out.println("<td>" +En+ "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    out.println("<hr>");
                    out.println("<a href=showStudent.jsp>Home</a>");
                    out.println("</body>");
                    out.println("</html>");*/
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet to view Midterm Marks for a specific enrollment number";
    }
}














