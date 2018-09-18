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
    Card card = new Card(2,3);
    assertEquals("2", card.getValueAsString());
  }
  @Test
  public void testToString() {
    Card card = new Card(10,1);
    assertEquals("H10",card.toString());
  }





}
