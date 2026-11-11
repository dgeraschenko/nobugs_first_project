package practice_4;

public class University {

    static String universityName = "МГУ";
    final int studentID;
    String studentName;

   // геттер
    public String getStudentName() {
        return this.studentName;
    }

    // конструктор
    public University(int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;

    }


//    методы
    static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    void printInfo() {
        System.out.println("universityName: " + universityName);
        System.out.println("studentID: " + studentID);
        System.out.println("studentName: " + studentName);
        System.out.println();
    }




}
