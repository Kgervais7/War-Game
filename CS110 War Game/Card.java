/**
Kaila Gervais
CS110 Final Project War Game
For this part of the assignment I will create a class named 
Card which will hold all the 52 card objects. 
*/

import javax.swing.*;

public class Card extends JFrame
{
   //Declare variables and initialize 
   
   public final int rank; //Variable for the value
   public final int suit;  //Variable fo the suit
   public final static int SPADES = 0;
   public final static int CLUBS = 1;
   public final static int HEARTS = 2;
   public final static int DIAMONDS = 3;
   public final static int ACE = 1;
   public final static int JACK = 11;
   public final static int QUEEN = 12;
   public final static int KING = 13; 
   //public final static int Joker = 4;
   public final ImageIcon cardImage;
   
   /**
   Create the default constructor to joker 
   */
   //public Card()
   //{
     // suit = Joker;
      //rank = 0;
      //cardImage = ImageIcon();
   //}
   
   
   /**
   Create the constructor
   */
   public Card(int cardSuit, int cardRank)
   {
      suit = cardSuit;
      rank = cardRank;
      cardImage = cardImage();
   }
   
   /**
   Method to return the suit of the card
   */
   public int getSuit()
   {
      return suit;
   }
   
   /**Method to return the rank of the card
   */
   public int getRank()
   {
      return rank;
   }
   
   /**
   Method to return the image for the card
   */
   public ImageIcon getIcon()
   {
      return cardImage;
   }
   
   /**
   toString method to return the suit as a string
   */
   private String suitToString()
   {
      switch(suit)
      {
         case SPADES:
         {
            return "Spades";
         }
         case CLUBS:
         {
            return "Clubs";
         }
         case HEARTS:
         {
            return "Hearts";
         }
         case DIAMONDS:
         {
            return "Diamonds";
         }
         default:
         {
            return "0";
         }
      }
   }
   
   /**
   toString method to returnt the rank as a string
   */
   private String rankToString()
   {
      switch(rank)
      {
         case 1:
         {
            return "Ace";
         }
         case 2:
         {
            return "2";
         }
         case 3:
         {
            return "3";
         }
         case 4:
         {
            return "4";
         }
         case 5:
         {
            return "5";
         }
         case 6:
         {
            return "6";
         }
         case 7:
         {
            return "7";
         }
         case 8:
         {
            return "8";
         }
         case 9:
         {
            return "9";
         }
         case 10:
         {
            return "10";
         }
         case 11:
         {
            return "Jack";
         }
         case 12:
         {
            return "Queen";
         }
         case 13:
         {
            return "King";
         }
         default:
         {
            return "King";
         }
      }
   }
   
   /**
   Method to assign the cardImage to each card
   */
   private ImageIcon cardImage()
   {
      switch(suit)
      {
         case SPADES:
         {
            switch(rank)
            {
               case 1:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/aces.jpg");
               }
               case 2:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/2s.jpg");
               }
               case 3:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/3s.jpg");
               }
               case 4:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/4s.jpg");
               }
               case 5:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/5s.jpg");
               }
               case 6:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/6s.jpg");
               }
               case 7:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/7s.jpg");
               }
               case 8:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/8s.jpg");
               }
               case 9:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/9s.jpg");
               }
               case 10:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/10s.jpg");
               }
               case 11:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/jacks.jpg");
               }
               case 12:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/queens.jpg");
               }
               case 13:
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/kings.jpg");
               }
            }
         }
         case CLUBS:
         {
            switch(rank)
            {
               case 1: 
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/acec.jpg"); 
               }
               case 2: 
               {
                  return new ImageIcon("Macintosh HD/Users/kailgervais/CS110 War Game/cardPics/2c.jpg");
               }
               case 3: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/3c.jpg");
               }
               case 4: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/4c.jpg");
               }
               case 5: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/5c.jpg");
               }
               case 6: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/6c.jpg"); 
               }
               case 7: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/7c.jpg");
               }
               case 8: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/8c.jpg");
               }
               case 9: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/9c.jpg");
               }
               case 10: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/10c.jpg"); 
               }
               case 11: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/jackc.jpg"); 
               }
               case 12: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/queenc.jpg"); 
               }
               case 13: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/kingc.jpg");  
               }
            }
         }
         case DIAMONDS:
         {
            switch(rank)
            {
               case 1: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/aced.jpg"); 
               }
               case 2: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/2d.jpg");
               }
               case 3: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/3d.jpg");
               }
               case 4: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/4d.jpg");
               }
               case 5: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/5d.jpg");
               }
               case 6: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/6d.jpg"); 
               }
               case 7: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/7d.jpg");
               }
               case 8: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/8d.jpg");
               }
               case 9: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/9d.jpg");
               }
               case 10: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/10d.jpg"); 
               }
               case 11: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/jackd.jpg"); 
               }
               case 12: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/queend.jpg"); 
               }
               case 13: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/kingd.jpg");  
               }
             }
         }
         case HEARTS:
         {
            switch(rank)
            {
               case 1: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/aceh.jpg"); 
               }
               case 2: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/2h.jpg");
               }
               case 3: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/3h.jpg");
               }
               case 4: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/4h.jpg");
               }
               case 5: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/5h.jpg");
               }
               case 6: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/6h.jpg"); 
               }
               case 7: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/7h.jpg");
               }
               case 8: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/8h.jpg");
               }
               case 9: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/9h.jpg");
               }
               case 10: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/10h.jpg"); 
               }
               case 11: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/jackh.jpg"); 
               }
               case 12: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/queenh.jpg"); 
               }
               case 13: 
               {
                  return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/kingh.jpg");  
               }
           }
        }
        default:
        {
           return new ImageIcon("Users/kailgervais/CS110 War Game/cardPics/kingh.jpg");
        }
     }
   }
   
   /**
   Create a toString method to display the suit and rank of the card
   */
   public String toString()
   {
      return rankToString() + " of " + suitToString();
   }
   
   /**
   Create a boolean method to determine if the cards ranks are equal or not
   */
   public boolean equalRank(Card otherCard)
   {
      //Declare boolean variable
      boolean status;
      
      if(rank == otherCard.rank)
      {
         status = true;
      }
      else
      {
         status = false;
      }
      return status;
   }
   
   /**
   Create a boolean greaterThan method to determine which card is greater
   */
   public boolean greaterThan(Card otherCard)
   {
      //Declare boolean variable
      boolean status;
      
      if(rank > otherCard.rank)
      {
         status = true;
      }
      else
      {
         status = false;
      }
      return status;
  }
}
      
     

        
        

               
               



   

