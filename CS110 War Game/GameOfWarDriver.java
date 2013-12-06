/**
Kaila Gervais
CS110 Final Project War Game
For this part of the assignment I will create 
the driver class that will be used to play the game
*/

import javax.swing.JFrame;
import java.awt.*;

public class GameOfWarDriver 
{

	public static void main(String[] args)
	{
		
		JFrame frame = new GameOfWarGUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(700,650));
		frame.validate();
		frame.setVisible(true);
		
	}
		
}