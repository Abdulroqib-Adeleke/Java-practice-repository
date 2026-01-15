package OOP;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class CardMain {
    public static void main(String[] args) {

        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand.print();
        } else {
            System.out.println("hands are equal");
        }
    }
}

enum Suit{
    CLUB, DIAMOND, HEART, SPADE;
}

class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card card){
        if(this.value != card.value)
            return this.value - card.value;

        return this.suit.ordinal() - card.suit.ordinal();
    }

}

class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2){

        int suitCompare = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if(suitCompare != 0)
            return suitCompare;

        return c1.getValue() - c2.getValue();
    }
}

class Hand implements Comparable<Hand>{
    private List<Card> list;

    public Hand(){
        list = new ArrayList<>();
    }

    public void add(Card card){
        list.add(card);
    }

    public void print(){
        Iterator<Card> itr = list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }

    public void sort(){
        Collections.sort(list);
    }

    public int totalValue(){
        int sum = 0;
        Iterator<Card> itr = list.iterator();
        while(itr.hasNext()){
            sum += itr.next().getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand hand){
        return totalValue() - hand.totalValue();
    }

    public void sortBySuit(){
        Collections.sort(list, new BySuitInValueOrder());
    }
}
