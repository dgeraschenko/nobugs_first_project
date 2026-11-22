package practice_5_teacher.lections;

import java.util.Scanner;

public class TaskSolverFor {


    public static void main(String[] args) {
        // проверка таблицы умножения для числа
        multiplyTable(2);
        // проверка суммы всех чисел
        System.out.println(sumOfAllNumbers(3));
        // проверка простое число или нет
        System.out.println(checkSimpleNumbers(8));

        //
        printAllSimpleNumbers();

    }

    public static void multiplyTable(int number) {

        // i = 1  -- с чего начинаем
        // i <= 10 -- продолжаем до 10
        // каждый чаг увеличение на 1

        for (int i = 1; i <= 10; i++ ) {

            // надо number умножать на i и каждую итерацию i увеличивать на 1
           System.out.println(number + " x " + i + " = " + number * i);
        }
    }



    public static int sumOfAllNumbers(int n) {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели цифрой(от 1 до 7): ");
        int day = scanner.nextInt();


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

    public static void printAllSimpleNumbers() {
        for (int i = 1; i <= 100; i++){
            boolean result = checkSimpleNumbers(i);
            if (result) {
                System.out.println("число " + i + " простое");
            }
        }
    }


}
