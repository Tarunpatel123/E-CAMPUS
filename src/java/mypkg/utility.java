
package  mypkg;
import java.sql.Connection;
 import java.sql.DriverManager;

public class utility {
   private static  Connection con;
    public  static Connection connect(){
         try{
        Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_attendance_managment?useSSL=false","root","Tarun@2002");
         } catch(Exception ex){
             System.out.println(ex);
         }
         return con;
    }
}