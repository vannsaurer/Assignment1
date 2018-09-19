/*
    An object of type Deck represents an ordinary deck of 52 playing cards.
    Here you get a type Deck object representing a deck of 52 cards, this deck can then be shuffled
    cards can be dealt from it.
*/
public class Deck {

  private Card[] deck;   // An array ofCards, that is the deck.
  private int cardsUsed; // the number of cards used from the deck

  public Deck() {
    //creates an unshuffled deck of cards

    deck = new Card[52];
    int cardCt = 0; // How many cards have been created so far.

    for ( int suit = 0; suit <= 3; suit++ ) {

      for ( int value = 1; value <= 13; value++ ) {

        deck[cardCt] = new Card(value,suit);

        cardCt++;

      }

    }

    cardsUsed = 0;

  }

  public boolean isEmpty(){
    if(deck.length ==0)
      return true;
    return false;
  }


  public void addCardToDeck(Card c) {
    // Add the card c to the hand

    for(int i=0;i<deck.length;i++){
      if(deck[i] ==null && c!=null){
        deck[i]=c;
      }
    }
  }

  public boolean shuffle() {
    //This puts all the used cards back into the deck and then suffles it randomly

    for ( int i = 51; i > 0; i-- ) {

      int rand = (int)(Math.random()*(i+1));

      Card temp = deck[i];

      deck[i] = deck[rand];

      deck[rand] = temp;

    }

    cardsUsed = 0;
    return true;
  }


  public int cardsLeft() {

    // As cards are dealt from the deck, the number of cards left
    // decreases.  This function returns the number of cards that
    // are still left in the deck.

    return 52 - cardsUsed;

  }

  public int deckLength(){
    return deck.length;
  }

  public Card dealCard() {
    // Deals one card from the deck and returns it.
    if (cardsUsed == 52)

      shuffle();

    cardsUsed++;

    return deck[cardsUsed - 1];
  }

} 