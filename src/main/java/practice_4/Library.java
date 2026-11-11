package practice_4;

public class Library {

    // доступ только внутри текущего класса
    private String bookTitle;
    // доступ только внутри текущего пакета, и наследниках
    protected String author;
    // дефолтный - доступен внутри текущего пакета
    int year;
    // доступен отовсюду
    public String category;


    // КОНСТРУКТОР
    public Library(String bookTitle, String author, int year, String category){

        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;

    }

    // геттеры
     String getBookTitle() {
        return  this.bookTitle;
    }

     String getAuthor() {
        return  this.author;
    }

     int getYear() {
        return  this.year;
    }

     String getCategory() {
        return this.category;
    }

    // сеттеры
    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setCategory(String category) {
        this.category = category;
    }


     void printInfo() {
        System.out.println("bookTitle: " + bookTitle);
        System.out.println("author: " + author);
        System.out.println("year: " + year);
        System.out.println("category: " + category);
        System.out.println();
    }



}
