package Lesson9Homework;

public class Biblioteka {

    Book[] books = new Book[1000];

    public Biblioteka() {

    }


    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void maxPage(Book[] books) {
        int maxPage = books[0].getCountPage();
        for (int i = 0; i < books.length; i++) {

            if (maxPage > books[i].getCountPage()) {
                maxPage = books[i].getCountPage();
                String maxBook = books[i].getName();

            }
        }


    }
}
