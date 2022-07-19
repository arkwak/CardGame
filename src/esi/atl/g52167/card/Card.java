package esi.atl.g52167.card;
/**
 *this class permit to create a card
 * @author Laurent
 */
public class Card {
    // APA : final ?
    private Color CardColor;
    private Value CardValue;
    
    /**
     *Constructor of Card
     * @param CardColor the color of the card
     * @param CardValue the value of the card
     */
    public Card(Color CardColor, Value CardValue){
        if(CardColor==null || CardValue==null){
            // APA : IllegalArgumentException
        throw new NullPointerException("choose a color and a value for the card");
        }
        
        this.CardColor=CardColor;
        this.CardValue=CardValue;
    }

    @Override
    public String toString() {
        return CardValue+" de "+CardColor;
    }
    
    
    
}
