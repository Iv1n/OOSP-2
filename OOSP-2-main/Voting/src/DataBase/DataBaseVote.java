package DataBase;

import java.sql.*;
import java.util.ArrayList;

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
            String insert = "INSERT INTO void.elections (nameElections,electionCategory,endDate,candidateNumbers) VALUES(?,?,?,?)";
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
    public void listVoets(ArrayList<String> listVotes){
     try {
         getDbConnection();
         stmt = con.createStatement();
         rs = stmt.executeQuery("SELECT DISTINCT nameElections FROM void.elections");
         while (rs.next()) {
             String nameVotes = rs.getString("nameElections");
             listVotes.add(nameVotes);
         }
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }

    public void listCandidate(ArrayList<String> listVotes, int n, ArrayList<String> listCandidate, ArrayList<Integer> numCandidate){
        try {
            getDbConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT elections.candidateNumbers, people.namePeople FROM void.elections, void.people where elections.nameElections='" + listVotes.get(n) +"' \n" +
                    "and elections.candidateNumbers = people.idpeople;");
            while (rs.next()) {
                String listC = rs.getString("candidateNumbers");
                String nameC = rs.getString("namePeople");
                numCandidate.add(Integer.valueOf(listC));
                listCandidate.add(listC +" "+ nameC);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addVoice(ArrayList<String> listVotes, int n, ArrayList<Integer> numCandidate, int num, int idI){
        String insert = "INSERT INTO void.voicecandidatte (numCandidate,idVoits,nameVoid) VALUES(?,?,?)";
        try {
            preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setInt(1, numCandidate.get(num));
            preparedStatement.setInt(2, idI);
            preparedStatement.setString(3, listVotes.get(n));
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
