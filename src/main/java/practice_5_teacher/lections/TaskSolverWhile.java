package practice_5_teacher.lections;

import java.util.Scanner;

public class TaskSolverWhile {

    public static void main(String[] args) {

//        printAllNumbersBefore10(5);
//        commandReader();
        System.out.println(sumOfDigits(11001));

    }

    public static void printAllNumbersBefore10(int n) {
        // создаём счетчик
        int i = 1;

        // прописывем сигнатуру
        // пока i меньше  10
        while (i <= n) {
            System.out.println(i);
            // обязательно увеличиваем счётчик на 1
            i++;
        }

    }

    public static void commandReader() {

        // создаём экземпляр класса для ввода данных от пользователя
        Scanner scanner = new Scanner(System.in);

        // создаём переменную для хранения полученных данных от пользователя
        String command = " ";
        String current_command = "exit";

        // пока данные от пользователя(command)  не будут соответствовать ожидаемым (current_command)
        // не примитивные типы данных сравниваем только через equals  !!!!!!!!
        while (!command.equals(current_command)) {

            // присваиваем переменной данные полученные от пользователя
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }
    }


    public static int sumOfDigits(int number) {

        // number = 123; 1 + 2 + 3
        // остаток от деления 123 на 10: 123 % 10 = 3
        // 123 / 10 = 12 (+ 3)
        // остаток от деления 12 на 10: 12 % 10 = 2
        // 12 / 10 = 1 (+ 2)
        // остаток от деления 1 на 10: 1 % 10 = 0.1 = 1

        // объявляем переменную для хранения данных
        int sum = 0;

        while (number > 0) {

            // сумма = сумма + остаток от деления на 10
            // первая итерация это 0 + 3
            sum = sum + number % 10;

            // дальше делим на 10, отбразывает после запятой
            number = number / 10;


        }

        return sum;


    }

}
