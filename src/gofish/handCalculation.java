/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;

import static gofish.GoFish.*;

/**
 *
 * @author hot_m
 */
public class handCalculation {
    static public Player[] Players;
   
        public static void calc (){
         Player h = new HumanPlayer();
        Player ai = new AIPlayer();
          Players = new Player[] {h, ai};

        while(Players[0].getNumBooks() + Players[1].getNumBooks() < 13)
        {
            Players[0].haveTurn();
            System.out.println("----------");
            Players[1].haveTurn();
            System.out.println("----------");
        }
 
        int yScore = Players[0].getNumBooks(); 
        int aiScore = Players[1].getNumBooks();
        if(yScore > aiScore)
            System.out.println("Congratulations, you win "+ yScore + " to "+ aiScore +"!");
            
        else if (aiScore > yScore)
            System.out.println("The terrible AI beat you "+ yScore + " to "+ aiScore +"...");
        else
            System.out.println("It's a tie at "+yScore+" each!");
    
        }
}

