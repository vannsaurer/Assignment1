/*
        Virginia Saurer 101037563 2018/09/20

       This program lets the user play Blackjack.  The computer
       acts as the dealer.  The user can leave at any time.
       House rules:  The dealer hits on a total of 16 or less
       and of 17.  The Dealer also wins ties.
       A new deck of cards is used for each game, shuffled randomly
    */

import java.io.*;
import java.util.Scanner;
public class BlackjackMain extends RunGame {

  public static void main(String[] args) throws Exception {

    //runs the console or file game mode function that then involves the other game functions in RunGame.java
    CorF();

    }

}
