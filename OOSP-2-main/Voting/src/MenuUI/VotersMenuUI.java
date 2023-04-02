package MenuUI;

import java.util.Scanner;

public class VotersMenuUI implements Login {
    @Override
    public void profile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Меню Изберателя----------\n" +
                "Введите 1 чтобы зарегестрировать пользователя\n" +
                "Введите 2 чтобы голосоват\n" +
                "Введите 3 чтобы просмотртеть список\n" +
                "Введитe 4 чтобы посмотреть все голосования");
        int a = scanner.nextInt();
        if(a==1 | a==2 | a==3 | a==4){
            if (a==1){

            }
            if (a==2){

            }
            if (a==3){

            }
            if (a==4){

            }
        }
        System.out.println("Вы выбрали не существющие действие");
    }
}
