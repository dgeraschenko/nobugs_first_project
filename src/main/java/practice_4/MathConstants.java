package practice_4;

public class MathConstants {

    static final double PI = 3.14159;

    static final double E = 2.71828;

    double radius;


    // статический метод площади круга
    static double calculateCircleArea(double radius){

        return PI * radius * radius;

    }

    //статический метод длины окружности
    static double calculateCircumference(double radius) {

        return 2 * PI * radius;

    }

    // метод экспоненциального роста

    static double calculateExponentialGrowth(double initialValue, double rate, double time) {

        double result = rate * time;

        return  initialValue * Math.pow(E, result);

    }

}
