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
            
public class viewAttandanceall extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        response.setContentType("text/html;charset=UTF-8");
    
        try (PrintWriter out = response.getWriter()) {
          /*   HttpSession session=request.getSession();
       //    String Enrollment_Number= (String) session.getAttribute("Enrollment_Number");  
          // String enrollmentNumberParam = request.getParameter("Enrollment_Number");
         //   if (Enrollment_Number == null || Enrollment_Number.isEmpty()) {
           //     out.println("Enrollment number parameter is missing.");
             //   return;*/
            

            String sql = "SELECT * FROM Attendance";
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery())
            {
             
                 /*   out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Attenadance Marks</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<hr>");
                    out.println("<h2>View Attendance</h2>");
                    out.println("<table border=2>");
                    out.println("<tr>");
                    out.println("<th>Date</th><th>Enrollment Number</th><th>Machine Learning</th><th>Computer Science</th><th>Computer Organization</th><th>Project</th>");
                    out.println("</tr>");

                    while (rs.next()) {
                        String date = rs.getString("idate");
                        String enrollmentNumber = rs.getString("Enrollment_Number");
                        String machineLearning = rs.getString("Machine_Learning");
                        String computerNetwork = rs.getString("Computer_Network");
                        String computerDesign= rs.getString("Computer_Design");
                        String project = rs.getString("Project_Managment");

                        out.println("<tr>");
                         out.println("<td>" +date+ "</td>");
                        out.println("<td>" + enrollmentNumber + "</td>");
                        out.println("<td>" + machineLearning + "</td>");
                        out.println("<td>" + computerNetwork + "</td>");
                        out.println("<td>" + computerDesign + "</td>");
                        out.println("<td>" + project + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    out.println("<hr>");
                    out.println("<a href=showFaculty.jsp>Home</a>");
                    out.println("</body>");
                    out.println("</html>");*/
                out.println("<html>");
out.println("<head>");
out.println("<title>Attendance Marks</title>");
out.println("<style>");
out.println("body {");
out.println("    font-family: Arial, sans-serif;");
out.println("    background-color: #f0f8ff; /* Light blue */");
out.println("    margin: 0;");
out.println("    padding: 0;");
out.println("    text-align: center;");
out.println("}");
out.println("h2 {");
out.println("    color: #008080; /* Dark cyan */");
out.println("    margin-top: 50px;");
out.println("}");
out.println("table {");
out.println("    margin: 20px auto;");
out.println("    border-collapse: collapse;");
out.println("    width: 80%;");
out.println("}");
out.println("th, td {");
out.println("    padding: 10px;");
out.println("    border: 1px solid #ddd;");
out.println("}");
out.println("th {");
out.println("    background-color: #008080;");
out.println("    color: #fff;");
out.println("}");
out.println("tr:nth-child(even) {");
out.println("    background-color: #f2f2f2;");
out.println("}");
out.println("a {");
out.println("    display: inline-block;");
out.println("    margin-top: 20px;");
out.println("    padding: 10px 20px;");
out.println("    background-color: #4CAF50; /* Green */");
out.println("    color: #fff;");
out.println("    text-decoration: none;");
out.println("    border-radius: 5px;");
out.println("    transition: background-color 0.3s ease;");
out.println("}");
out.println("a:hover {");
out.println("    background-color: #45a049; /* Darker green */");
out.println("}");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<hr>");
out.println("<h2>View Attendance</h2>");
out.println("<table border='2'>");
out.println("<tr>");
out.println("<th>Date</th>");
out.println("<th>Enrollment Number</th>");
out.println("<th>Machine Learning</th>");
out.println("<th>Computer Science</th>");
out.println("<th>Computer Organization</th>");
out.println("<th>Project</th>");
out.println("</tr>");

    while (rs.next()) {
    String date = rs.getString("idate");
    String enrollmentNumber = rs.getString("Enrollment_Number");
    String machineLearning = rs.getString("Machine_Learning");
    String computerNetwork = rs.getString("Computer_Network");
    String computerDesign = rs.getString("Computer_Design");
    String project = rs.getString("Project_Managment");

    out.println("<tr>");
    out.println("<td>" + date + "</td>");
    out.println("<td>" + enrollmentNumber + "</td>");
    out.println("<td>" + machineLearning + "</td>");
    out.println("<td>" + computerNetwork + "</td>");
    out.println("<td>" + computerDesign + "</td>");
    out.println("<td>" + project + "</td>");
    out.println("</tr>");
}

out.println("</table>");
out.println("<hr>");
out.println("<a href='showFaculty.jsp'>Home</a>");
out.println("</body>");
out.println("</html>");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
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

