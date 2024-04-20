import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class attendance extends HttpServlet {
     private  PreparedStatement ps;private  Connection con;
      
   public void init()
   {
       try{
      Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");
     // con=utility.connect();
       
  // we will get the connection form context object
     
     String sql="insert into Attendance(idate,Enrollment_Number,Machine_Learning,Computer_Network, Computer_Design, Project_Managment) values (now(),?,?,?,?,?)"; 
           ps=con.prepareStatement(sql);
         
        }catch(Exception e){
          e.printStackTrace();
       }
   }
public void destroy()
{
   try{
   con.close(); 
}catch(Exception ex){
     ex.printStackTrace();
}
}

      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //To change body of generated methods, choose Tools | Templates.
     //state=&userid=&total=&active=&death=&submit=Submit
            
            PrintWriter out=response.getWriter();
            // String state=request.getParameter("state");
          // String uid=request.getParameter("userid");
        
          //   int en =Integer.parseInt(request.getParameter("EnrollmentNumber"));
            String en=request.getParameter("EnrollmentNumber");
            String ml=request.getParameter("MachineLearning");
            String cn=request.getParameter("ComputerNetwork");
            String cd=request.getParameter("ComputerDesign");
            String pm=request.getParameter("ProjectManagment");
           
             try{
         //  ps.setDate(1, idate);
          ps.setString(1,en);
          ps.setString(2,ml);
          ps.setString(3,cn);
          ps.setString(4,cd);
          ps.setString(5,pm);
          ps.executeUpdate();
        
           out.println("<html>");
          out.println("<body>");
          out.println("<h3>Information successfull  Submited</h3>");
          out.println("<a href=showFaculty.jsp>Faculty Page</a>");
          out.println("</body>");
          out.println("</html>");
             
             } catch (Exception ex) {
                 out.println(ex);     
          }
              
         
    }
}
