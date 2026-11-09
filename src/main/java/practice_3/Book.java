package practice_3;

public class Book {

    // поля
    String title;
    String author;

    // конструктор

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // геттеры
    public String getTitle(){
        return  this.title;
    }

    public String getAuthor() {
        return this.title;
    }


    // сеттеры
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    // методы
    void printInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
    }



}
