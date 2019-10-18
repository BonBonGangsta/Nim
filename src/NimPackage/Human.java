/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;

/**
 *
 * @author byrondepaz
 */
public class Human implements Player {
    private String name = "human";
    private int marblesTaken;
    
    public void move(int pile)
    {
        
    }

    public String playerName() 
    {
        return name;
    }
}
