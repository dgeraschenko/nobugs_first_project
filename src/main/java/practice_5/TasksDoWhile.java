package practice_5;

import java.util.Scanner;

public class TasksDoWhile {

    public static void main (String[] args) {

        // 1. Запрос положительного числа
        // printPositiveNumber();

        // 2. Проверка пароля
        // checkCredentials();

        // 3. Вывод чисел от 1 до 10 с использованием do-while
        // printNumbers();

        // 4. Завершение программы по команде "exit"
        // exitByCommand();

        // 5. Подсчёт количества цифр в числе
        countNumberDigits();


    }

    public static void printPositiveNumber() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // объявляем переменную number
        int number;

        do {
            // переменной присваиваем значение введенноё пользователем в консоли
            System.out.print("Введите число: ");
            number = scanner.nextInt();


        } while (number <= 0);

        System.out.println("Введено положительное число: " + number);
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

        } while (!input_login.equals(current_login) || input_password != current_password);

        System.out.println("Поздравляю! Вы авторизованы");
    }

    public static void printNumbers() {


        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);



    }

    public static void exitByCommand() {

        String input_text = "";

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите команду: ");
            input_text = scanner.nextLine();
        } while (!input_text.equals("exit"));

        System.out.println("Вы успешно вышли!");
    }

    public static void  countNumberDigits() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        int number = scanner.nextInt();

        // работаем с копией, чтобы в выводе показать исходное число
        int i = number;
        int count = 0;

        do {
            // увеличиваем счётчик на еденицу
            count++;

            // делим на 10 — отбрасываем дробную часть
            // temp: 1234 / 10 → 123
            // temp: 123 / 10 → 12
            // temp: 12 / 10 → 1
            // temp: 1 / 10 → 0
            i = i / 10;

        // повторяем, пока не останется 0
        } while (i != 0);

        System.out.println("В числе " + number + " цифр: " + count);







    }


}
