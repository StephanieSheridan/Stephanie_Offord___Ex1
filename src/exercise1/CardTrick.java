package exercise1;

import java.util.Scanner;
import java.util.Random;
 /**
=======

/**
>>>>>>> THEIRS
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Stephanie Offord Jan 31 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        hand[0]=new Card();
        hand[0].setValue(1);
        hand[0].setSuit("Hearts");
        
        hand[1]=new Card(); 
        hand[1].setValue(2);
        hand[1].setSuit("Diamond");
        
        hand[2]=new Card();
        hand[2].setValue(3);
        hand[2].setSuit("Spades");
        
        hand[3]=new Card();
        hand[3].setValue(4);
        hand[3].setSuit("Club");
        
        hand[4]=new Card();
        hand[4].setValue(7);
        hand[4].setSuit("Hearts");
        
        hand[5]=new Card();
        hand[5].setValue(5);
        hand[5].setSuit("Diamond");
        
        hand[6]=new Card();
        hand[6].setValue(12);
        hand[6].setSuit("Spades");
        
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

            System.out.println("Input the value between 1-13");
            int guessValue = sc.nextInt();
            System.out.println("Input the Suit from Hearts, Diamonds, Spades, or Clubs");
            String guessSuit = sc.next();
            
            boolean result = false;
            for (int i = 0; i < hand.length; i++) {
                if(hand[i].getValue() == guessValue && hand[i]. getSuit().equals(guessSuit)){
                    printInfo();
                    result = true;
                    break;
                }
            }
        if(!result){
            System.out.println("Your Cars is not on your hand");
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.

    }

}


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */

    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Stephanie");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- study more");
        System.out.println("-- Joining career fair!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- 3dcg");
        System.out.println("-- Cooking");
        System.out.println("-- Reading");
        System.out.println("-- computing");

        System.out.println();
        
    
    }

}
