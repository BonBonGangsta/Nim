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
public class Pile {
    private int totalMarbles;
    private int maxRemoval;
    
    public Pile()
    {
        this.totalMarbles = 100;
        
    }
    
    public Pile(int marbles)
    {
        this.totalMarbles = marbles;
    }
    
    private void setMaxRemoval ()
    {
        this.maxRemoval = Math.floorDiv(totalMarbles, 2);
    }
}
