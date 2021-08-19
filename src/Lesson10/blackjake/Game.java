package Lesson10.blackjake;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();


    public void addPlayerToGame(Player player) {
        players.add(player);
    }


    public void dealTwoCards() {
        for (Player curretPlayer : players) {
            curretPlayer.addCardToHand(deck.getRandomCard());
            curretPlayer.addCardToHand(deck.getRandomCard());
        }

    }

    public void addCardsIfNeed() {
        for (Player currentPlayer : players) {
            currentPlayer.addCards(deck);  //полиморфизм
        }

    }

    public void printWinner() {

        for (Player currentPlayer : players) {
            if (currentPlayer.sumPointsFromHand() > 21) {
                currentPlayer.setWinner(false);
            }
        }

        if (this.countWinners() == 0) {
            System.out.println("Победил крупье");
            for (Player currentPlayer : players) {
                if (currentPlayer.isDiler()) {
                    currentPlayer.printHand();
                    return;
                }
            }
        }

        if (this.countWinners() == 1) {
            System.out.println("Победитель ------");
            for (Player currentPlayer : players) {
                if (currentPlayer.isWinner()) {
                    currentPlayer.printHand();
                    return;
                }
            }
        }

        Player winner = null;
        for (Player currentPlayer : players) {
            if (winner == null && currentPlayer.isWinner()) {
                winner = currentPlayer;
            }

            if (currentPlayer.sumPointsFromHand() > winner.sumPointsFromHand() && currentPlayer.isWinner()) {
                winner = currentPlayer;
            }
        }

        System.out.println("Победитель ");
        winner.printHand();

    }

    public int countWinners() {
        int count = 0;
        for (Player currentPlayer : players) {
            if (currentPlayer.isWinner()) {
                count++;
            }
        }
        return count;
    }


}
