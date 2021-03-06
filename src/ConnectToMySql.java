import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToMySql {
    private static Connection connection;

    private static final String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
    private static final String username = "root";
    private static final String password = "";


    public static Connection getConnection() {

        try {
            if (connection == null || connection.isClosed()) {
                Class clazz = Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);

            }
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}