/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.card;

/**
 *
 * @author Laurent
 */
public class Main {

    /**
     *this is the main class
     * @param args
     */
    public static void main(String[] args) {
        
        Deck deck = new Deck();
        deck.shuffle();
        /*
            if(args.length!=1)
                sout("il faut un seul argument")
        */
        try{
        for(int i = 0; i < Integer.parseInt(args[0]); i++){
            System.out.println(deck.hit());
        }
        }
        // APA : Peut être réglé en amont
         catch(IndexOutOfBoundsException e){
            System.out.println("USage: choose an integer between 1 and 52 ici");
        }
        catch(NumberFormatException e){
            System.out.println(" Usage : choose an integer");
        }
       
        catch( IllegalArgumentException e){
            System.out.println("Usage: choose an integer between 1 and 52");
        }
        
        
        
        
        
    }
}
