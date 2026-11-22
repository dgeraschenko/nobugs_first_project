package practice_5;

import java.util.Scanner;

public class TasksFor {

    public static void main(String[] args) {

        // 1. Вывод чисел от 1 до 100, делящихся на 3
        // NumbersDivisibleByThree();

        // 2. Сумма чисел от 1 до n
        // System.out.println("Сумма всех чисел от 1 до введенной пользователем равна: " + sumOfAllNumbers());

        // 3. Таблица умножения для числа
        // multiplyTable(6);

        // 4. Проверка на простое число
        // System.out.println(checkSimpleNumbers(7));

        // 5. Вывод чисел от 1 до 10
        printNumbers(1, 10);

    }

    // вывод чисел которые делятся на 3
    public static void NumbersDivisibleByThree() {
        // начать с 1
        // не останавливаться пока не будет 100
        // каждый шаг + 1
        for (int i = 1; i <= 100; i++) {
            // если делится на 3 без остатка то выводим число
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    public static int sumOfAllNumbers() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int sum = 0;

        // i = 1  -- с чего начинаем
        // i <= n -- продолжаем до n
        // каждый шаг i увеличевается на [1[
        for (int i = 1; i <= n; i++ ) {

            // sum по дефолту = 0
            // i указали в сигнатуре for = 1
            // 1-ая итерация: sum = 0 + 1 = 1

            // sum = 1
            // i = 1 + [1] = 2
            // 2-ая итерация: sum = 1 + 2 = 3

            // sum = 3
            // i = 2 + [1] = 3
            // 3-ая итерация: sum = 3 + 3 = 6

            // sum = 6
            // i = 3 + [1] = 4
            // 4-ая итерация: sum = 6 + 3 = 9
            // и т.д.

            sum = sum + i;
        }
        return sum;
    }

    // таблица умножения
    public static void multiplyTable(int number) {

        // i = 1  -- с чего начинаем
        // i <= 10 -- продолжаем до 10
        // каждый чаг увеличение на 1

        for (int i = 1; i <= 10; i++ ) {

            System.out.println(number + " x " + i + " = " + number * i);
        }
    }


    public static boolean checkSimpleNumbers(int n) {

        // простое число делится на себя и на 1
        // ДОПЗАДАЧА ВЫВЕСТИ ВСЕ ПРОСТЫЕ ЧИСЛА ОТ 1 ДО 100
        // алгоритм: делим число n на все числа от 2 до n-1
        // если хотя бы раз получили остаток от деления 0 то число "НЕ простое"
        // если 0 не было ни разу то число "простое"

        boolean isSimple = true;

        for (int i = 2; i <= n - 1; i++){

            if (n % i ==0) {
                isSimple = false;
                break;
            }

        }
        return isSimple;
    }

    public static void printNumbers(int a, int b) {

        // i = 1  -- с чего начинаем
        // i <= 10 -- продолжаем до 10
        // каждый чаг увеличение на 1

        for (int i = a; i <= b; i++ ) {

            System.out.println(i);
        }
    }


}
