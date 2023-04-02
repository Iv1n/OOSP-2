package MenuUI;

import java.util.Scanner;

public class CandidateMenuUI implements Login {
    @Override
    public void profile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Меню кандидата----------\n" +
                "Введите 1 чтобы внести данные\n" +
                "Введите 2 чтобы вывести результаты голосования\n" +
                "Введите 3 чтобы вывести все голосования");
        int a = scanner.nextInt();
        if(a==1 | a==2 | a==3){
            if (a==1){

            }
            if (a==2){

            }
            if (a==3){

            }
        }
        else {
            System.out.println("Вы выбрали не существющие действие");
        }
    }
}
