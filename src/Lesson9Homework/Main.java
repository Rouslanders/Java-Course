package Lesson9Homework;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Л.Толстой", 1200, 100);
        Book book2 = new Book("По ком звонит колокол", "Э.Хемингуэй", 550, 22);
        Book book3 = new Book("Повелитель мух", "У.Голдинг", 317, 17);
        Book book4 = new Book("100 лет одиночества", "Г-Г.Маркес", 416, 25);
        Book book5 = new Book("Финансист", "Т.Драйзер", 736, 56);

        Book[] books = {book1, book2, book3, book4, book5};
        Biblioteka lib = new Biblioteka();
        lib.addBook(book5);

    }
}