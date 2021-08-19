package Lesson8;

public class Main {
    public static void main(String[] args) {
        // People slavik = new People();
        // People vasya = new People();

        // slavik.setPhoneNumber("8987654210");
        // vasya.setPhoneNumber("8940123456");

        // slavik.setName("Славик");
        // slavik.setAge(38);

        // System.out.println(slavik.getAge());

        // Student  student = new Student();

        Tour firstTour = new Tour("Japan", 16, 4, "plane", 34539);
        Tour secondTour = new Tour("Albania", 37, 2, "ship", 66735);
        Tour thirdTour = new Tour("Croatia", 62, 5, "bus", 85362);
        Tour forthTour = new Tour("Malta", 21, 4, "broom", 86320);
        Tour fifthTour = new Tour("Zimbabve", 165, 3, "boat", 47533);
        Tour[] tours = {firstTour, secondTour, thirdTour, forthTour, fifthTour};
       // TourUtills.printBusTours(tours);
       // TourUtills.budgetPerCountry(tours, 50000, 80000);
        TourUtills.mediumPrice(tours);
        TourUtills.minPriceTour(tours);
        TourUtills.starsMoreMedium( tours,4);
        TourUtills.maxPrice(tours);


        //напечатать самый дешевый тур
        //напечатать самый дорогой тур
        //все туры которые такого-то типа, у которых звезд больше чем определенного кол-ва
        //напечатать самые дешевые туоы(ниже средней цены)


//        firstTour.setCountry("Japan");
//        firstTour.setDaysCount(16);
//        firstTour.setPrice(94536);
//        firstTour.setStarCount(4);
//        firstTour.setVehicle("plane");
//
//        secondTour.setCountry("Albania");
//        secondTour.setDaysCount(17);
//        secondTour.setPrice(75800);
//        secondTour.setStarCount(3);
//        secondTour.setVehicle("ship");
//
//        thirdTour.setCountry("Croatia");
//        thirdTour.setDaysCount(20);
//        thirdTour.setPrice(98600);
//        thirdTour.setStarCount(5);
//        thirdTour.setVehicle("bus");

    }
}
