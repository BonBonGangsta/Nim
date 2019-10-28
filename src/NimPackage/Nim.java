/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author bydepa
 */
public class Nim {
    
    private Player playerJuan;
    private Player playerDos;
    private Pile gamePile;
    private int pileMarbles;
    private final int LOWERLIMIT = 10;
    private final int UPPERLIMIT = 100;
    
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
   
}
