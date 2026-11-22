package practice_5;

import java.util.Scanner;

public class TasksWhile {

    public static void main(String[] args) {

        // 1. Вычисление факториала с помощью while
        // calculatingFactorial();

        // 2. Вывод всех чётных чисел до заданного
        // printEvenNumbers();

        // 3. Обратный отсчёт от введённого числа до 1
        printCountdownFromNumber();


    }

    public static void calculatingFactorial() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // начинаем с 1 чтобы не умножать на 0
        int result = 1;
        // счётчик — начинаем с 1
        int i = 1;

        while (i <= n) {
            //
            result = result * i;
            i++;
        }

        System.out.println(n + "! = " + result);

    }

    public static void printEvenNumbers() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // счётчик начинаем с 1 — по условию "от 1 до n"
        int i = 1;

        while (i <= n) {
            // % — остаток от деления. Если i % 2 == 0 — число чётное
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;   // ОБЯЗАТЕЛЬНО увеличиваем счётчик, иначе вечный цикл

        }
    }


    public static void printCountdownFromNumber() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int n = scanner.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;   // уменьшаем на 1 после каждой итерации
        }
    }

}
