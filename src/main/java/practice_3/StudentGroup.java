package practice_3;

public class StudentGroup {


    // поля groupName и studentCount

    String groupName;
    int studentCount;

    // конструктор
    public StudentGroup(String groupName, int studentCount) {

        this.groupName = groupName;
        this.studentCount = studentCount;

    }

    // геттеры

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return  this.studentCount;
    }

    // сеттеры

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    // методы printInfo()
    void printInfo() {
        System.out.println("Наименование группы: " + groupName);
        System.out.println("Количество студентов: " + studentCount);
    }










}
