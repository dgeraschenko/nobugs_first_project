package practice_2;

import practice_4.Library;

public class MathOperations {

    public static void main(String[] args) {

        int add_1 = add(4, 6);

        System.out.println("Сумма: " + add_1);

        int subtract_1 = subtract(9, 5);

        System.out.println("Разность: " + subtract_1);

        int multiply_1 = multiply(7, 8);

        System.out.println("Сумма: " + multiply_1);

        double divide_1 = divide(20, 9);

        System.out.println("Деление: " + divide_1);

        int findMax_1 = findMax(19, 18);

        System.out.println("Максимум: " + findMax_1);


        int difference_1 = difference(19, 5);

        System.out.println("Разница: " + difference_1);


        int squareArea_1 = squareArea(5);

        System.out.println("Площадь: " + squareArea_1);

        int squarePerimetr_1 = squarePerimetr(7);

        System.out.println("Периметр: " +squarePerimetr_1);

        double secondsToMinutes_1 = secondsToMinutes(120);

        System.out.println("Секунды в минуты: " + secondsToMinutes_1);


        double averageSpeed_1 = averageSpeed(120,360);

        System.out.println("Средняя скорость: " + averageSpeed_1 + " км/ч");

        double findHypotenuse_1 = findHypotenuse(2.0, 3.0);

        System.out.println("Гипотенуза: " + findHypotenuse_1);

        double circleCircumference_1 = circleCircumference(30);

        System.out.println("Длина окружности: " + circleCircumference_1);


        double calculateProcent_1 = calculateProcent(50, 10);

        System.out.println("Процент: " + calculateProcent_1);


        double celsiusToFahrenheit_1 = celsiusToFahrenheit(30.0);

        System.out.println("С2F: " + celsiusToFahrenheit_1);


        double fahrenheitToCelsius_1 = fahrenheitToCelsius(86.0);

        System.out.println("F2C: " + fahrenheitToCelsius_1);



    }

    public static int add(int a, int b) {

        // тело метода
        return a + b;

    }

    public static int subtract(int c, int d) {

        // тело метода
        return c - d;

    }

    public static int multiply(int e, int f) {

        // тело метода
        return e * f;


    }

    public static double divide(int g, int h) {

        // тело метода
        return(double) g / h;


    }

    public static int findMax(int i, int j) {

        // тело метода
        return Math.max(i, j);


    }


    public static int difference(int k, int l) {

        // тело метода
        return Math.abs(k - l);


    }


    public static int squareArea(int m) {

        // тело метода
        return m * m;


    }

    public static int squarePerimetr(int n) {

        // тело метода
        return n * 4;


    }


    public static double secondsToMinutes(int o) {

        // тело метода
        return(double) o / 60;


    }



    public static double averageSpeed(double distance_km, double time_min) {

        // тело метода
        double time_hour = time_min / 60;
        return(double) distance_km / time_hour;


    }

    public static double findHypotenuse(double catet_1, double catet_2) {

        // Hypotenuse * Hypotenuse = catet_1 * catet_1 + catet_2 * catet_2
        double catet_1_square = Math.pow(catet_1, 2);
        double catet_2_square = Math.pow(catet_2, 2);

        double summ_catets_square = catet_1_square + catet_2_square;

        double hipotenuse = Math.sqrt(summ_catets_square);


        return(double) hipotenuse;


    }


    public static double circleCircumference(double radius) {

        // 2 * pi_ * radius

        return(double) 2 * Math.PI * radius;


    }


    public static double calculateProcent(int total, int part) {

        // (part / total) * 100

        return(double) part / total * 100;


    }



    public static double celsiusToFahrenheit(double celsius) {

        return(double) (celsius * 9/5) + 32;


    }


    public static double fahrenheitToCelsius(double fahrenheit) {

        return(double) (fahrenheit - 32) * 5/9;


    }




}
