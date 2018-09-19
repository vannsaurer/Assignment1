
import junit.framework.TestCase;
import org.junit.Test;
public class DeckTest extends TestCase {
  //tests that deck is suffled
  @Test
  public void testShuffle() {
    Deck deck = new Deck();
    assertTrue(deck.shuffle());
  }
  //tests that deck isn't empty
  @Test
  public void testEmptyCollection() {
    Deck deck = new Deck();

    assertFalse(deck.isEmpty());
  }
  //tests that there are 52 cards in the deck
  @Test
  public void testDeckLength() {
    Deck deck = new Deck();

    assertEquals(52, deck.deckLength());
  }
}


