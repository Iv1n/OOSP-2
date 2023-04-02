package MenuUI;

import java.util.Scanner;

public class AdminMenuUI implements Login {
    @Override
    public void profile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Меню Администратора----------\n" +
                "Введите 1 чтобы открыть список пользователей\n" +
                "Введите 2 чтобы открыть список ЦИК\n" +
                "Введите 3 чтобы войти в меню ЦИК\n" +
                "Введитe 4 чтобы созадть ЦИК");
        int a = scanner.nextInt();
        if(a==1 | a==2 | a==3 | a==4){
            if (a==1){

            }
            if (a==2){

            }
            if (a==3){
                CentralElectionCommissionMenuUI CECMenuUI = new CentralElectionCommissionMenuUI();
                CECMenuUI.profile();
            }
            if (a==4){

            }
        }
        System.out.println("Вы выбрали не существющие действие");
    }
}
