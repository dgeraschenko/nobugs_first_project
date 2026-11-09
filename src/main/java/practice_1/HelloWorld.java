package practice_1;

public class HelloWorld {

    // поле
    static String name = "Dima";
    static int a = 5;
    static int b = 6;



    // методы

    // метод main
    // зеленая стрелочка - запуск программы
     // метод main - точка входа
    public static void main(String[] args) {

        int sum_1 = sum(1, 2);
        int multiply_1 = multiply(5, 8);
        int substr_1 = substruct(30, 20);
        double div_1 = divide(3,2);

        System.out.println("Привет мир!!!");
        System.out.println("Привет " + name + "!!!");
        System.out.println((a + b) * b);
        System.out.println(sum_1);
        System.out.println(multiply_1);
        System.out.println(substr_1);
        System.out.println(div_1);


    }

    public static int sum(int x, int y) {
        // тело метода
        return x + y;
    }

    public static int multiply(int p, int k) {
        return p * k;
    }

    public static int substruct(int d, int e) {
        return d - e;
    }

    public static double divide(int s, int t) {
        return(double) s / t;
    }
}
