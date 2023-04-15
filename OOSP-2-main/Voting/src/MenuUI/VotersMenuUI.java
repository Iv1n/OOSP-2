package MenuUI;

import VotersService.Voiters;

import java.util.Scanner;

public class VotersMenuUI implements Login {
    @Override
    public void profile() {
        Scanner scanner = new Scanner(System.in);
        Voiters voiters = new Voiters();
        System.out.println("----------Меню Изберателя----------\n" +
                "Введите 1 чтобы зарегестрировать пользователя\n" +
                "Введите 9 чтобы выйти");
        int a = scanner.nextInt();
        if(a==1 | a==9){
            if (a==1){
                voiters.voirterL();
            }
            if (a==9){
                System.exit(0);
            }
        }
        //System.out.println("Вы выбрали не существющие действие");
    }
}
