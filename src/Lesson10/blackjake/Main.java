package Lesson10.blackjake;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Diler diler = new Diler();
        Game game = new Game();

        game.addPlayerToGame(diler);
        game.addPlayerToGame(player);

        game.dealTwoCards();
        game.addCardsIfNeed();
        game.printWinner();



    }
}
