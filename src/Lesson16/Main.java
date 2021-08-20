package Lesson16;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();

        Tovar tovar1 = new Tovar(12312, "Монитор", 12000);
        Tovar tovar2 = new Tovar(12112, "Мышка  Logitech", 499);
        Tovar tovar3 = new Tovar(12313, "Моноблок Lenovo", 39000);
        Tovar tovar4 = new Tovar(434, "Батарейка Durasel", 100);
        Tovar tovar5 = new Tovar(545, "Телефон Samsung", 23000);

        sklad.addTovar(tovar1, 10); //10
        sklad.addTovar(tovar1, 10); //15
        sklad.addTovar(tovar2, 10); //344
        sklad.addTovar(tovar3, 10); //34
        sklad.addTovar(tovar4, 10); //66
        sklad.addTovar(tovar5, 10); //6

      //  sklad.deleteTovar(tovar1, 5);
        sklad.printAllTovars2();
       // System.out.println(sklad.getMinCountTovar());

        //вернуть самый дорогой товар
        //посчитать общую стоимость всех товаров на складе
        System.out.println(sklad.getMaxPriceTovar());
        System.out.println(sklad.getAllPriceTovar());


    }


}
