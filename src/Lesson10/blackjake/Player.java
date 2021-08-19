package Lesson10.blackjake;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean winner = true;

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isDiler() {
        return  false;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void addCards(Deck deck) {
        this.printHand();
        System.out.println("Нужна ли еще лдна карта? (Д/Н)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            hand.add(deck.getRandomCard());
            this.addCards(deck);
        }
    }

    public void printHand() {
        System.out.println("---карты в руке---");
        for (Card currentCard : hand) {
            System.out.println(currentCard);
        }
        System.out.println("---конец----");
    }

    public int sumPointsFromHand() {
        int count = 0;
        for (Card currentCard : hand) {
            count = count + currentCard.getValue();
        }
        return count;
    }


}
