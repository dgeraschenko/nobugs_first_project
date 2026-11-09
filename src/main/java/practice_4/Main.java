package practice_4;

public class Main {

    static void main() {

        Company employee_1 = new Company(121, "Петров Антон");

        employee_1.printInfo();

        Company employee_2 = new Company(131, "Иванов Антон");

        Company employee_3 = new Company(141, "Семёнов Антон");

        employee_2.printInfo();

        employee_3.printInfo();
        

        employee_1.setEmployeeName("Антон Петренко");
        employee_2.setEmployeeName("Сергей Дроботенко");
        employee_3.setEmployeeName("Денис Вакуленко");

        employee_1.printInfo();
        employee_2.printInfo();
        employee_3.printInfo();

    }
}
