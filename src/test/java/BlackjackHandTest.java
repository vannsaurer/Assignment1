import junit.framework.TestCase;
import org.junit.Test;

public class BlackjackHandTest extends TestCase{
  @Test
  public void testGetBlackjackValue()  {
    BlackjackHand bjHand = new BlackjackHand();
    Card card1 = new Card(10,2);
    bjHand.addCard(card1);
    Card card2 = new Card(2,1);
    bjHand.addCard(card2);
    assertEquals(12, bjHand.getBlackjackValue());

    BlackjackHand bjHand2 = new BlackjackHand();
    Card card3 = new Card(1,2);
    bjHand2.addCard(card3);
    Card card4 = new Card(11,1);
    bjHand2.addCard(card4);
    assertEquals(21, bjHand2.getBlackjackValue());

    BlackjackHand bjHand3 = new BlackjackHand();
    Card card5 = new Card(10,3);
    bjHand3.addCard(card5);
    Card card6 = new Card(9,2);
    bjHand3.addCard(card6);
    Card card7 = new Card(1,2);
    bjHand3.addCard(card7);
    assertEquals(20, bjHand3.getBlackjackValue());


    BlackjackHand bjHand4 = new BlackjackHand();
    Card card8 = new Card(1,3);
    bjHand4.addCard(card8);
    Card card9 = new Card(9,1);
    bjHand4.addCard(card9);
    Card card10 = new Card(11,2);
    bjHand4.addCard(card10);
    assertEquals(20, bjHand4.getBlackjackValue());

    BlackjackHand bjHand5 = new BlackjackHand();
    Card card11 = new Card(1,2);
    bjHand5.addCard(card11);
    Card card12 = new Card(1,1);
    bjHand5.addCard(card12);
    assertEquals(12, bjHand5.getBlackjackValue());

    BlackjackHand bjHand6 = new BlackjackHand();
    Card card13 = new Card(1,2);
    bjHand6.addCard(card13);
    Card card14 = new Card(9,1);
    bjHand6.addCard(card14);
    Card card15 = new Card(1,3);
    bjHand6.addCard(card15);
    assertEquals(21, bjHand6.getBlackjackValue());

    BlackjackHand bjHand7 = new BlackjackHand();
    Card card16 = new Card(10,3);
    bjHand7.addCard(card16);
    Card card17 = new Card(7,1);
    bjHand7.addCard(card17);
    Card card18 = new Card(1,3);
    bjHand7.addCard(card18);
    Card card19 = new Card(1,2);
    bjHand7.addCard(card19);
    assertEquals(19, bjHand7.getBlackjackValue());
  }
  }


