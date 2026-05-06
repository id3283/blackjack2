public class Playa {
    String name;
    Hand hand;

    public void setCard(Card card) {
        this.hand.deal(card);
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Playa(String name, Hand hand) {
        this.name = name;
        this.hand = hand;

    }
}
