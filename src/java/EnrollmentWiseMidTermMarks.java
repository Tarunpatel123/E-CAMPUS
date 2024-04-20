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

public class EnrollmentWiseMidTermMarks extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String enrollmentNumberParam = request.getParameter("Enrollment_Number");
            if (enrollmentNumberParam == null || enrollmentNumberParam.isEmpty()) {
                out.println("Enrollment number parameter is missing.");
                return;
            }

            String sql = "SELECT * FROM midtermmarks WHERE Enrollment_Number=?";
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");
                    PreparedStatement ps = con.prepareStatement(sql)) {

                   ps.setString(1, enrollmentNumberParam);
                try (ResultSet rs = ps.executeQuery()) {
                  /*  out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Midterm Marks</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<hr>");
                    out.println("<h2>View for Midterm Marks</h2>");
                    out.println("<table border=2>");
                    out.println("<tr>");
                    out.println("<th>Enrollment Number</th><th>Machine Learning</th><th>Computer Science</th><th>Computer Organization</th><th>Project</th>");
                    out.println("</tr>");

                    while (rs.next()) {
                        String enrollmentNumber = rs.getString("Enrollment_Number");
                        String machineLearning = rs.getString("Machine_Learning");
                        String computerScience = rs.getString("Computer_Science");
                        String computerOrganizaion = rs.getString("Computer_Organizaion");
                        String project = rs.getString("Project");

                        out.println("<tr>");
                        out.println("<td>" + enrollmentNumber + "</td>");
                        out.println("<td>" + machineLearning + "</td>");
                        out.println("<td>" + computerScience + "</td>");
                        out.println("<td>" + computerOrganizaion + "</td>");
                        out.println("<td>" + project + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    out.println("<hr>");
                 //   out.println("  <a href=\"showFaculty.jsp\">Home</a>");
                    out.println("</body>");
                    out.println("</html>");*/
                  out.println("<html>");
out.println("<head>");
out.println("<title>Midterm Marks</title>");
out.println("<style>");
out.println("body { font-family: Arial, sans-serif; background-color: #f5f5f5; margin: 0; padding: 0; }");
out.println(".container { max-width: 800px; margin: 50px auto; padding: 20px; background-color: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
out.println("h2 { text-align: center; color: #008080; }");
out.println("table { width: 100%; border-collapse: collapse; border: 2px solid #008080; }");
out.println("th, td { padding: 10px; text-align: center; border: 1px solid #ddd; }");
out.println("th { background-color: #008080; color: #fff; }");
out.println("tr:nth-child(even) { background-color: #f2f2f2; }");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<div class=\"container\">");
out.println("<h2>View  Midterm Marks</h2>");
out.println("<table>");
out.println("<tr>");
out.println("<th>Enrollment Number</th><th>Machine Learning</th><th>Computer Science</th><th>Computer Organization</th><th>Project</th>");
out.println("</tr>");

while (rs.next()) {
                        String enrollmentNumber = rs.getString("Enrollment_Number");
                        String machineLearning = rs.getString("Machine_Learning");
                        String computerScience = rs.getString("Computer_Science");
                        String computerOrganizaion = rs.getString("Computer_Organizaion");
                        String project = rs.getString("Project");

                        out.println("<tr>");
                        out.println("<td>" + enrollmentNumber + "</td>");
                        out.println("<td>" + machineLearning + "</td>");
                        out.println("<td>" + computerScience + "</td>");
                        out.println("<td>" + computerOrganizaion + "</td>");
                        out.println("<td>" + project + "</td>");
                        out.println("</tr>");
                    }
out.println("</table>");
out.println("</div>");
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


























