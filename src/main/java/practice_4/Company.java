package practice_4;

public class Company {

    // статическое поле общее для всех объектов класса
    static String companyName = "ООО Ромашка";

    // после инициализации этой переменной её нельзя будет изменить
    final int EMPLOYEE_ID;

    // без модификатора доступа - доступна всем в текущем пакете
    String employeeName;

    // конструктор

    public Company(int EMPLOYEE_ID, String employeeName) {

        // после инициализации нельзя будет изменить
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        // можно будет изменить
        this.employeeName = employeeName;

    }

    // геттеры
    String getEmployeeName() {
        return this.employeeName;
    }

    // сеттеры
    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // методы
    static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    void printInfo() {
        System.out.println("companyName: " + companyName);
        System.out.println("employeeID: " + EMPLOYEE_ID);
        System.out.println("employeeName: " + employeeName);
        System.out.println();
    }
}
