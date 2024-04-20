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

public class attendanceupdate extends HttpServlet {
    private PreparedStatement ps;
    private Connection con;

    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");

            String sql = "UPDATE Attendance " +
                         "SET Machine_Learning = ?, " +
                         "    Computer_Network = ?, " +
                         "    Computer_Design = ?, " +
                         "    Project_Managment = ? " +
                         "WHERE Enrollment_Number = ? AND idate = ?";
            ps = con.prepareStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String enrollNumber = request.getParameter("enroll");
        String machineLearning = request.getParameter("ml");
        String computerNetwork = request.getParameter("cn");
        String computerDesign = request.getParameter("cd");
        String projectManagement = request.getParameter("pm");
        String date = request.getParameter("idate");

        try {
            ps.setString(1, machineLearning);
            ps.setString(2, computerNetwork);
            ps.setString(3, computerDesign);
            ps.setString(4, projectManagement);
            ps.setString(5, enrollNumber);
            ps.setString(6, date);
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
                out.println("<h3>Failed to update attendance information</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            out.println("<html>");
            out.println("<body>");
            out.println("<h3>Error occurred while updating attendance information</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
