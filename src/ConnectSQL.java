import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ConnectSQL {
    public static void main(String[] args) {

        String dbURL = "jdbc:sqlserver://DESKTOP-GE7DV5O\\ASACC;databaseName=TEST1";
        String user = "sa";
        String pass = "SaSa111";

        List<String> l = new ArrayList<>();

//        Connection connection = DriverManager.getConnection(dbURL, user, pass);
        try {
            Connection connection = DriverManager.getConnection(dbURL, user, pass);


//            String sql = "INSERT BOYS (NAME, CITY) VALUES('Spartak', 'Yerevan')";
//
//            Statement statement = connection.createStatement();
//            int rows = statement.executeUpdate(sql);
//
//            if(rows > 0){
//                System.out.println("Row has been deleted");
//            }

            String sql1 = "SELECT * FROM BOYS";
            Statement statement1 = connection.createStatement();
            ResultSet result = statement1.executeQuery(sql1);

            int count = 0;

            while(result.next()){
                count++;
                String name = result.getString("NAME");
                String city = result.getString("CITY");
                System.out.println(count + " " + name + " " + city);
            }

           connection.close();
        } catch(SQLException e){
            System.out.println("There is an error");
            e.printStackTrace();
        }
        System.out.println(l);
    }
}

