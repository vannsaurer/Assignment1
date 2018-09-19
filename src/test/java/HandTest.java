import junit.framework.TestCase;
import org.junit.Test;
public class HandTest extends TestCase{

  @Test
  public void testAddCard() {
    Hand hand = new Hand();
    Card card = new Card(10,2);
    hand.addCard(card);
    assertEquals( 1, hand.getCardCount());
  }
  @Test
  public void testRemoveCard() {
    Hand hand = new Hand();
    Card card = new Card(10,2);
    hand.addCard(card);
    hand.removeCard(0);
    assertEquals( 0, hand.getCardCount());
  }
  


}
