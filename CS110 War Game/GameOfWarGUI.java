/**
Kaila Gervais
CS110 Final Project War Game
For this part of the assignment I will create the war game class that will create
the setup for the game using java GUI.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameOfWarGUI extends JFrame
{
   //Declare variables for JPanels
   private JPanel warGame;
   private JPanel topLeft;
   private JPanel topRight;
   private JPanel bottomLeft;
   private JPanel bottomRight;
   private JPanel bottom;
   private JPanel cardArea;
   private JPanel winDisplay;
   //Declare variables for JButtons
   private JButton goButton;
   private JButton restartButton;
   private JButton quitButton;
   //Declare variables for ImageIcon
   private ImageIcon yourFront;
   private ImageIcon yourBack;
   private ImageIcon computerFront;
   private ImageIcon computerBack;
   //Declare variables for JLabels
   private JLabel yourCards;
   private JLabel yourCardsNum;
   private JLabel computerCards;
   private JLabel computerCardsNum;
   private JLabel yourFrontPic;
   private JLabel yourBackPic;
   private JLabel computerFrontPic;
   private JLabel computerBackPic;
   private JLabel firstWarBackPic;
   private JLabel secondWarBackPic;
   private JLabel winnerDisplay;
   
   private GameOfWar warGameGame;
   
   /**
   Constructor for GUI
   */
   public GameOfWarGUI()
   {
      //Creates title for JFrame
      super("GAME OF WAR");
      
      //Creates new game of war
      warGameGame = new GameOfWar();
      
      //Create the layout for the game
      makePanels();
      makePanelLabels();
      makeButtons();
      makeImageIcons();
      
      //Add the panels created to the JFrame
      addPanelsToFrames();
      addToMainFrame();
   }
      /**
      Make the panels to be added to the JFrame
      */
      private void makePanels()
      {
         warGame = new JPanel(new GridLayout(2,2));
         warGame.setMaximumSize(new Dimension(450,550));
         
         topLeft = new JPanel(new FlowLayout());
         topLeft.setMaximumSize(new Dimension(200, 225));

         topRight = new JPanel(new FlowLayout());
         topRight.setMaximumSize(new Dimension(250, 225));
      
         bottomLeft = new JPanel(new FlowLayout());
         bottomLeft.setMaximumSize(new Dimension(200, 225));
     
         bottomRight = new JPanel(new FlowLayout());
         bottomRight.setMaximumSize(new Dimension(250, 225));
      
         winDisplay = new JPanel(new FlowLayout());
         winDisplay.setMinimumSize(new Dimension(300,200));
         
         cardArea = new JPanel(new GridLayout(4,1));
         cardArea.setBackground(new Color(15,100,250));
         cardArea.setAlignmentX(Component.CENTER_ALIGNMENT);
         cardArea.setAlignmentY(Component.CENTER_ALIGNMENT);
         cardArea.setSize(300,300);
         
         bottom = new JPanel(new FlowLayout());
         bottom.setMinimumSize(new Dimension(725,200));
         
         winDisplay.setBorder(BorderFactory.createLoweredBevelBorder());
         cardArea.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 2, Color.RED));
      } 
      
      /**
      Make the labels which will be added to the JFrame
      */      
      private void makePanelLabels()
      {
      //create the labels used to introduce the game
      winnerDisplay = new JLabel();
      winnerDisplay.setFont(new Font("Arial",Font.BOLD,50));
      winnerDisplay.setText("Let's Play War!");
      winDisplay.add(winnerDisplay);
      
      //create label where it will keep track of your cards
      yourCards = new JLabel();
      yourCards.setText("Your Cards ");
      yourCards.setFont(new Font("Arial", Font.BOLD, 45));
      yourCards.setHorizontalAlignment(SwingConstants.CENTER);
      cardArea.add(yourCards);
      
      //Displays the number of cards you have
      yourCardsNum = new JLabel();
      yourCardsNum.setText(""+warGameGame.getYourNumberOfCards());
      yourCardsNum.setFont(new Font("Arial", Font.BOLD, 45));
      yourCardsNum.setForeground(new Color(200,0,150));
      yourCardsNum.setHorizontalAlignment(SwingConstants.CENTER);
      yourCardsNum.setVerticalAlignment(SwingConstants.TOP);
      cardArea.add(yourCardsNum);
      
      //Dsiplays the computers cards
      computerCards = new JLabel();
      computerCards.setText("Computer Cards ");
      computerCards.setFont(new Font("Arial", Font.BOLD, 45));
      computerCards.setHorizontalAlignment(SwingConstants.CENTER);
      cardArea.add(computerCards);
      
      //Displays the computers cards number
      computerCardsNum = new JLabel();
      computerCardsNum.setText(""+warGameGame.getComputerNumberOfCards());
      computerCardsNum.setFont(new Font("Arial", Font.BOLD, 45));
      computerCardsNum.setForeground(new Color(200,50,0));
      computerCardsNum.setHorizontalAlignment(SwingConstants.CENTER);
      computerCardsNum.setVerticalAlignment(SwingConstants.TOP);
      cardArea.add(computerCardsNum);
   }
      /**
      Create the buttons to play game
      */
      private void makeButtons()
      {
         //create the go button so you can play a new card
         goButton = new JButton("Go");
         goButton.setForeground(new Color(40,100,220));
         goButton.setFont(new Font("Times",Font.BOLD,18));
         goButton.addActionListener(new ButtonListener());
         bottom.add(goButton);
         
         //create a restart button so you can play a new game
         restartButton = new JButton("Restart");
         restartButton.setFont(new Font("Times",Font.BOLD,18));
         restartButton.setForeground(new Color(17,176,59));
         restartButton.addActionListener(new ResetListener());
         bottom.add(restartButton);
         
         //create a quit button to end the game
         quitButton = new JButton("Quit");
         quitButton.setForeground(new Color(220,60,42));
         quitButton.setFont(new Font("Times",Font.BOLD,18));
         quitButton.addActionListener(new QuitListener());
         bottom.add(quitButton);
      }
      
      /**
      Create method to display the cards
      */
      private void makeImageIcons()
      {
         //create image icons
         yourFront = null;
         yourBack = new ImageIcon("Macintosh HD/Users/kailagervais/CS110 War Game/cardPics/back.jpg");
         computerFront = null;
         computerBack = new ImageIcon("Macintosh HD/Users/kailagervais/CS110 War Game/cardPics/back.jpg");
         
         //create labels the cards
         yourFrontPic = new JLabel();
         computerFrontPic = new JLabel();
      
         yourBackPic = new JLabel(yourBack);
         computerBackPic = new JLabel(computerBack);
     
         firstWarBackPic = new JLabel();
         secondWarBackPic = new JLabel();
         
         //add the card pictures to the correct cardArea
         topLeft.add(yourBackPic);
         topRight.add(computerBackPic);
      
         bottomLeft.add(firstWarBackPic);
         bottomRight.add(secondWarBackPic);
      
         topLeft.add(yourFrontPic);
         topRight.add(computerFrontPic);   
      }
      
      /**
      Method to display all the panels to the JFrame
      */
      private void addPanelsToFrames()
      {
         
         warGame.add(topLeft);
         warGame.add(topRight);
         warGame.add(bottomLeft);
         warGame.add(bottomLeft);
      }  
      
      /**
      Method to add all contents to the bigger JFrame
      */
      private void addToMainFrame()
      {
         add(warGame, BorderLayout.CENTER);
         add(cardArea, BorderLayout.WEST);
         add(bottom, BorderLayout.SOUTH);
         add(winnerDisplay, BorderLayout.NORTH);
      }  
      
      /**
      Create a button listener to react to each event
      */
      private class ButtonListener implements ActionListener
      {
      public void actionPerformed(ActionEvent e)
      {
        if (warGameGame.gameOver()==false)
         {
            
            yourCardsNum.setText(""+warGameGame.getYourNumberOfCards());
            computerCardsNum.setText(""+warGameGame.getComputerNumberOfCards());
            //determine if a war is neccessary
            if (warGameGame.getRoundWinner() == -1)
            {  
                firstWarBackPic.setIcon(yourBack);
                secondWarBackPic.setIcon(computerBack);
            }
            else
            {
               firstWarBackPic.setIcon(null);
               secondWarBackPic.setIcon(null);
            }
                  
            //get a new card to play from each player 
             warGameGame.go();
                
                  //change the card icons
                  yourFront = warGameGame.getYourCard().getIcon();
                  computerFront = warGameGame.getComputerCard().getIcon();
         
                  yourFrontPic.setIcon(yourFront);
                  computerFrontPic.setIcon(computerFront);
                  
                  //compare cards to determine the winner of the round
                  warGameGame.compareTo();
                           
                  if (warGameGame.getRoundWinner() == 1)
                  {
                     winnerDisplay.setForeground(new Color(95,20,161));
                     winnerDisplay.setText("You win "+warGameGame.getNumOfCardsWon()+" cards.");
                     
                  }   
                  else if(warGameGame.getRoundWinner() == 0)
                  {
                     winnerDisplay.setForeground(new Color(22,57,125));
                     winnerDisplay.setText("Computer wins "+warGameGame.getNumOfCardsWon()+" cards.");
                     
                  }
                  else if (warGameGame.getRoundWinner() == -1)
                  {
                     winnerDisplay.setForeground(Color.black);
                     winnerDisplay.setText("War!");
                     
                  }
               }
             
               else if(warGameGame.gameOver() == true)
               {
                if (warGameGame.getRoundWinner() == 1)
                  {  
                     winnerDisplay.setForeground(new Color(25,152,154));
                     winnerDisplay.setText("Game over. You Win!");
                     winnerDisplay.setFont(new Font("Arial",Font.BOLD, 50));
                     disableGo();
                  }
               else if(warGameGame.getRoundWinner() == 0)
                  {
                     winnerDisplay.setForeground(new Color(25,152,154));
                     winnerDisplay.setText("Game over. Computer Wins.");
                     winnerDisplay.setFont(new Font("Times",Font.BOLD, 50));
                     disableGo();
                  }
          }
      }
      /**
      Create a method that doesn't let the use press go when out of cards
      */
      public void disableGo()
      {
         goButton.setEnabled(false);
      }
   }
   
   
   /**
   Button listener when quit is selected
   */
   private class QuitListener implements ActionListener
   {
     public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   /**
   Actions when reset button is hit
   */
   private class ResetListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //Initialize a new game of war
         warGameGame = new GameOfWar();
         
         //Reset everything
            winnerDisplay.setForeground(Color.black);
            winnerDisplay.setText("New Game");
          
            yourCards.setText("Your Cards ");

            yourCardsNum.setText(""+warGameGame.getYourNumberOfCards());
         
            computerCards.setText("Computer Cards ");
      
            computerCardsNum.setText(""+warGameGame.getComputerNumberOfCards());
            
         //Set each image to nothing
         yourFront = null;
         computerFront = null;
         
         //Display each image as non
         yourFrontPic.setIcon(yourFront);
         computerFrontPic.setIcon(computerFront);
                  
      }
   }
}

   
