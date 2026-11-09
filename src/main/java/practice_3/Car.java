package practice_3;

public class Car {

    // поля
    String brand;
    int year;


    // конструктор
    public Car(String brand, int year) {

        this.brand = brand;
        this.year = year;

    }

    // геттеры
    public String getBrand() {
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }

    // сеттеры
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    // методы
    void print(){
        System.out.println("Марка: " + brand);
        System.out.println("Год выпуска: " + year);
    }



}
