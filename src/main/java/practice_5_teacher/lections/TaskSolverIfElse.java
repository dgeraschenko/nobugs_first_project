package practice_5_teacher.lections;

public class TaskSolverIfElse {

    // метод main точка входа
    public static void main(String[] args) {
        System.out.println(TaskSolverIfElse.checkParity(2));
        System.out.println(TaskSolverIfElse.checkAge(30));
        System.out.println(TaskSolverIfElse.checkMax(330,330,531));
    }

    // объявляем метод для проверки на корректность
    // метод статический, вызываем через класс
    public static String checkParity(int number) {
        // заводим дополнительную переменную
        String parity = "Нечетное";
        // исли остаток от деления на 2 = 0 то число чётное
        if (number % 2 == 0) {
            parity =  "Четное";
        }
        return parity;
    }

    public static String checkAge(int age) {
        // заводим дополнительную переменную
        String ageDescription;
        // если возраст меньше 18
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        // если возраст от 18 до 59
        else if (age < 60 && age >= 18) {
            ageDescription = "Взрослый";
        }
        // если возраст 60 и больше
        else {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    public static int checkMax(int a, int b, int c) {

        int maxAB = b;

        if (a > b) {
            maxAB = a;
        }
        if (c > maxAB) {
            maxAB = c;
        }
        return maxAB;
    }

}
