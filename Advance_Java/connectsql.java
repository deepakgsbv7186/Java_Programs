
import java.sql.*;

public class connectsql {
      public static void main(String args[]) throws ClassNotFoundException{
         try{
                Connection con = null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc.sqlserver://localhost:1433;databaseName=testing;user=test;password=123;";
      
              con=DriverManager.getConnection(url);
              System.out.println("Connection is successful.");
          }
          catch(SQLException e){
              System.out.println(e);
          }
          
      }
}
