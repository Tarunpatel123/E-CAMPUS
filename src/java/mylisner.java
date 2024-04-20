
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class mylisner implements ServletContextListener {
private Connection con;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       try{
           Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false", "root", "Tarun@2002");
        ServletContext context=sce.getServletContext();
        context.setAttribute("data",con);
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          try{
              con.close();
          }catch(Exception ex)
          {
              ex.printStackTrace();
          }
    }
    
}
