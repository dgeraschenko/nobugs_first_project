package practice_3;

public class Circle {

    // поля
    double radius;

    // конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // геттеры
    double getRadius() {
        return this.radius;
    }

    // сеттеры
    void setRadius(double radius) {
        this.radius = radius;
    }

    // метод calculateArea()PI*R*R и calculateCircumference()
    public double calculateArea(double radius) {

        double area_circle = Math.PI * radius * radius;

        return area_circle;

    }


    // метод calculateCircumference() -- 2 * PI * R
    public  double calculateCircumference(double radius) {

        double circle_circumference = 2 * Math.PI * radius;

        return  circle_circumference;

    }

}
