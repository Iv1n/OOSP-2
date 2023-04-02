import MenuUI.*;
import  java.util.Scanner;
public class MainUI {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Выберите профиль под кем вы хотите зайти:\n" +
                "Администратор - Введите 1\n" +
                "ЦИК - Введите 2\n" +
                "Пользователь - Введите 3\n" +
                "Кандидат - Введите 4");
        int a = scanner.nextInt();
        if (a == 1 | a == 2 | a == 3 | a == 4) {
            if(a==1){
                Login login = new AdminMenuUI();
                login.profile();
            }
            if(a==2){
                Login login = new CentralElectionCommissionMenuUI();
                login.profile();
            }
            if(a==3){
                Login login = new VotersMenuUI();
                login.profile();
            }
            if(a==4){
                Login login = new CandidateMenuUI();
                login.profile();
            }

        }
        else {
            System.out.println("Вы выбрали не существющие действие");
        }
    }
}
