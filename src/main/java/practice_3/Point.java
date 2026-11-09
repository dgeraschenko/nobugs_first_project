package practice_3;

public class Point {


    // поля

    int x;
    int y;

    // конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // геттеры
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // сеттеры
    void setX(int x) {
        this.x = x;
    }

    // методы
    void print() {
        System.out.println("Координата Х: " + x);
        System.out.println("Координата У: " + y);
    }





}
