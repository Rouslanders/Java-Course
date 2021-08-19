package Lesson9;

public class Otziv {
    private User user;
    private int udobstvo;
    private int prostota;
    private int height;

    public Otziv (){

    }

    public Otziv (int udobstvo, int prostota, int height, User user) {
        this.udobstvo = udobstvo;
        this.prostota = prostota;
        this.height = height;
        this.user =user;
    }

    public int summaRating (){
        return udobstvo+prostota+height;
    }

}
