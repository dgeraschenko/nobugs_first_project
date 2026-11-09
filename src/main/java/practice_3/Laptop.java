package practice_3;

public class Laptop {

    // поля brand и price
    String brand;

    int price;

    // конструктор
    public Laptop(String brand, int price) {

        this.brand = brand;
        this.price = price;

    }

    // геттеры
    public String getBrand() {
        return  this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    // сеттеры
    public  void  setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // методы
    void printInfo() {
        System.out.println("Название модели: " + brand);
        System.out.println("Стоимость модели: " + price);
    }



}
