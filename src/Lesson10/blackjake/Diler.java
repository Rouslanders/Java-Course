package Lesson10.blackjake;

public class Diler extends Player {

public void addCards(Deck deck){
    if (this.sumPointsFromHand()<17){
        this.addCardToHand(deck.getRandomCard());
        this.addCards(deck);
    }
}

    public boolean isDiler() {
        return  true;
    }

}
