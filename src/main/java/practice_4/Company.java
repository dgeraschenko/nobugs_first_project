package practice_4;

public class Company {


    // поля
    static String companyName;

    static {
        companyName = "ООО Ромашка-22";
    }

    final int employeeID = 101;

    String employeeName;


    // конструктор
    public Company(int employeeID, String employeeName) {

        this.employeeName = employeeName;

    }

    // геттеры
    public String getEmployeeName() {
        return this.employeeName;
    }


    // сеттеры
    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // print

    void  printInfo() {

        System.out.println("companyName: " + companyName);
        System.out.println("employeeID: " + employeeID);
        System.out.println("employeeName: " + employeeName);


    }


}
