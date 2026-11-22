package practice_5;

import java.util.Scanner;

public class TasksBreakContinue {

    public static void main(String[] args) {

        // 1. Сумма чисел до первого отрицательного (использовать break)
        // sumUntilNegative();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        // skipMultiplesOfThree();

        // 3. Вывод только положительных чисел (использовать continue)
        // onlyPositiveNumbers();

        // 4. Ввод строк до команды "stop" (использовать break)
        readUntilStop();
    }

    public static void sumUntilNegative() {

        Scanner scanner = new Scanner(System.in);

        // накапливаем сумму — начинаем с 0
        int sum = 0;

        while (true) {   // "крутись вечно" — выйдем через break
            System.out.print("Введите число (отрицательное — стоп): ");

            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Введено отрицательное число — завершаем.");
                break;   // ← ВЫХОД из цикла, дальше не идём
            }

            sum = sum + number;   // или короче: sum += number;
        }

        System.out.println("Сумма введённых чисел: " + sum);
    }


    public static void skipMultiplesOfThree() {

        // начинаем с 1 (хотя можно с 3)
        // останавливаемся на 20
        // добавляем 1 к i каждую итерацию
        for (int i = 1; i <= 20; i++) {

            // если число делится на 3 — пропускаем его
            if (i % 3 == 0) {
                // continue игнорирует println который ниже,
                // идём наверх к сигнатуре for где i++
                // добавляем 1 к i и опять делим на 3
                continue;
            }
            // выводим только те числа которые делятся на 3 с остатком
            System.out.println(i);
        }
    }


    public static void onlyPositiveNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводите целые числа (0 — завершить, отрицательные пропускаются):");

        // бесконечный цикл пока не остановим через brake
        while (true) {

            // xbckf ghbybvftv jn gjkmpjdfntkz bp rjycjkb
            int number = scanner.nextInt();

            // 0 - команда на выход
            if (number == 0) {
                System.out.println("Завершаем. Введён 0.");
                // выходим из цикла
                break;
            }

            // если отрицательное то не выводим в консоль но цикл продолжаем (continue)
            if (number < 0) {
                // пропускаем println, идём к следующей итерации
                continue;
            }

            // если положительное то печатаем в консоль и идём на цикл снова
            System.out.println("Положительное число: " + number);
        }
            // после brake идём сюда и выводим текст завершения
            System.out.println("Программа завершена.");
    }


    public static void readUntilStop() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводите строки (\"stop\" — завершить):");

        while (true) {   // "крутись вечно" — выйдем через break

            // принимаем введённый пользователем текст
            String line = scanner.nextLine();

            // если stop - завершаем через break
            if (line.equals("stop")) {
                System.out.println("Завершаем по команде stop");
                // выход из цикла
                break;
            }

            // если НЕ-"stop" то выводим строку в консоль
            System.out.println("Вы ввели: " + line);
        }

        // после brake идём сюда и выводим текст завершения
        System.out.println("Программа завершена.");
    }
}

























