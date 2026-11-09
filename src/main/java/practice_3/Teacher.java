package practice_3;

public class Teacher {

    // поля
    String name;
    String subject;

    // конструктор
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // геттеры
     public String getName() {
        return this.name;
     }

     public String getSubject() {
        return this.subject;
     }

    // сеттеры
    void setName(String name) {

        this.name = name;

    }

    void setSubject(String subject) {

        this.subject = subject;

    }

    // методы printInfo()

    void  printInfo() {
        System.out.println("Имя учителя: " + name);
        System.out.println("Предмет: " + subject);
    }

}
