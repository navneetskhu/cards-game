package test;

import org.example.core.Card;
import org.example.core.Rank;
import org.example.core.Suite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    public void shouldCreateCardWithSuiteAndRank(){
        Rank rank = Rank.ACE;
        Card card = new Card(rank, Suite.SPADES);
        assertEquals(card.getRank(), rank.getRank());
        assertEquals(card.getSuit(), Suite.SPADES.suitName());
    }

    @Test
    public void shouldGetSuiteOfGivenCard(){
        Rank rank = Rank.ACE;
        Suite suite =Suite.SPADES;
        Card card = new Card(rank, suite);
        assertEquals(card.getSuit(), suite.suitName());
    }
}
