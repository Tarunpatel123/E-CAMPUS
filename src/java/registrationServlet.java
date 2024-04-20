import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns = {"/registration_servlet"})
public class registrationServlet extends HttpServlet {
    private Connection con; private   PreparedStatement ps;
//    @Override
      public void  init()
      {
        try{
       //  Class.forName("com.mysql.jdbc.Driver");
      // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");
       //   con=mypkg.utility.connect();
        String sql="insert into registration values(?,?,?,?,?,?,?,?,?)";
            ServletContext context=getServletContext();
            Connection con=(Connection) context.getAttribute("data");
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  super.doGet(request, response); //To change body of generated methods, choose Tools | Templates.
            PrintWriter out=response.getWriter();
            String  email= request.getParameter("uid");
            String  passward =request.getParameter("password");
            String  Class =request.getParameter("class");
            String  branch=request.getParameter("branch");
             String  year =request.getParameter("year");
            String  name=request.getParameter("name");
            String  mobile=request.getParameter("mobile");
            String  address=request.getParameter("address");
            String  Enrollment_Number=request.getParameter("enrollment");
                try{
                    ps.setString(1, email);
                    ps.setString(2,passward );
                    ps.setString(3, Class);
                    ps.setString(4, branch);
                    ps.setString(5,year);
                    ps.setString(6,name);
                    ps.setString(7, mobile);
                    ps.setString(8, address);
                    ps.setString(9, Enrollment_Number);
                    ps.executeUpdate();
                   out.println("<html>");
                   out.println("<body>");
                   out.println("<h3>Registration successfull </h3>");
                   out.println("<a href=indexx.jsp>Home</a>");
                   out.println("</body>");
                   out.println("</html>");
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }
    }
      }
    

