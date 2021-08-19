package Lesson16;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();

        Tovar tovar1 = new Tovar(12312, "Монитор", 12000);
        Tovar tovar2 = new Tovar(12112, "Мышка  Logitech", 499);
        Tovar tovar3 = new Tovar(12313, "Моноблок Lenovo", 39000);
        Tovar tovar4 = new Tovar(434, "Батарейка Lurasel", 100);
        Tovar tovar5 = new Tovar(545, "Телефон Samsung", 23000);

        sklad.addTovar(tovar1, 10);
        sklad.addTovar(tovar1, 15);
        sklad.addTovar(tovar2, 344);
        sklad.addTovar(tovar3, 34);
        sklad.addTovar(tovar4, 66);
        sklad.addTovar(tovar5, 6);

        sklad.deleteTovar(tovar1, 5);
        System.out.println();
    }


}
