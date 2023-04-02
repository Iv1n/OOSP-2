package DataBase;

import java.sql.*;

public class DataBaseVote extends Config{

    private PreparedStatement preparedStatement;
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public Connection getDbConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
    public void signVoid(String nameVoid, String kindOfVoiting,String expiratiomDate,String[] caldidate){
        for(int i=0;i<caldidate.length;i++) {
            String insert = "INSERT INTO void.elections (nameElections, electionCategory, endDate, candidateNumbers) VALUES(?,?,?,?)";
            try {
                preparedStatement = getDbConnection().prepareStatement(insert);
                preparedStatement.setString(1, nameVoid);
                preparedStatement.setString(2, kindOfVoiting);
                preparedStatement.setString(3, expiratiomDate);
                preparedStatement.setString(4, caldidate[i]);
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
