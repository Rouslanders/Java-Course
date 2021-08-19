package Lesson12;

public class ItalianTour implements ITour {


    @Override
    public int getCost() {
        return 100000;
    }

    @Override
    public String getCountry() {
        return "Италия";
    }

    public String toString() {
            return"Тур в Италию по цене 100 000 руб";
}
}
