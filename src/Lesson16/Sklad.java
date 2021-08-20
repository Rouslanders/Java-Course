package Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Sklad {
    private HashMap<Tovar, Integer> tovars = new HashMap<>();

    public void addTovar(Tovar tovar, int value) {
        if (tovars.containsKey(tovar)) {
            int currentValue = tovars.get(tovar);
            tovars.put(tovar, value + currentValue);
        } else {
            tovars.put(tovar, value);
        }

    }

    public void deleteTovar(Tovar tovar, int value) {
        if (!tovars.containsKey(tovar)) {
            System.out.println(" Такого товара на складе нет");
            return;
        }

        if (value > tovars.get(tovar)) {
            System.out.println(" Товара на складе недостаточно ");
            tovars.remove(tovar);
            return;
        }

        tovars.put(tovar, tovars.get(tovar) - value);

    }

    public void printAllTovars() {
        for (Tovar t : tovars.keySet()) {
            System.out.println(t.getName() + " - " + tovars.get(t));
        }
    }

    //ниже аналогичный метод
    public void printAllTovars2() {
        for (Map.Entry<Tovar, Integer> para : tovars.entrySet()) {
            System.out.println(para.getKey().getName() + " - " + para.getValue());
        }
    }

    public Tovar getMinCountTovar() {
        Tovar minTovar = null;
        for (Tovar t : tovars.keySet()) {
            if (minTovar == null) {
                minTovar = t;
            } else {
                if (tovars.get(t) < tovars.get(minTovar)) {
                    minTovar = t;
                }
            }
        }
        return minTovar;
    }

    public int getMaxPriceTovar() {
        int maxPrice = 0;
        for (Tovar t : tovars.keySet()){
            if (t.getPrice() > maxPrice){
                maxPrice = t.getPrice();

            }
        }
        return maxPrice;
    }

    public int getAllPriceTovar (){
        int priceAll = 0;
        for (Tovar t : tovars.keySet()){
        priceAll= priceAll + tovars.get(t)*t.getPrice();
        }

        return priceAll;
    }

}
