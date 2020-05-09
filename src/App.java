import processing.core.PApplet;

public class App extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("App");
        Rank r0 = new Rank ("Two", 2);
        Rank r1 = new Rank ("Three", 3);
        Rank r2 = new Rank ("Four", 4);
        Rank r3 = new Rank ("Five", 5);
        Rank r4 = new Rank ("Six", 6);
        Rank r5 = new Rank ("Seven", 7);
        Rank r6 = new Rank ("Eight", 8);
        Rank r7 = new Rank ("Nine", 9);
        Rank r8 = new Rank ("Ten", 10);
        Rank r9 = new Rank ("Jack", 11);
        Rank r10 = new Rank ("Queen", 12);
        Rank r11 = new Rank ("King", 13);
        Rank r12 = new Rank ("Ace", 14);

        Suit s0 = new Suit ("Diamonds",0);
        Suit s1 = new Suit ("Hearts", 0);
        Suit s2 = new Suit ("Clubs", 0);
        Suit s3 = new Suit ("Spades", 0);
    }

}
