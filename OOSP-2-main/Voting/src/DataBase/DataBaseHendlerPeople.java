package DataBase;
import java.sql.*;
import java.util.ArrayList;
import static VotersService.Voiters.idI;

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
    public void addPeople(String namePeople, String dateBorne, String gender, String jobTitle){
        String insert = "insert into void.people (namePeople, dateBorne, gender, jobTitle) values(?,?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1,namePeople);
            preparedStatement.setString(2,dateBorne);
            preparedStatement.setString(3,gender);
            preparedStatement.setString(4,jobTitle);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void idPeople(String namePeople, String dateBorne, String gender, String jobTitle) {
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT idpeople FROM void.people WHERE namePeople ='" + namePeople + "' and dateBorne='" + dateBorne + "'" +
                    "  and gender='" + gender + "' and jobTitle ='" + jobTitle +"'");
            while (rs.next()) {
                /*idVoit = rs.getInt("idpeople");
                System.out.println(idVoit);


                 */
                int idpeople = rs.getInt("idpeople");
                idI = idpeople;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
