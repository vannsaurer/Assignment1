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
  /*@Test
  public void testGetCard() {
    Hand hand = new Hand();
    Card card = new Card(9,2);
    hand.addCard(card);

    assertEquals( "D9", hand.getCard(0));
  }*/

  @Test
  public void testSortBySuit(){
    Hand hand = new Hand();
    Card card1 = new Card(9,2);
    Card card2 = new Card(8,1);
    Card card3 = new Card(2,1);
    hand.addCard(card1);
    hand.addCard(card2);
    hand.addCard(card2);

    assertEquals("H2,H8,D9",hand.toString());
  }


  @Test
  public void testSortByValue(){
    Hand hand = new Hand();
    Card card1 = new Card(2,2);
    Card card2 = new Card(8,1);
    Card card3 = new Card(2,1);
    hand.addCard(card1);
    hand.addCard(card2);
    hand.addCard(card2);

    assertEquals("H2D9H8", hand);
  }





}
