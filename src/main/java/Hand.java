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


  public void sortBySuit() {
    /*Cards with the same suit are grouped together in the hand. Then cards with the same suit are sorted by values
    and aces have the lower value 1.
   */
    Vector newHand = new Vector();

    while (hand.size() > 0) {

      int pos = 0;  // Position of minimal card.

      Card c = (Card)hand.elementAt(0);  // Minimal card.

      for (int i = 1; i < hand.size(); i++) {

        Card c1 = (Card)hand.elementAt(i);

        if ( c1.getSuit() < c.getSuit() ||
            (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {

          pos = i;

          c = c1;

        }

      }

      hand.removeElementAt(pos);

      newHand.addElement(c);

    }

    hand = newHand;

  }


  public void sortByValue() {
  /*Cards with the same values are grouped together in the hand. Then cards with the same value are sorted by suit
    and aces have the lower value 1.
   */
    Vector newHand = new Vector();

    while (hand.size() > 0) {

      int pos = 0;  // Position of minimal card.

      Card c = (Card)hand.elementAt(0);  // Minimal card.

      for (int i = 1; i < hand.size(); i++) {

        Card c1 = (Card)hand.elementAt(i);

        if ( c1.getValue() < c.getValue() ||(c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {

          pos = i;

          c = c1;

        }

      }

      hand.removeElementAt(pos);

      newHand.addElement(c);

    }

    hand = newHand;

  }

  /*public String toString() {

    // Return a String representation of this card, such as
    String c1 ="";
    for (int i = 1; i < hand.size(); i++) {
      c1 = hand.elementAt(i);
      //return c1;
    }
    return c1;
  }*/

}