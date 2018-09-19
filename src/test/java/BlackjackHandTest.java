import junit.framework.TestCase;
import org.junit.Test;

public class BlackjackHandTest {
  @Test
  public void testGetBlackjackValue()  {
    BlackjackHand bjHand = new BlackjackHand();
    Hand hand = new Hand();
    Card card = new Card(10,2);
    hand.addCard(card);
    assertEquals(10, bjHand.getBlackjackValue());
  }

}
