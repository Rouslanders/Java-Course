package Lesson14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 5.5, "Золото");
        Coin coin2 = new Coin(5, 1999, 5.5, "Золото");
        Coin coin3 = new Coin(10, 1990, 5.5, "Серебро");
        Coin coin4 = new Coin(25, 1809, 5.5, "Золото");
        Coin coin5 = new Coin(5, 1509, 5.5, "Бронза");

        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            //внутренний безымянный клас -класс без имени, создан внутри дургого класса, создаем единожды объект этого класса
            @Override
            public int compare(Coin o1, Coin o2) {
                return 0;
            }
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        System.out.println(coin1.equals(coin2));



        for (Coin c : coins) {
            System.out.println(c);

        }
    }
}
