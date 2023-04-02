package DataBase;
import java.sql.*;
import java.util.ArrayList;

public class DataBaseHendlerPeople extends Config {

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

    //SELECT idpeople, namePeople, dateBorne, gender FROM void.people WHERE jobTitle ='Кандидат'
    public void infCandidate(ArrayList<String> candidate) {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT idpeople, namePeople, dateBorne, gender FROM void.people WHERE jobTitle ='Кандидат'");
            while (rs.next()) {
               String idpeople = rs.getString("idpeople");
               String namePeople = rs.getString("namePeople");
               String dateBorne = rs.getString("dateBorne");
               String gender = rs.getString("gender");
               String ff = idpeople + " " + namePeople + " " + dateBorne + " " + gender;
              candidate.add(ff);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
