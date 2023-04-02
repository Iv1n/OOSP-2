package CECService;

import DataBase.DataBaseHendlerPeople;
import DataBase.DataBaseVote;

import java.util.ArrayList;


public class CreateVoid {
    public ArrayList<String> Candidate = new ArrayList<>();
    int n=0;


    public void listCandidate(){

        DataBaseHendlerPeople dataBaseHendlerPeople = new DataBaseHendlerPeople();
        dataBaseHendlerPeople.infCandidate(Candidate);
        for (String l : Candidate){
            System.out.println(l);
            n++;
        }
    }
    public void choisCandidate(String[] caldidate){
        for(int i=0; i<caldidate.length;i++){
            if(Integer.valueOf(caldidate[i]) > n){
                System.out.println("Присутсвуют номера не существующих кандидатов");
                System.exit(0);
            }
        }

    }

    public void ss(String nameVoid, String kindOfVoiting,String expiratiomDate,String[] caldidate){
        DataBaseVote dataBaseVote = new DataBaseVote();
        dataBaseVote.signVoid(nameVoid,kindOfVoiting,expiratiomDate,caldidate);
    }
}
