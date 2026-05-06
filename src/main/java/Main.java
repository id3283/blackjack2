import java.util.ArrayList;

public class Main {

    static int HAND_SIZE = 2;

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand marbinsHand  = new Hand();

        Card card = deck.deal();
        marbinsHand.deal(card);



//
//
//        ArrayList<Playa> playas = new ArrayList<>();
//        playas.add (new Playa("John", new Hand()));
//
//        Hand newHand = new Hand();
//        playas.add (new Playa("Zo", newHand));
//
//        playas.add (new Playa("Dave", new Hand()));
//        playas.add (new Playa("Marbin", new Hand()));
//        playas.add (new Playa("Jose", new Hand()));
//        playas.add (new Playa("Utsav", new Hand()));
//
//        for (int i = 0; i < HAND_SIZE; i++) {
//            System.out.println("loop count: " + i);
//
//            for (Playa playa: playas) {
//                Card theCard = deck.deal();
//                playa.setCard(theCard);
//            }
//        }

        System.out.println();


//
//        System.out.println("dave's score: " + dave.getValue());
//        System.out.println("wendy's score: " + wendy.getValue());
//
//        Hand winner = pickWinner(dave, wendy);
//        if(winner == dave) {
//            System.out.println("Dave wins, Dave wins!  Dave wins!");
//        }
//        else if (winner == wendy) {
//            System.out.println("sigh....");
//        }
//        else {
//            System.out.println("No winner... all losers.");
//        }
    }

    private static Playa pickWinner(Playa a, Playa b) {
        if(a.hand.getValue() > b.hand.getValue()) {
            if(a.hand.getValue() <= 21) {
                return a;
            }
        }
        if (b.hand.getValue() <=21) {
            return b;
        }
        return null;
    }
}