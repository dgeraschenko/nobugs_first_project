package practice_4;

public class Main {

    public static void main(String[] args) {

        Company.printCompanyName();

        Company employee_1 = new Company(101, "Антон Петров");

        Company employee_2 = new Company(102, "Семён Иванов");

        employee_1.printInfo();
        employee_2.printInfo();

        Company.companyName = "ООО НОРД";

//        employee_1.employeeID = 190;

        employee_1.printInfo();
        employee_2.printInfo();

        double result_1 = MathConstants.calculateCircleArea(7.3);

        System.out.println(result_1);

        double result_2 = MathConstants.calculateCircumference(9.0);

        System.out.println(result_2);

        double result_3 = MathConstants.calculateExponentialGrowth(100.0, 0.1, 10.0);

        System.out.println(result_3);

        University student_1 = new University(1001, "Антон Антонов");
        University student_2 = new University(2002, "Сергей Сергеев");
        University student_3 = new University(3003, "Михаил Михайлов");

        student_1.printInfo();
        student_2.printInfo();
        student_3.printInfo();

        University.changeUniversityName("СПБГУ");

        student_1.printInfo();
        student_2.printInfo();
        student_3.printInfo();

        GameSettings game_1 = new GameSettings("Poker", 25);
        GameSettings game_2 = new GameSettings("Durak", 15);

        game_1.printGameStatus();
        game_2.printGameStatus();

        GameSettings.setMaxPlayers(44);
        game_1.addPlayer();
        game_2.addPlayer();

        game_1.printGameStatus();
        game_2.printGameStatus();


        Person person_1 = new Person("Anton", "Antonov", "12FG444-BN");
        Person person_2 = new Person("John", "Black", "33KGI44-BN");

        person_1.printPersonInfo();
        person_2.printPersonInfo();

        person_1.setFirstName("Simon");
        person_1.setLastName("Smith");

        person_1.printPersonInfo();
        person_2.printPersonInfo();




    }

}
