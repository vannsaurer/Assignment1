import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
public class CardTest extends TestCase {
  @Test
  public void getSuitAsString() {
    Card card = new Card(10,1);
    assertEquals(10, card.getSuitAsString());
    
  }




}
