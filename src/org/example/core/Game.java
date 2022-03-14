package org.example.core;

public class Game implements AutoCloseable {

    private static Game instance;
    private final Deck deck;

    private Game(Deck deck) {
        this.deck = deck;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up instance");
        instance = null;
    }

    public void deal(Player player) {
        player.getHand().cards().add(deck.dealCard());
    }

    public void printWinner(Player player1, Player player2) {
        int rank1 = player1.getHand().totalPoints();
        int rank2 = player2.getHand().totalPoints();

        System.out.println(rank1);
        System.out.println(rank2);
        if (rank1 > rank2) {
            System.out.println("Player 1 wins");
        } else if (rank2 > rank1) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("It's a tie");
        }
    }

    public static Game instance(Deck deck) {
        if (instance == null) {
            instance = new Game(deck);
        }
        return instance;
    }

    public void shuffleDeck(){
        deck.shuffle();
    }

    public void resetDeck(){
        deck.clear();
        deck.populate();
        deck.populate();
    }

}
