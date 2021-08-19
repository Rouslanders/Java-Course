package Lesson9Homework;

public class Book {
    private String name;
    private String author;
    private int countPage;
    private int countPart;

    public Book() {

    }

    public Book(String name, String author, int countPage, int countPart) {
        this.name = name;
        this.author = author;
        this.countPage = countPage;
        this.countPart = countPart;
    }

    public int getCountPage() {
        return countPage;
    }

    public String getName(){
        return name;
    }
}

