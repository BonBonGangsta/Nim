/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NimPackage;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author byrondepaz
 */
public class MarblesNim 
{
        
     public static void main(String[] args) throws IOException 
     {

        // First ask if the user wants to play a game.
        // createa a boolean that will stay true until the user does not want to
        // play any more
        boolean keepPlaying = true;
        Player player1 = null;
        Player player2 = null;
        
        while(keepPlaying)
        {
            // the code for this confirmation can be seen in JOptionPane javadoc
          int response = JOptionPane.showConfirmDialog(null,
                  "Want to play a game of Nim?", "Confirm",
                  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

          if (response == JOptionPane.NO_OPTION) 
          {
            // No was clicked in the dialog box
            System.out.println("If you change your mind, please rerun the app");
            keepPlaying = false;
          } 
          else if (response == JOptionPane.CLOSED_OPTION) 
          {
            // they closed the box
            System.out.println("Looks like you closed the dialog box, please"
                   + "run the program again.");
            keepPlaying = false;
          }
          else if (response == JOptionPane.YES_OPTION) 
          {
              Nim game = new Nim();
              System.out.println(game.startGame());
              player1 = getPlayers("player 1", game.remainingObjects());
              game.firstplayer(player1);
              System.out.println(game.firstPlayersName() +
                      " has been added");
              player2 = getPlayers("player 2" , game.remainingObjects());
              game.secondplayer(player2);
              System.out.println(game.secondPlayersName() + " has entered"
                      + " the arena.");
              if(player1.getRace() == "HUM" && player2.getRace() != "HUM")
                  {
                      while (game.remainingObjects()!= 1)
                      {    
                        game.player1Move(HumanPlayerMove(game));
                        game.player2Move()
                        
                  }
                  else
                  {
                      
                  }
              }
          } 

        }
     }
     
     public static Player getPlayers(String player, int pileNum)
     {
         Player tempPlay = null;
         boolean validPlayer = false;
         while (!validPlayer)
         {
         String input = JOptionPane.showInputDialog("Who will " + player + "?"
         + " Human, AboveAverageComputer or SuperComputer");
         if(input.equalsIgnoreCase("human") || input.equalsIgnoreCase("hum"))
         {
            String name = getNameOfPlayer();
            if(name == "" || name == null)
            {
                validPlayer = true;
                return tempPlay = new Human();
            }
            else
            {
                validPlayer = true;
                return tempPlay = new Human(name);
            }
         }
         else if (input.equalsIgnoreCase("aboveaveragecomputer")||
                 input.equalsIgnoreCase("AAC"))
         {
            String name = getNameOfPlayer();
            if(name == "" || name == null)
            {
                validPlayer = true;
                return tempPlay = new AboveAverageComputer();
            }
            else
            {
                validPlayer = true;
                return tempPlay = new AboveAverageComputer(name);
            }
         }
         else if (input.equalsIgnoreCase("SuperComputer") 
                 || input.equalsIgnoreCase("SCP"))
         {
             String name = getNameOfPlayer();
            if(name == "" || name == null)
            {
                validPlayer = true;
                return tempPlay = new SuperComputerPlayer(pileNum);
            }
            else
            {
                validPlayer = true;
                return tempPlay = new SuperComputerPlayer(name, pileNum);
            }
         }
     }
         return tempPlay;
     }
     
     public static String getNameOfPlayer()
     {
         String input = JOptionPane.showInputDialog("What name will you give"
         + " the player?");
         return input;     
     }
     
     public static int HumanPlayerMove(Nim game)
     {
       Nim tempGame = game;
       String input;
       int answer = 0;
       input = JOptionPane.showInputDialog("please enter the number of objects"
                  + " you would like to remove from the pile? 1 through "
                   + game.getMaxRemoval() + "." + "Current pile: " 
                    + game.remainingObjects() );
       
       Scanner scan = new Scanner(input);
       if(scan.hasNextInt())
       {
           answer = scan.nextInt();
           if(answer > 1 && answer < game.getMaxRemoval())
           {
               return answer;
           }
       }
        JOptionPane.showInputDialog("I need a number between 1 and " +
                   game.getMaxRemoval());
        return answer;
     }
     public static int CompPlayerMove()
}
