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
    
    
    public void startGame(){
        Random pileGenerator = new Random();
        pileMarbles = pileGenerator.nextInt(UPPERLIMIT - LOWERLIMIT)
                   + LOWERLIMIT;
        
        gamePile = new Pile(pileMarbles);
    }
    
    
    public boolean isValid(int potentialMove)
    {
        int currentPile = gamePile.numMarbles();
        
        return potentialMove > 1 && potentialMove < (currentPile /2);
    }
    
    public void firstplayer(Player player1)
    {
        this.playerJuan = player1;
    }
    
    public void secondplayer(Player player2)
    {
        this.playerDos = player2;
    }
    
    public String p1Move(int statMove)
    {
        if (this.isValid(statMove))
        {
            playerJuan.move(statMove)
        }
    }
   
}
