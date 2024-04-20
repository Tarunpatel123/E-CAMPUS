import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MidTermupdate extends HttpServlet {
    private PreparedStatement ps;
    private Connection con;

    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");

            String sql = "UPDATE midtermmarks " +
                         "SET  Machine_Learning = ?, " +
                         "     Computer_Science = ?, " +
                         "    Computer_organizaion =?, " +
                         "    project = ? " +
                         "WHERE  Enrollment_Number =?";
            ps = con.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String machineLearning = request.getParameter("ml");
        String computerScience = request.getParameter("cs");
        String computerOrganization = request.getParameter("co");
        String project = request.getParameter("project");
        String enrollNumber = request.getParameter("enroll");

        try {
            ps.setString(1, machineLearning);
            ps.setString(2, computerScience);
            ps.setString(3, computerOrganization);
            ps.setString(4, project);
            ps.setString(5, enrollNumber);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                out.println("<html>");
                out.println("<body>");
                out.println("<h3>Information successfully submitted</h3>");
                out.println("<a href='showFaculty.jsp'>Faculty Page</a>");
                out.println("</body>");
                out.println("</html>");
            } else {
                out.println("<html>");
                out.println("<body>");
                out.println("<h3>Failed to update mid-term marks</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            out.println("<html>");
            out.println("<body>");
            out.println("<h3>Error occurred while updating mid-term marks</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
