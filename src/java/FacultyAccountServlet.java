

import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FacultyAccountServlet extends HttpServlet {
  //  private Connection con; private PreparedStatement ps;
 private Connection con; private   java.sql.PreparedStatement ps;
//    @Override
      public void  init()
      {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");
            String sql="insert into teachers values(?,?,?,?,?,?,?)";
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
          //  super.doGet(request , response); //To change body of generated methods, choose Tools | Templates.
          PrintWriter out=response.getWriter();
       //   http://localhost:8080/AttendenceManagmentSystem/FacultyAccountServlet?uid=piyanka%40gmail.com&passward=1111&name=priyanka&mobile=toc&subject=6264988989
          String Email=request.getParameter("uid");
          String passward=request.getParameter("passward");
          String name=request.getParameter("name");
           String mobile=request.getParameter("mobile");
          String subject=request.getParameter("subject");
          String join=request.getParameter("date");
          String exprince=request.getParameter("experience");
         
        
        
        try {
            ps.setString(1,Email);
            ps.setString(2,passward);
            ps.setString(3,name);
            ps.setString(4,mobile);
            ps.setString(5,subject);
            ps.setString(6, join);
            ps.setString(7,exprince);
            ps.executeUpdate();
                  out.println("<html>");
                  out.println("<body>");
                  out.println("<h3>Registration successfull </h3>");
                  
                  out.println("<a href=index.jsp>Home</a>");
                  out.println("</body>");
                  out.println("</html>");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    }