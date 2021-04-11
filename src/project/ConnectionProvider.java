
package project;
import java.sql.*;



/**
 *
 * @author dream
 */
public class ConnectionProvider {
     public static Connection getCon()
    {
       try
       {
         Class.forName("com.mysql.jdbc.Driver"); 
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
          return con;
       }
       catch(Exception e)
       {
         return null;  
       }
    }
    
}
