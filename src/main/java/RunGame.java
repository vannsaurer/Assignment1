import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RunGame {

  static char UserInput;
  //static FileReader fr = new FileReader("C:\\Users\\Virginia Saurer\\Blackjacks\\BlackjacksGame\\src\\File01");


  static boolean CorF(){
    System.out.println("");
    System.out.println("");
    //FileReader fr = new FileReader("C:\\Users\\Virginia Saurer\\Blackjacks\\BlackjacksGame\\src\\File01");


    System.out.println("Welcome to the game of blackjack.");
    System.out.println();


    Scanner userInput1 = new Scanner(System.in);

    System.out.println("Please type (c) for console playing mode or (f) for file playing mode");
    System.out.println("Type (e) to exit");
    char CorS = userInput1.next().charAt(0);
    UserInput = CorS;
    CorS = Character.toUpperCase(CorS );

    if(CorS == 'F') {

      /*
      int i;
      while ((i=fr.read()) != -1)
        System.out.print((char) i);
        */
      System.out.println("Sorry File Option not available yet, please enter c or e when restarting the game");
      return true;

      //return false;
    }

    while (CorS == 'C') {
      if(CorS != 'C') {
        System.out.println("Sorry you typed invalid option. Restart Game");
        break;
      }
      HorS();
      return true;
    }
    while (CorS == 'E') {
      System.out.println("Thanks for playing Blackjack, Goodbye!");
      break;
    }
    while (CorS != 'C' &&CorS != 'F'&&CorS != 'E') {
      System.out.println("Sorry you typed in an invalid option. Restart Game");
      break;
    }


    return true;
  }

  /*static boolean FileOption() throws IOException {
    FileReader fr = new FileReader("C:\\Users\\Virginia Saurer\\Blackjacks\\BlackjacksGame\\src\\File01");

    int i;
    while ((i=fr.read()) != -1)
      System.out.print((char) i);

    return true;

  }*/

  static boolean checkForBlackjack(BlackjackHand dealerHand, BlackjackHand userHand,int Dealer_blackjackValue,int User_blackjackValue) {
    boolean blackjack=true;
    if (Dealer_blackjackValue == 21) {
      System.out.println("Dealer has the " + dealerHand.getCard(0)
          + " and the " + dealerHand.getCard(1) + ".");
      System.out.println("User has the " + userHand.getCard(0)
          + " and the " + userHand.getCard(1) + ".");
      System.out.println();
      System.out.println("Dealer has Blackjack.  Dealer wins.");
      CorF();
      blackjack= false;
    }

    if (userHand.getBlackjackValue() == 21) {
      System.out.println("Dealer has the " + dealerHand.getCard(0)
          + " and the " + dealerHand.getCard(1) + ".");
      System.out.println("User has the " + userHand.getCard(0)
          + " and the " + userHand.getCard(1) + ".");
      System.out.println();
      System.out.println("You have Blackjack.  You win.");
      CorF();
      blackjack = true;
    }

    return blackjack;
  }

  //more rules that determine who wins
  static boolean win(int Dealer_blackjackValue,int User_blackjackValue) {

    System.out.println();


    if (Dealer_blackjackValue == User_blackjackValue) {
      System.out.println("Dealer wins on a tie.  You lose.");

      //put a CorS() function here that takes them back to the start
      CorF();
      return false;
    } else if (Dealer_blackjackValue > User_blackjackValue) {
      System.out.println("Dealer wins, " + Dealer_blackjackValue
          + " points to " + User_blackjackValue + ".");
      //put a CorS() function here that takes them back to the start
      CorF();
      return false;
    } else {
      System.out.println("You win, " + User_blackjackValue
          + " points to " + Dealer_blackjackValue + ".");
      //put a CorS() function here that takes them back to the start
      CorF();
      return true;
    }
  }

  static boolean HorS() {
    Deck deck;                  // A deck of cards.  A new deck for each game.
    BlackjackHand dealerHand;   // The dealer's hand.
    BlackjackHand userHand;

    deck = new Deck();
    dealerHand = new BlackjackHand();
    userHand = new BlackjackHand();

    boolean hitORstand;
    boolean startGame;
    /*  Shuffle the deck, then deal two cards to each player. */

    deck.shuffle();
    dealerHand.addCard( deck.dealCard() );
    dealerHand.addCard( deck.dealCard() );
    userHand.addCard( deck.dealCard() );
    userHand.addCard( deck.dealCard() );

    System.out.println();
    System.out.println();

    //checkForBlackjack(dealerHand,userHand,dealerHand.getBlackjackValue(),userHand.getBlackjackValue());
    System.out.println("NEW GAME");
    while (startGame = true) {

      /* Display user's cards, and let user decide to Hit or Stand. */

      System.out.println();

      System.out.println();
      System.out.println("Your cards are:");
      for ( int i = 0; i < userHand.getCardCount(); i++ )
        System.out.println("    " + userHand.getCard(i));
      checkForBlackjack(dealerHand,userHand,dealerHand.getBlackjackValue(),userHand.getBlackjackValue());


      System.out.println("Your total is " + userHand.getBlackjackValue());
      System.out.println();
      System.out.println("Dealer is showing the " + dealerHand.getCard(0));
      System.out.println();

      Scanner userInput = new Scanner(System.in);
      System.out.println("Hit (H) or Stand (S)? ");


      char HorS = userInput.next().charAt(0);

      do {
        HorS = Character.toUpperCase(HorS );
        if (HorS != 'H' && HorS != 'S') {
          System.out.println("Please enter H or S:  ");

          return false;
        }

      } while (HorS != 'H' && HorS != 'S');
               /* If the user Hits, the user gets a card.  If the user Stands,
                  the loop ends (and it's the dealer's turn to draw cards).
               */


      if ( HorS == 'S' ) {
        // Loop ends; user is done taking cards.
        hitORstand = false;

        break;

      }

      else {  // userAction is 'H'.  Give the user a card.
        // If the user goes over 21, the user loses.
        Card newCard = deck.dealCard();
        userHand.addCard(newCard);
        System.out.println();
        System.out.println("User hits.");
        System.out.println("Your card is the " + newCard);
        System.out.println("Your total is now " + userHand.getBlackjackValue());
        if (userHand.getBlackjackValue() > 21) {
          System.out.println();
          System.out.println("You busted by going over 21.  You lose.");
          System.out.println("Dealer's other card was the "
              + dealerHand.getCard(1));

          CorF();
          return false;


        }
        hitORstand = true;
      }




    }


    System.out.println();
    System.out.println("User stands.");
    System.out.println("Dealer's cards are");
    System.out.println("    " + dealerHand.getCard(0));
    System.out.println("    " + dealerHand.getCard(1));
    while (dealerHand.getBlackjackValue() <= 16 || dealerHand.getBlackjackValue() == 17) {
      Card newCard = deck.dealCard();
      System.out.println("Dealer hits and gets the " + newCard);
      dealerHand.addCard(newCard);
      if (dealerHand.getBlackjackValue() > 21) {
        System.out.println();
        System.out.println("Dealer busted by going over 21.  You win.");
        CorF();
        return true;
      }
    }
    System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());

    win(dealerHand.getBlackjackValue(),userHand.getBlackjackValue());
    return false;
  }












}
