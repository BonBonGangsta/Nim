/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NimPackage;

import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author byrondepaz
 */
public class MarblesNim 
{
        
     public static void main(String[] args) throws IOException {

        // First ask if the user wants to play a game.
        // createa a boolean that will stay true until the user does not want to
        // play any more
        boolean keepPlaying = true;
        Player player1;
        Player player2;

        // While loop to keep playing while keepPlaying is true
        while (keepPlaying) {
            //create method that will run the questions and create the players.
            // ask the player if they want to play the game.
            int response = JOptionPane.showConfirmDialog(null,
                    "Would you like to play a game of Nim?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            //create the three possible out comes
            if (response == JOptionPane.NO_OPTION) 
            {
                // No was clicked in the dialog box
                System.out.println("okay, your loss");
                keepPlaying = false;
            } 
            else if (response == JOptionPane.YES_OPTION) 
            {
                // generate a random number from 10 through 100
                Random marbles = new Random();
                // intiate the pile of objects
                Pile game1 = new Pile((marbles.nextInt(90)+ 10));
                // yes has been choosen
                // ask the user who will be playing.
                String input = JOptionPane.showInputDialog("Who will the "+
                        "first player be? \"Human\" , \"AboveAverageComp\""
                        + " , or \"SuperComputer\"?");
                // test the string to see who it matches
                if(input.equals("Human"))
                {
                    String name1 = JOptionPane.showInputDialog(""
                            + "What would be the name of the Human Player?");
                    if(name1.equals(null) || name1.equals(""))
                    {
                        player1 = new Human();
                    }
                    else
                    {
                        player1 = new Human(name1);
                    }
                }
                else if(input.equals("AboveAverageComp"))
                {
                    String name1 = JOptionPane.showInputDialog(""
                            + "What would be the name of the AboveAverage"+
                            "Comp Player?");
                    if(name1.equals(null) || name1.equals(""))
                    {
                        player1 = new AboveAverageComputer();
                    }
                    else
                    {
                        player1 = new AboveAverageComputer(name1);
                    }
                }
                else if(input.equals("SuperComputer"))
                {
                    String name1 = JOptionPane.showInputDialog(""
                            + "What would be the name of the SuperComputer"
                            + " Player?");
                    if(name1.equals(null) || name1.equals(""))
                    {
                        player1 = new SuperComputerPlayer(game1.numMarbles());
                    }
                    else
                    {
                        player1 = new SuperComputerPlayer(name1,game1.numMarbles());
                    }
                }
            } 
            else if (response == JOptionPane.CLOSED_OPTION) 
            {
                // they closed the box
                System.out.println("Looks like you closed the dialog box, please"
                        + "run the program again.");
                keepPlaying = false;
            }

    }
     }
    public static void GetPlayer(Player player)
    {
       player1 = player;
    }
}
