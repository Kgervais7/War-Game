/**
Kaila Gervais
CS110 Final Project War Game
For this part of the assignment I will create a class named Deck
that will hold an array for the deck of cards
*/

import java.util.Random;
import java.util.ArrayList;

public class Deck
{
   //Declare variables
   //Creates an array to hold all the cards in a deck
   private ArrayList<Card> cardDeck; 
   //Variable to hold all the cards that have been used
   private int usedCards;
   //Variable to keep track of the number of cards in the deck
   private int cardsInDeck;
   
   /**
   Create default contructor for the Deck class
   */
   public Deck()
   {
      this(false);
   }
   
   /**
   Create constructor to determine the number of cards in the deck 
   and then adds them to the array, deck
   */
   public Deck(boolean cards)
   {
      //Create the new array list named deck
      cardDeck = new ArrayList<Card>();
      
      //Add the cards to the deck
      cardsInDeck = 0; //Initializes the variable
      for(int suit = 0; suit <= 3; suit++)
      {
         for(int rank = 1; rank <= 13; rank++)
         {
            cardDeck.add(new Card(suit, rank));
         }
      }
      
      usedCards = 0; //Initializes the usedCards to 0
      
      shuffleDeck(); //Shuffles the deck
   }
   
   /**
   Create a method to return the size of the deck
   */
   public int size()
   {
      return cardsInDeck;
   }
   
   /**
   Get method to get a card and a position in the deck and then return that card
   */
   public Card getCard(int position)
   {
      return cardDeck.get(position);
   }
   
   /**
   Create a method to get the position of the card and decide weither 
   there is a card there or not
   */
   public int getPosition(Card c)
   {
      //Declare and initialize variables
      boolean equals, found = false;
      int place;
      int count = 0;
      
      while(found == false)
      {
         equals = c.equals(cardDeck.get(count));
         if(equals == true)
         {
            found = equals;
         }
         else
         {
            found = equals;
            count++;
         }
      }
      
      if(found == true)
      {
         place = count;
      }
      else
      {
         place = -1; //-1 denotes no card
      }
      return place;
   }
      
   
   /**
   Create a shuffle method to randomize the order of each 
   the cards in the deck
   */
   public void shuffleDeck()
   {
      //Declare variables
      Random randCard = new Random(); 
      int cardShuffle = 52; //Decides how many cards that need to be shuffled
      int randNumber; 
        
      for(int i = 0; i <= cardDeck.size()-1; i++)
      {
         randNumber = randCard.nextInt(cardShuffle);
         Card temp = cardDeck.get(i);
         cardDeck.set(i, cardDeck.get(randNumber));
         cardDeck.set(randNumber, temp);
      }
   }
   
   /**
   Create the deal card method
   */
   public Card dealCard()
   {
      //Handle when the deck is empty
      if(usedCards == cardDeck.size())
      {
         throw new ListIndexOutOfBoundsException("Sorry, no cards left.");
      }
      else
      {
         usedCards++;
         return cardDeck.get(usedCards-1);
      }
   }
   
   /**Create method to determine how many cards are left in the deck
   */
   public int numCardsLeft()
   {
      return (cardDeck.size() - usedCards);
   }
}
      
     
      
      
      
      
      
      