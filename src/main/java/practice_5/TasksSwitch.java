package practice_5;

import java.util.Scanner;

public class TasksSwitch {

    public static void main(String[] args) {

        // 1. Вывод дня недели по номеру
        // System.out.println(TaskSolverSwitch.dayOfWeek(15));

        // 2. Стоимость билета по дню недели
        // printPriceTicket();

        // 3. Перевод числовых оценок в буквенные (A–F)
        // System.out.println(convertNumericGradeToLetter());

        // 4. Обработка текстовых команд
        // processTextCommands();

        // 5. Простой калькулятор с использованием switch
        calculator();

    }


    public static String dayOfWeek(int day) {

        String dayOfWeek = "";

//        String dayOfWeek = switch (day) {
//            case 1 -> "Понедельник";
//            case 2 -> "Вторник";
//            case 3 -> "Среда";
//            case 4 -> "Четверг";
//            case 5 -> "Пятница";
//            case 6 -> "Суббота";
//            case 7 -> "Воскресенье";
//            default -> "Введите цифры от 1 до 7";
//        };

        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek="Введите цифры от 1 до 7";
        }
        return dayOfWeek;

    }


    public static void printPriceTicket() {

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели цифрой(от 1 до 7): ");
        int day = scanner.nextInt();

        switch (day) {

//            case 1, 2, 3, 4, 5 -> System.out.println("Цена билета 300 рублей");
//            case 6, 7 -> System.out.println("Цена билета 450 рублей");
//            default -> System.out.println("Ошибка: день недели необходимо указать цифрой от 1 до 7.");

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Цена билета 300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("Цена билета 450 рублей");;
                break;
            default:
                System.out.println("Ошибка: день недели необходимо указать цифрой от 1 до 7.");
        }
    }

    public static String convertNumericGradeToLetter() {

        String letter_grade;

        // сразу создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите баллы(от 0 до 100): ");
        int numeric_grade = scanner.nextInt();

        // проверяем что введенное число находится в допустимом диапазоне 0-100
        if (numeric_grade < 0 || numeric_grade > 100) {
            return "ОШИБКА баллы должны быть от 0 до 100";
        }

        // если возраст меньше 18
        if (numeric_grade >= 90) {
            letter_grade = "A";
        }

        // если баллы от 75 до 89
        // сюда попадаем, только если первый if был ложным так что "меньше 90" можно не указывать
        else if (numeric_grade >= 80) {
            letter_grade = "B";
        }

        // если баллы от 60 до 74
        // сюда попадаем, только если первый и второй if был ложным так что "меньше 75" можно не указывать
        else if (numeric_grade >= 70) {
            letter_grade = "C";
        }

        // если баллы от 60 до 74
        // сюда попадаем, только если первый и второй if был ложным так что "меньше 75" можно не указывать
        else if (numeric_grade >= 60) {
            letter_grade = "D";
        }

        // если баллы меньше 60
        // сюда попадаем, только если все if-ы выше были ложным так что "меньше 60" можно не указывать
        else  {
            letter_grade = "F";
        }

        return letter_grade;

    }

    public static void processTextCommands() {

        // создаём считыватель ввода
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду (start / stop / restart / status): ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Система работает штатно");
                break;

            default:
            System.out.println("Ошибка: неизвестная команда " + command);
    }

    }

    public static void calculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number_1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number_2 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        double result;
        switch (operator) {
            case "+":
                result = number_1 + number_2;
                break;
            case "-":
                result = number_1 - number_2;
                break;
            case "*":
                result = number_1 * number_2;
                break;
            case "/":
                // проверка деления на 0 ДО самого деления
                if (number_2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                    return;
                }
                result = (double) number_1 / number_2;
                break;
            default:
                System.out.println("Ошибка: неизвестный оператор " + operator + " .");
                return;
        }

        System.out.println(number_1 + " " + operator + " " + number_1 + " = " + result);
    }






}
