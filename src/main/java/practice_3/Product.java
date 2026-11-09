package practice_3;

public class Product {

    // поля name и price
    String name;
    double price;

    // конструктор
    public Product(String name, double price) {

        this.name = name;
        this.price = price;

    }

    // геттеры
    public String getName() {
        return  this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // сеттеры
    void  setPrice(double price) {
        this.price = price;
    }

    // методы  applyDiscount(discount) для применения скидки (price / 100) * discount
    public void applyDiscount(int discount_percent) {

        double discount_summ = (price / 100) * discount_percent;
        double discount_price = price - discount_summ;
        setPrice(discount_price);

    }


    // метод printInfo()
    void printInfo() {

        System.out.println("Название продукта: " + name);
        System.out.println("Стоимость продукта: " + price);


    }



}
