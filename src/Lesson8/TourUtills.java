package Lesson8;

public class TourUtills {

    public static void printBusTours(Tour[] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getVehicle().equals("bus")) {
                System.out.println(tours[i].getCountry());
            }
        }
    }

    public static void budgetPerCountry(Tour[] tours, int minPrice, int maxPrice) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getPrice() >= minPrice && tours[i].getPrice() <= maxPrice) {
                System.out.println(tours[i].getCountry());
            }
        }
    }

    public static void mediumPrice(Tour[] tours) {
        int pricetour1 = tours[0].getPrice();
        int pricetour2 = tours[1].getPrice();
        int pricetour3 = tours[2].getPrice();
        int pricetour4 = tours[3].getPrice();
        int pricetour5 = tours[4].getPrice();

        int mediumPrice = (pricetour1 + pricetour2 + pricetour3 + pricetour4 + pricetour5) / 5;
        System.out.println(mediumPrice);

        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getPrice() < mediumPrice) {
                System.out.println(tours[i].getCountry() + " " + tours[i].getPrice());
                // System.out.println(tours[i].getPrice());
            }
        }
    }

    public static void minPriceTour(Tour[] tours) {
        int price1 = tours[0].getPrice();
        int price2 = tours[1].getPrice();
        int price3 = tours[2].getPrice();
        int price4 = tours[3].getPrice();
        int price5 = tours[4].getPrice();

        if (price1 < price2 && price1 < price3 && price1 < price4 && price1 < price5) {
            System.out.println("Самая дешевая цена: " + price1 + " " + tours[0].getCountry());

        } else if (price2 < price1 && price2 < price3 && price2 < price4 && price2 < price5) {
            System.out.println("Самая дешевая цена: " + price1 + " " + tours[1].getCountry());

        } else if (price3 < price1 && price3 < price2 && price3 < price4 && price3 < price5) {
            System.out.println("Самая дешевая цена: " + price1 + " " + tours[2].getCountry());

        } else if (price4 < price1 && price4 < price2 && price4 < price3 && price4 < price5) {
            System.out.println("Самая дешевая цена: " + price1 + " " + tours[3].getCountry());

        } else {
            System.out.println("Самая дешевая цена: " + price1 + " " + tours[4].getCountry());

        }

    }

    public static void starsMoreMedium(Tour[] tours, int minStars) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getStarCount() >= minStars) {
                System.out.println(tours[i].getCountry() + " " + tours[i].getStarCount());
            }
        }

    }

    public static void maxPrice(Tour[] tours) {
        int maxTour = tours[0].getStarCount();
        String maxCountry;
        for (int i = 0; i < tours.length; i++) {

            if (maxTour > tours[i].getPrice()) {
                maxTour = tours[i].getPrice();
                maxCountry = tours[i].getCountry();
            }

        }
    }


}







