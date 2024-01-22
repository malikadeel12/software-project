import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public class DB {
    Connection con = null;
    java.sql.PreparedStatement pst;

    public static Connection dbconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup", "root", "");
            return conn;
        } catch (Exception e2) {
            System.out.print(e2);
            return null;
        }
    }
}
