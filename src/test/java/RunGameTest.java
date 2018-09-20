
import junit.framework.TestCase;
import org.junit.Test;
public class RunGameTest extends TestCase {

  @Test
  public void testCorF() {
   RunGame runGame = new RunGame();
   char userInput= runGame.UserInput;
   userInput = 'F';
   assertEquals(false, userInput );
  }
  @Test
  public void testCheckForBlackjack() {
    RunGame runGame = new RunGame();
    BlackjackHand dealerHand = new BlackjackHand();
    BlackjackHand userHand = new BlackjackHand();
    int Dealer_blackjackValue = 21;
    int User_blackjackValue = 3;

    assertEquals(false, runGame.checkForBlackjack(dealerHand,userHand,21,20) );
    assertEquals(true, runGame.checkForBlackjack(dealerHand,userHand,2,21) );
    assertEquals(false, runGame.checkForBlackjack(dealerHand,userHand,21,21) );
  }

  @Test
  public void testWin() {
    RunGame runGame = new RunGame();

    assertEquals(false, runGame.win(20,20) );
    assertEquals(true, runGame.win(2,10) );
    assertEquals(false, runGame.win(19,9) );
  }


}
