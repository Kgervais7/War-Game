/**
Kaila Gervais
CS110 Final Project War Game
For this part of the assignment I will create the actual war game class.
*/

import java.util.Random;
import java.util.ArrayList;

public class GameOfWar
{
   //Declare and initialize variables
   private Card yourCard;
   private Card computerCard; 
   private ArrayList<Card> yourCards;
   private ArrayList<Card> computerCards;
   private ArrayList<Card> warCards;
   private Deck deckOfCards;
   private int numOfWins;
   private int numOfCardsWon;
   private boolean gameOver;
   public static final int WAR_MATCH = 2;
   public static final int YOU_WIN = 1;
   public static final int COMPUTER_WINS = 0;
   
   /**
   Create the default constructor
   */
   public GameOfWar()
   {
      yourCards = new ArrayList<Card>(); //Creates your deck of cards
      computerCards = new ArrayList<Card>(); //Creates the computers deck of cards
      warCards = new ArrayList<Card>(); //Creates the war deck of cards
      deckOfCards = new Deck(); 
      gameOver = false;
      
     deckSplit();
   }
   
   /**
   Create the method that will split the deck in half 
   for the two players to start the game
   */
   public void deckSplit()
   {
      while(deckOfCards.numCardsLeft() != 0)
      {
         yourCards.add(deckOfCards.dealCard());
         computerCards.add(deckOfCards.dealCard());
      }
   }
   
   /**
   Create a method to return your card and the computers card
   */
   public Card getYourCard()
   {
      return yourCard;
   }
   
   public Card getComputerCard()
   {
      return computerCard;
   }
   
   /**
   Create a go method for when you each put a card down on the table
   */
   public void go()
   {
      //If neither players deck is empty
      if(!yourCards.isEmpty() && !computerCards.isEmpty())
      {
         yourCard = yourCards.remove((yourCards.size()) -1);
         computerCard = computerCards.remove((computerCards.size()) -1);
      }
      //If you still have cards left but the computer doesn't
      else if(!yourCards.isEmpty() && computerCards.isEmpty())
      {
         numOfWins = YOU_WIN;
         gameOver = true;
      }
      //If you are out of cards and the computer still has cards left
      else if(yourCards.isEmpty() && !computerCards.isEmpty())
      {
         numOfWins = COMPUTER_WINS;
         gameOver = true;
      }
      //If both players decks are empty
      else if(yourCards.isEmpty() && computerCards.isEmpty())
      {
         throw new ListIndexOutOfBoundsException ("Error, No cards.");
      }
   }
   
   /**
   Create a method named war that will be called when the two cards are equal
   */
   public void war()
   {
      //Removes a card from your pile and adds it to the war pile
      warCards.add(yourCards.remove((yourCards.size())-1));
      //Removes a card from the computers pile and adds it to the war pile
      warCards.add(computerCards.remove((computerCards.size())-1));
   }
   
   /**
   Create a method that will shuffle the cards after each play
   */
   public void shuffleDeck()
   {
      //Declare variables
      Random randCard = new Random();
      int randomNum;
      
      //Use a loop to shuffle through each card in the players deck
      //Your deck
      for (int i = 0; i <= yourCards.size()-1; i++)
      {
         randomNum = randCard.nextInt(yourCards.size());
         Card temp = yourCards.get(i);
         yourCards.set(i, yourCards.get(randomNum));
         yourCards.set(randomNum, temp);         
      }
      //Computers deck
      for (int i = 0; i <= computerCards.size()-1; i++)
      {
         randomNum = randCard.nextInt(computerCards.size());
         Card temp = computerCards.get(i);
         computerCards.set(i, computerCards.get(randomNum));
         computerCards.set(randomNum, temp);         
      }
   }
      
   /**
   Create a method to compare the two cards being played
   */
   public void compareTo()
   {
      //Use the war array list created to hold the cards being played until winner is found
      warCards.add(yourCard);
      warCards.add(computerCard);
      //If the two cards are equal then a war happens
      if(yourCard.equals(computerCard))
      {
         numOfWins = WAR_MATCH;
         war();
      }
      //If your card is greater than the computers card
      else if(yourCard.greaterThan(computerCard) == true)
      {
         numOfWins = YOU_WIN;
         numOfCardsWon = warCards.size();
         //Adds cards to your pile
         for(Card c: warCards)
         {
            yourCards.add(0,c);
         }
         
         //Delete all cards from the war pile
         warCards.clear();
      
         //Shuffle each players deck
         shuffleDeck();
      }
      //If the computers card is greater than your card
      else if(computerCard.greaterThan(yourCard) == true)
      {
         numOfWins = COMPUTER_WINS;
         numOfCardsWon = warCards.size();
         //Adds cards to the computers pile
         for(Card c: warCards)
         {
            computerCards.add(0,c);
         }
         
         //Delete all cards from the war pile
         warCards.clear();
         
         //Shuffle each players deck
         shuffleDeck();
      }
    }
    
    /**
    Create a method to return the numbers of cards in each players deck
    */
    public int getYourNumberOfCards()
    {
      return yourCards.size();
    }
    
    public int getComputerNumberOfCards()
    {
      return computerCards.size();
    }
    
    /**
    Create a method to get the size of the pile the player will win
    */
    public int getNumOfCardsWon()
    {
      return numOfCardsWon;
    }
    
    /**
    Create a method to return who wins each round
    */
    public int getRoundWinner()
    {
      return numOfWins;
    }
    
    /**
    Create a boolean method to determine if the game is over
    */
    public boolean gameOver()
    {
      return gameOver;
    }
}
   
   