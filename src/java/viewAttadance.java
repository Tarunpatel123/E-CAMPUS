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
             
public class viewAttadance extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        response.setContentType("text/html;charset=UTF-8");
    
        try (PrintWriter out = response.getWriter()) {
             HttpSession session=request.getSession();
           String Enrollment_Number= (String) session.getAttribute("Enrollment_Number");  
          // String enrollmentNumberParam = request.getParameter("Enrollment_Number");
            if (Enrollment_Number == null || Enrollment_Number.isEmpty()) {
                out.println("Enrollment number parameter is missing.");
                return;
            }

            String sql = "SELECT * FROM Attendance WHERE Enrollment_Number=?";
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");
                    PreparedStatement ps = con.prepareStatement(sql)) {

                   ps.setString(1, Enrollment_Number);
                try (ResultSet rs = ps.executeQuery()) {
                   /* out.println("<html>");
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
                    out.println("<a href=showStudent.jsp>Home</a>");
                    out.println("</body>");
                    out.println("</html>");*/
                   out.println("<html>");
out.println("<head>");
out.println("<title>Attendance Marks</title>");
out.println("<style>");
out.println("body { font-family: Arial, sans-serif; }");
out.println("table { width: 100%; border-collapse: collapse; }");
out.println("th, td { padding: 10px; text-align: left; }");
out.println("th { background-color: #f2f2f2; }");
out.println("tr:nth-child(even) { background-color: #f2f2f2; }");
out.println("tr:hover { background-color: #ddd; }");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<hr>");
out.println("<h2>View Attendance</h2>");
out.println("<table border='1'>");
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
out.println("<a href='showStudent.jsp'>Home</a>");
out.println("</body>");
out.println("</html>");
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

