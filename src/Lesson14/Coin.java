package Lesson14;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private double diagonal;
    private String metall;

    public Coin(int nominal, int year, double diagonal, String metall) {
        this.nominal = nominal;
        this.year = year;
        this.diagonal = diagonal;
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public String toString() {
        return "монета {" +
                "номинал = " + nominal +
                ", год выпуска = " + year +
                ", диаметр = " + diagonal +
                ", металл = '" + metall + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.nominal != o.nominal) {
            return this.nominal - o.nominal;

        }

        if (this.year != o.year){
            return  this.year - o.year;
        }

        if (this.diagonal != o.diagonal){
            return Double.compare(this.diagonal,o.diagonal);

        }


        return this.metall.compareTo(o.metall);
    }
}
