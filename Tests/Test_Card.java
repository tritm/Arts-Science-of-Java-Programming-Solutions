public class Test_Card {
    public static void main(String[] args) {
        Card mycard = new Card(Card.KING, Card.CLUB);
        int myrank = mycard.getRank();
        int mysuit = mycard.getSuit();
        if (myrank == 1) System.out.println("Rank of this card = " + Card.rankList[myrank - 1]);
        else System.out.println("Rank of this card = " + Card.rankList[myrank - 10]);
        System.out.println("Suite of this card = " + Card.suitList[mysuit - 1]);
        System.out.println("Name of this card is: ");
        System.out.println(mycard.toString());
    }


}
