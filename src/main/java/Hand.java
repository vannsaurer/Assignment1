import java.util.Vector;


public class Hand {


  private Vector hand;   // The cards in the hand.


  public Hand() {
    // Create a Hand object that first empty
    hand = new Vector();
  }


  public void printHand(){
    System.out.println(hand);
  }

  public void clear() {
    // removes all the cards from hand.
    hand.removeAllElements();
  }

  public void addCard(Card c) {
    // Add the card c to the hand
    if (c != null)
      hand.addElement(c);
  }

  public void removeCard(Card c) {
    // removes the specified card.
    hand.removeElement(c);
  }

  public void removeCard(int position) {

    //removes card at specified position

    if (position >= 0 && position < hand.size())

      hand.removeElementAt(position);

  }


  public int getCardCount() {
    // Return the number of cards in the hand.

    return hand.size();

  }


  public Card getCard(int position) {

    if (position >= 0 && position < hand.size())

      return (Card)hand.elementAt(position);

    else

      return null;

  }



}