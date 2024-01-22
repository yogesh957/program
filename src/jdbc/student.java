package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class student {
    public int addStudent(int studentId,String studentName,int studentMarks) {
        int rows_affected = 0;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
             connection = ConnectionUtil.OpenConnection();
            String Query = "INSERT INTO student (studentId,studentName,studentMarks) VALUES(?,?,?)";

             statement = connection.prepareStatement(Query);
            statement.setInt(1,studentId);
            statement.setString(2,studentName);
            statement.setInt(3,studentMarks);
             rows_affected = statement.executeUpdate();
            ConnectionUtil.CloseConnection(resultSet,statement,connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return rows_affected;

    }



    // read,update and delete



}
