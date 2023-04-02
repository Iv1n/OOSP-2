package MenuUI;

import java.util.Scanner;

public class CentralElectionCommissionMenuUI implements Login {
    CentralElectiomCommission CEC = new CentralElectiomCommission();
    @Override
    public void profile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Меню ЦИК----------\n" +
                "Введите 1 чтобы создать голосование\n" +
                "Введите 2 чтобы вывести результаты\n" +
                "Введите 9 чтобы выйти");
        int a = scanner.nextInt();
        if (a == 1 | a == 2| a==9) {
            if (a == 1) {
                CEC.createVoid();
            }
            if (a == 2) {
                CEC.outputResults();
            }
            if (a == 9){
                System.exit(0);
            }
        } else {
            System.out.println("Вы выбрали не существющие действие");
        }
    }
}
