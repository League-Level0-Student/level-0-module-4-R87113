package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
String Hi = JOptionPane.showInputDialog(null,"How many nickels?");
	
int Nickels = Integer.parseInt(Hi);
// Ask the user how many nickels they have	


// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
String hi = JOptionPane.showInputDialog(null,"How many dimes?");
	int Dimes = Integer.parseInt(hi);	
// Ask the user how many quarters they have, and convert their answer
String hey = JOptionPane.showInputDialog("How many Quarters?");
	int Quarters = Integer.parseInt(hey);
// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
double money = 0.0;
money += .05 * Nickels;
money += .10 * Dimes;
money += .25 * Quarters;
	
	
	
	
	JOptionPane.showMessageDialog(null,"You have "+money);
	
	
	
	
	
	
	
	
	
	
	}
}

