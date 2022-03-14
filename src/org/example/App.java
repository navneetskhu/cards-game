package org.example;

import org.example.core.Deck;
import org.example.core.Game;
import org.example.core.Player;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        Game game = Game.instance(new Deck());
        for (int i = 0; i < 5; i++) {
            game.deal(player1);
            game.deal(player2);
        }
        System.out.println(player1.show());
        System.out.println(player2.show());
        game.printWinner(player1, player2);
        player1.clearHand();
        player2.clearHand();
        game.resetDeck();
    }
}
