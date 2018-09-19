import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
public class CardTest extends TestCase {
  @Test
  public void testGetSuitAsString() {
    Card card = new Card(10,1);
    assertEquals("H", card.getSuitAsString());
  }
  @Test
  public void testGetValueAsString(){
    Card card = new Card(1,3);
    assertEquals("A", card.getValueAsString());

    Card card1 = new Card( 11,2);
    assertEquals("J", card1.getValueAsString());

    Card card2 = new Card( 12,2);
    assertEquals("Q", card2.getValueAsString());

    Card card3 = new Card( 13,2);
    assertEquals("K", card3.getValueAsString());
  }

  @Test
  public void testToString() {
    Card card = new Card(10,1);
    assertEquals("H10",card.toString());
  }





}
