package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
             Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/spendingdb",
                 "root", "@sufi786");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

