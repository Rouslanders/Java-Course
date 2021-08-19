package Lesson12;

public class GermanTour implements ITour {


    @Override
    public int getCost() {
        return 150000;
    }

    @Override
    public String getCountry() {
        return "Гермнания";
    }

    public String toString() {
        return"Тур в Германию по цене 150 000 руб";
    }
}
