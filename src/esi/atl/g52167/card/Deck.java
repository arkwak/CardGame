/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *This class create a Deck of card 
 * @author Laurent
 */
public class Deck {
private List<Card> deckList;

    /**
     *Constructor of Deck
     * create a deck of 52 cards
     */
    public Deck() {
        // APA : Pourquoi une arrayList ?
        // APA : Pourquoi pas donner la taille ?
        this.deckList = new ArrayList<>();
        
        for (Color c: Color.values()){
            for (Value v: Value.values()){
                deckList.add(new Card(c,v));
            }
        }
           
    
        
       
    }
    
    /**
     *it shuffles the deck
     */
    public void shuffle(){
        Collections.shuffle(deckList);
    }
    
    /**
     *Check if the the is empty
     * @return True if the deck is empty, False if it is not
     */
    public boolean isEmpty(){
        return deckList.isEmpty();
    }
    
    /**
     *Take the first card of the deck and remove it from the deck
     * @return the first card of the deck
     */
    public Card hit(){
        // APA :  Qu'est ce qui se passe si le tas est vide ?
        Card draw =deckList.get(0);
        deckList.remove(0);
         return draw;
         // APA : return deckList.remove(0)
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List of Cards : ");
        sb.append(deckList.toString());
        
        return (sb.toString());

    }
    
    
    
    
    


}
