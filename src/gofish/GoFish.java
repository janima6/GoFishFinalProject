/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofish;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hot_m
 */
public class GoFish
{
    static final Random rng = new Random();
    static private ArrayList<Card> cards;
    static public Player[] Players;
 
    public static Card draw()
	{
		return cards.remove(rng.nextInt(cards.size()));
	}
 
	public static int deckSize()
	{
		return cards.size();
         }
 
    public static void main(String[] args)
    {
 
        cards = new ArrayList<Card>();
        for(int i=0;i<4;i++) { 
            for(Card c: Card.values())
                cards.add(c);
        }
        
       handCalculation cr = new handCalculation();
     
}
}