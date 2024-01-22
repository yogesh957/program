package jdbc;
import java.sql.*;
public class ConnectionUtil {
    public static Connection OpenConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "yogesh@123";
        return DriverManager.getConnection(url,user,password);

    }

    public static void CloseConnection(ResultSet resultSet,Statement statement,Connection connection) throws SQLException {
      if(resultSet!=null)  resultSet.close();
      if(statement!=null)  statement.close();
      if(connection!=null)  connection.close();
    }
}
