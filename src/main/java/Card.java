
public class Card {


  public final static int SPADES = 0,

  HEARTS = 1,

  DIAMONDS = 2,

  CLUBS = 3;


  public final static int ACE = 1,

  JACK = 10,

  QUEEN = 10,

  KING = 10;


  private final int suit;


  private final int value;


  public Card(int theValue, int theSuit) {
    value = theValue;

    suit = theSuit;

  }


  public int getSuit() {


    return suit;

  }


  public int getValue() {


    return value;

  }
  public String getSuitAsString() {
    // Return a String representing the card's suit.

    switch ( suit ) {

      case SPADES:   return "S";

      case HEARTS:   return "H";

      case DIAMONDS: return "D";

      case CLUBS:    return "C";

      default:       return "??";

    }

  }


  public String getValueAsString() {
    // Return a String representing the card's value.

    switch ( value ) {

      case 1:   return "A";

      case 2:   return "2";

      case 3:   return "3";

      case 4:   return "4";

      case 5:   return "5";

      case 6:   return "6";

      case 7:   return "7";

      case 8:   return "8";

      case 9:   return "9";

      case 10:  return "10";

      case 11:  return "J";

      case 12:  return "Q";

      case 13:  return "K";

      default:  return "??";

    }

  }


  public String toString() {
    // Return a String representation of this card, such as


    return  getSuitAsString()+getValueAsString();


  }






}

