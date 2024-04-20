
//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class midtermServlet extends HttpServlet {
    private Connection con;
    private  PreparedStatement ps;
       public void  init()
      {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");
            String sql="insert into MidTermMarks values(?,?,?,?,?)";
            ps=con.prepareStatement(sql);
        } catch(Exception ex){
            ex.printStackTrace();   
        } 
      }
      public void destroy(){
          try{
          con.close();
          }catch(Exception ex){
              ex.printStackTrace();
          }
      }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Enrollment_Number=0829CS211190&Machine_Learning=15&Computer_Science=15&Computer_Organizaion=15&project=15&submit=Submit
             PrintWriter out=response.getWriter();
             String En=request.getParameter("Enrollment_Number");
             String Ml=request.getParameter("Machine_Learning");
             String cs=request.getParameter("Computer_Science");
             String co=request.getParameter("Computer_Organizaion");
             String project=request.getParameter("project");
             try{
                 ps.setString(1, En);
                 ps.setString(2, Ml);
                 ps.setString(3, cs);
                 ps.setString(4, co);
                 ps.setString(5, project);
                 ps.executeUpdate();
                
              //   response.sendRedirect("showFaculty.jsp");
                 
             }catch(Exception ex)
             {
                 ex.printStackTrace();
             }
             response.sendRedirect("showFaculty.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

