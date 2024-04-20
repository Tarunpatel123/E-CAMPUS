import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class verificationServlet extends HttpServlet {
    private Connection con; private PreparedStatement ps,ps1;

    public void init()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");  
        String sql="select * from  registration where  Email=? and passward=?";
        String sq="select * from  teachers where  Email=? and passward=?";
        ps=con.prepareStatement(sql);
        ps1=con.prepareStatement(sq);
} catch(Exception ex)
{
    ex.printStackTrace();
}
    }
    public void destroy()
    {
        try{
        con.close();
    }catch(Exception ex)
    {
        ex.printStackTrace();
    }
    }
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // super.doGet(request response); //To change body of generated methods, choose Tools | Templates.
                   PrintWriter out=response.getWriter();
                   String Uid=request.getParameter("Uid");
                   String passward=request.getParameter("passward");
                   String utype=request.getParameter("Utype");
                     HttpSession session = request.getSession();
                   
                   if(utype.equals("Student"))
                   {
                        try{
                         ps.setString(1, Uid);
                         ps.setString(2, passward);
                         ResultSet rs=ps.executeQuery();
                         boolean found=rs.next();
                         if(found)
                         {
                           session.setAttribute("uid",Uid);
                          session.setAttribute("Enrollment_Number", rs.getString("Enrollment_Number"));
                       RequestDispatcher rd=request.getRequestDispatcher("showStudent.jsp");
                       rd.forward(request, response);
                   }
                   else
                       {
                           out.println("<html><body bgcolor=\"lightgreen\">");
                          out.println("<h2>Invalid student- Account</h2>");
                          out.println("<h2><a href=indexx.jsp>try Again</a></h2>");
                          out.println("</body></html"); 
                         }
                     }catch(Exception ex)
                     {
                         ex.printStackTrace();
                     }  
                   }
                    else if (utype.equals("Director")){
                              if(Uid.equals("sdbc") && passward.equals("123")){
                             //response .sendRedirect("SuperAdminDashboard.jsp");
                             RequestDispatcher rd=request.getRequestDispatcher("director.jsp");
                             rd.forward(request, response);
                           }
                          else
                       {
                           out.println("<html><body bgcolor=\"lightgreen\">");
                          out.println(" <h2>Invalid Director-Account</h2> ");
                          out.println(" <h2><a href=indexx.jsp>try Again</a></h2> ");
                          out.println("</body></html>");
                       }
                    }
                    if(utype.equals("Faculty"))
                   {
                         try{
                          ps1.setString(1, Uid);
                          ps1.setString(2, passward);
                          ResultSet rs=ps1.executeQuery();
                          boolean found=rs.next();
                          if(found)
                           {
                       //   session.setAttribute("uid",Uid);
                         //      session.setAttribute("enrollmentNumber", rs.getString("Enrollment_Number"));
                      
                               RequestDispatcher rd=request.getRequestDispatcher("showFaculty.jsp");
                               rd.forward(request, response);
                      /*   HttpSession session=request.getSession();
                                           session.setAttribute("uid",Uid);
                                           session.setAttribute("en", rs.getString("en"));*/
                          
     }
                   else
                       {
                         /*  HttpSession session=request.getSession();
                                           session.setAttribute("uid",Uid);
                                           session.setAttribute("en", rs.getString("en"));*/
                          out.println("<html><body bgcolor=\"lightgreen\">");
                          out.println("<h2>Invalid Teacher-Account</h2>");
                          out.println("<h2><a href=indexx.jsp>try Again</a></h2>");
                          out.println("</body></html"); 
                         }
                     }catch(Exception ex)
                     {
                         ex.printStackTrace();
                         
                     }  
                   }
                   
    
                   


   
        }
    }