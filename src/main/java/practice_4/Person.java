package practice_4;

public class Person {

    // поля класса
    private String firstName;
    private String lastName;
    private final String ssn;

    // конструктор

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // геттеры
    String getFirstName() {
        return  this.firstName;
    }

    String getLastName() {
        return  this.lastName;
    }

    String getSsn() {
        return  this.ssn;
    }

    // сеттеры
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // методы
    void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", " + "Фамилия: " + lastName + ", " + "SSN: " + ssn);
        System.out.println();
    }

}
