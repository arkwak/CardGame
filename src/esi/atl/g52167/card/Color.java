package esi.atl.g52167.card;

/**
 * this enum is all the possible colors for a card
 *
 * @author Laurent
 */
public enum Color {

    /**
     * the color "club" or "trèfle"
     */
    CLUB("trèfle"),
    /**
     * the color "diamond" or "carreau"
     */
    DIAMOND("carreau"),
    /**
     * the color "heart" or "coeur"
     */
    HEART("coeur"),
    /**
     * the color "spade" or "pique"
     */
    SPADE("pique");
    private String fr;

    Color(String fr) {
        this.fr = fr;
    }

    /**
     *
     * @return
     */
    public String getString() {
        return fr;
    }

    @Override
    public String toString() {
        return fr;
    }

}
