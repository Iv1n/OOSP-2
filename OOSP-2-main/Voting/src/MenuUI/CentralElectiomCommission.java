package MenuUI;

import CECService.CreateVoid;
import DataBase.DataBaseHendlerPeople;

import java.util.Scanner;

public class CentralElectiomCommission {
    CreateVoid createVoid = new CreateVoid();
    Scanner scanner = new Scanner(System.in);
    String[] caldidate;

    /*
    Когда заходим в это меню у нас есть на выбор 1) создать голосование 2) посмотреть прошлые голосования.

    Если мы выбрали создать голосование(цифра 1), то создаем голосование с его окончанием, которое необходимо указать,
    после чего нас перенаправляет в окно, где необходимо выбрать кандидатов, после чего нас переносит в окно 1).

    Если мы выбрали посмотреть прошлые результаты(цифра 2), то нас переносит в окно, где мы выбираем с начала группировки,
    после чего метод сортировки, после чего можно выбрать либо одно голосование, лиюбо все.
     */
    public void createVoid() {

        System.out.println("Введите название голосования");
        String nameVoid = scanner.nextLine();

        System.out.println("Какая категория выборов\n" +
                "1) Если региональные\n" +
                "2) Если областные\n" +
                "3) Если всеросийские");

        String kindOfVoiting = null;
        int num;
        num = scanner.nextInt();
        if (num == 1 | num == 2 | num == 3) {
            if (num == 1) {
                kindOfVoiting = "Региональные";
            }
            if (num == 2) {
                kindOfVoiting = "Областные";
            }
            if (num == 3) {
                kindOfVoiting = "Всеросийское";
            }
        }
        else {
                System.out.println("Вы выбрали не сущетвующию категорию");
            }

        System.out.println("Введите дату окончания" +
                "В формате год-месяц-дата");
        String expiratiomDate = scanner.next();


        System.out.println("Если вы хотите выбрать существющих кандидатов, то введите 1\n" +
                "Если хотите добавить кандидата, то введите 2\n" +
                "Если хотите выйти в меню ЦИК, то введите 9");
        num = scanner.nextInt();
        if (num == 1 | num == 2 | num == 9) {
            if (num == 1) {
                voidC(nameVoid,kindOfVoiting,expiratiomDate);
            }
            if (num == 2) {
                addCandidate();
                voidC(nameVoid,kindOfVoiting,expiratiomDate);
            }
            if (num == 9) {
                CentralElectionCommissionMenuUI CECMUI = new CentralElectionCommissionMenuUI();
                CECMUI.profile();
            }
        }


    }
    public void addCandidate(){
        System.out.println("Введите ФИО");
        Scanner scanner = new Scanner(System.in);
        String namePeople = scanner.nextLine();

        System.out.println("Введите дату рождения в формате год-месяц-число");
        String dateBorne = scanner.nextLine();

        System.out.println("Выберите пол:\n" +
                "1) Мужской\n" +
                "2) Женский");
        int num = scanner.nextInt();
        String gender = null;
        String jobTitle = "Кандидат";
        if(num==1 | num==2) {
            if (num == 1) {
                gender = "Мужской";
            }
            if (num == 2) {
                gender = "Женский";
            }
        }
        else {
            System.out.println("Прочтите учебник биологии");
            System.exit(0);
        }
        DataBaseHendlerPeople dataBaseHendlerPeople = new DataBaseHendlerPeople();
        dataBaseHendlerPeople.addPeople(namePeople,dateBorne,gender,jobTitle);
    }

    public void outputResults(){
        //Здесь надо будет сделать возможность выбирать действия
        //1) Выбор группирповки
        //Группировать по году/виду голосования
        //2) Выбор сортировки
        //Сортировать по дате...
        System.out.println("Введиет цифру 1 если хотите сортировать от старых к недавним\n" +
                "Введите цифру 2 если хотите сортировать от новых к старым\n");
        int numSortiro;
        numSortiro = scanner.nextInt();
        if (numSortiro == 1 | numSortiro == 2){
            if(numSortiro == 1){

            }
            if(numSortiro == 2){

            }
        }
        else {
            System.out.println("Вы выбрали не существующий метод сортировки");
            System.exit(0);
        }
    }
    public void voidC(String nameVoid,String kindOfVoiting,String expiratiomDate){
        System.out.println("Выберите кандидатов");
        createVoid.listCandidate();

        System.out.println("Введите номера кандидатов через,");
        String str = scanner.next();
        String delimer = ",";
        caldidate = str.split(delimer);
        //createVoid.choisCandidate(caldidate);

        createVoid.ss(nameVoid,kindOfVoiting,expiratiomDate,caldidate);
        CentralElectionCommissionMenuUI CECMUI = new CentralElectionCommissionMenuUI();
        CECMUI.profile();
    }

    public void sortOldNewDate(){

    }

    public void sortNewOldDate(){

    }

}

