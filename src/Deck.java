

public class Deck {



    private Rank r0 = new Rank("Two", 2);
    private Rank r1 = new Rank("Three", 3);
    private Rank r2 = new Rank("Four", 4);
    private Rank r3 = new Rank("Five", 5);
    private Rank r4 = new Rank("Six", 6);
    private Rank r5 = new Rank("Seven", 7);
    private Rank r6 = new Rank("Eight", 8);
    private Rank r7 = new Rank("Nine", 9);
    private Rank r8 = new Rank("Ten", 10);
    private Rank r9 = new Rank("Jack", 11);
    private Rank r10 = new Rank("Queen", 12);
    private Rank r11 = new Rank("King", 13);
    private Rank r12 = new Rank("Ace", 14);
    private Rank[] allRanks = {r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12};

    private Suit diamonds = new Suit("Diamonds", 0);
    private Suit hearts = new Suit("Hearts", 0);
    private Suit clubs = new Suit("Clubs", 0);
    private Suit spades = new Suit("Spades", 0);
    private Suit[] allSuites = {diamonds, hearts, clubs, spades};

    
    private Card[] allCards;

    public Deck() {

        allCards = new Card[52];
        int cardLength = 0;

        for (int i = 0; i < allSuites.length; i++) {

            for (int k = 0; k < allRanks.length; k++) {
                allCards[cardLength] = new Card(allRanks[k], allSuites[i]);
                System.out.println(allCards[cardLength]);
                cardLength++;
            }
        }
    }
}










