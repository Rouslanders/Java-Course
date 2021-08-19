package Lesson8;

public class Tour {
    private String country;
    private int daysCount;
    private int starCount;
    private String vehicle;
    private int price;

    public Tour(String country, int daysCount, int starCount, String vehicle, int price) {
        this.country = country;
        this.daysCount = daysCount;
        this.starCount = starCount;
        this.vehicle = vehicle;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

