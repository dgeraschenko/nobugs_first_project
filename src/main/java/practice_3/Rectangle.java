package practice_3;

public class Rectangle {


    // поля
    int width;
    int height;

    // конструктор
    public Rectangle(int width, int height){

        this.width = width;
        this.height = height;

    }

    // геттеры
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }

    // сеттеры
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // методы

    public int calculateArea(){
        return width * height;
    }

    void print(){
        System.out.println("Высота :" + height);
        System.out.println("Ширина :" + width);
    }




}
