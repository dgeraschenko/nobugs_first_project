package practice_5;

import java.util.Scanner;

public class TasksIfElse {

    public static void main(String[] args) {

        // 1.Определение знака числа
        // System.out.println("Введённое число: " + findSignNumber());

        // 2. Поиск наибольшего из двух чисел
        // findMaxOfTwoNumbers();

        // 3. Вывод оценки по шкале 1–5
        // gradePrint();

        // 4. Проверка на чётность
        // System.out.println(checkParity(4));

        // 5. Определение размера скидки по возрасту
        // System.out.println("Ваша скидка: " + checkDiscount(70));

        // 6. Оценка результата теста по баллам
        System.out.println("Ваша оценка: " + testResultByPoints());

    }


    public static String findSignNumber() {

        int number;
        String check_result = "";

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // переменной присваиваем значение введенноё пользователем в консоли
        System.out.print("Введите число: ");
        number = scanner.nextInt();

        if (number > 0) {
            check_result = "положительное";
        } else if (number == 0) {
            check_result = "введён 0";
        } else {
            check_result = "отрицательное";
        }
        return check_result;
    }

    public static void findMaxOfTwoNumbers() {

        int number_1;
        int number_2;

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // переменной присваиваем значение введенноё пользователем в консоли
        System.out.print("Введите первое число: ");
        number_1 = scanner.nextInt();

        // переменной присваиваем значение введенноё пользователем в консоли
        System.out.print("Введите второе число: ");
        number_2 = scanner.nextInt();

        if (number_1 > number_2) {
            System.out.println("Максимально число: " + number_1);
        } else if (number_1 < number_2) {
            System.out.println("Максимально число: " + number_2);
        } else {
            System.out.println("Числа " + number_1 + " и " + number_2 + " равны");
        }
    }

    public static void gradePrint() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку(от 1 до 5): ");
        int grade = scanner.nextInt();

//        String grade_letter = switch (grade) {
//            case 5 -> "Отлично";
//            case 4 -> "Хорошо";
//            case 3 -> "Удовлетворительно";
//            case 1, 2 -> "Неудовлетворительно";
//            default -> "Введите цифры от 1 до 5";
//    }
//        return grade_letter;

        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Ошибка: оценка должна быть от 1 до 5.");
        }

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

    // 5. Определение размера скидки по возрасту
    public static String checkDiscount(int age) {
        // заводим дополнительную переменную
        String discount;

        // если возраст меньше 18
        if (age < 18) {
            discount = "25%";
        }

        // если возраст от 18 до 59
        else if (age >= 65) {
            discount = "30%";
        }

        // если возраст 60 и больше
        else {
            discount = "Скидка не предоставляется";
        }
        return discount;
    }

    // Оценка результата теста по баллам (от 0 до 100)
    public static String testResultByPoints() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        // объявляем дополнительную переменную
        String result;

        System.out.print("Введите свои баллы: ");
        int points = scanner.nextInt();

        // проверяем что введенное число находится в допустимом диапазоне 0-100
        if (points < 0 || points > 100) {
            return "ОШИБКА баллы должны быть от 0 до 100";
        }

        // если баллы более 90
        if (points >= 90) {
            result = "Отлично";
        }
        // если баллы от 75 до 89
        // сюда попадаем, только если первый if был ложным так что "меньше 90" можно не указывать
        else if (points >= 75) {
            result = "Хорошо";
        }

        // если баллы от 60 до 74
        // сюда попадаем, только если первый и второй if был ложным так что "меньше 75" можно не указывать
        else if (points >= 60) {
            result = "Удовлетворительно";
        }

        // если баллы меньше 60
        // сюда попадаем, только если все if-ы выше были ложным так что "меньше 60" можно не указывать
        else  {
            result = "Неудовлетворительно";
        }

        return result;

    }


}
