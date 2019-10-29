/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;
import java.util.Random;

/**
 *
 * @author bydepa
 */
public class Nim {
    
    private Player playerJuan; // the first player
    private Player playerDos; // the second player
    private Pile gamePile; // pile of objects the game has
    private int pileMarbles; // number of objects in the pile
    private final int LOWERLIMIT = 10; // min number of objects needed to play
    private final int UPPERLIMIT = 100; // max ''   ''  ''  ''  ''  ''
    private int maxRemoval;
    
    public String startGame(){
        Random pileGenerator = new Random();
        pileMarbles = pileGenerator.nextInt(UPPERLIMIT - LOWERLIMIT)
                   + LOWERLIMIT;
        
        gamePile = new Pile(pileMarbles);
        maxRemoval = gamePile.numMarbles() / 2 ;
        
        return "" + gamePile.numMarbles();
    }
    
    
    public boolean isValid(int potentialMove)
    {
        int currentPile = gamePile.numMarbles();
        
        return potentialMove > 1 && potentialMove < (getMaxRemoval());
    }
    
    public void firstplayer(Player player1)
    {
        this.playerJuan = player1;
    }
    
    public void secondplayer(Player player2)
    {
        this.playerDos = player2;
    }
    
    public String player1Move(int statMove)
    {
        if (this.isValid(statMove))
        {
          gamePile.removeMarbles(playerJuan.move(statMove));
          return playerJuan.playerName() +" has removed " + statMove 
                  + " objects from the pile."
                  + " the pile is now : " + gamePile.numMarbles();
        }
        return "Move is not valid, the current pile is " + 
                gamePile.numMarbles();
    }
    
    public String player2Move(int statMove)
    {
        if(this.isValid(statMove))
        {
            gamePile.removeMarbles(playerDos.move(statMove));
            return playerDos.playerName() + " has removed " + statMove 
                    + " objects from the pile."
                    + " the pile is now : " + gamePile.numMarbles();
        }
        return "move is not valid, the current pile is " + 
                gamePile.numMarbles();
    }
    
    public int remainingObjects()
    {
        return gamePile.numMarbles();
    }
    
    public String firstPlayersName()
    {
        return playerJuan.playerName();
    }
    
    public String secondPlayersName()
    {
        return playerDos.playerName();
    }
    
    public int getMaxRemoval()
    {
        return gamePile.numMarbles() / 2 ;
    }
}

