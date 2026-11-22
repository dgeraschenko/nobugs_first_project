package practice_5_teacher.lections;

import java.util.Random;
import java.util.Scanner;

public class TaskSolverDoWhile {

    public static void main(String[] args) {

//       findNumber(1);
//        findMin();
        checkCredentials();

    }

    // метод угадываения цифры - программа создаёт рандомное число - пользователь вводит своё
    public static void findNumber(int bound) {
        // создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // генерация рандомного числа от 0 до bound (в примере 5)
        int random = new Random().nextInt(5);

//        System.out.println(random);

        int number;

        // do - делай
        do {
            // переменной присваиваем значение введенноё пользователем в консоли
            System.out.print("Угадай число: ");
            number = scanner.nextInt();
        }
        // while - пока введенное пользователем не будет равно рандомно созданному
        // int эот примитивный тип данных поэтому проверяем не через equals а через !=
        while (number != random);
        System.out.println("Верно!");
    }

    public static void findMin() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // объявляем переменную number
        int number;
        // для корректного выполнения указываем максимально возможное число для int
        // что бы точно записать какой-то минимум надо отталкиваться от максимума
        // и наоборот для того чтобы записать какой то максимум надо отталкиваться от самого минимума
        int min = 2147483647;

        do {
            // переменной присваиваем значение введенноё пользователем в консоли
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            // если number < min то присваиваем переменной min значение number
            if (number < min && number >= 0) min = number;

        } while (number >= 0);

        System.out.println("Минимальное введенное число: " + min);

    }

    public static void checkCredentials() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        String input_login;
        int input_password;

        String current_login = "admin";
        int current_password = 123;

        do {
            // переменной присваиваем значение введенноё пользователем в консоли
            System.out.print("Введите логин: ");
            input_login = scanner.next();

            System.out.print("Введите пароль: ");
            input_password = scanner.nextInt();

        } while (!input_login.equals(current_login) && input_password != current_password);

        System.out.println("Поздравляю! Вы авторизованы");



    }


// скобка закрывающая класс
}
