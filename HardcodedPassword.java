import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  

public class HardcodedPassword {
    public Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost/mydb";
        String username = "root";
        String password = "P@ssw0rd"; // Hard-coded password
        return DriverManager.getConnection(url, username, password);
    }
} 