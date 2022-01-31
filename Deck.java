public class Deck {

    // Initializing Fields
    private final int maxSize;
    private int currentSize;
    private final boolean[] availability;
    private final Card[] deck;


    // Constructors
    public Deck() {

        this.maxSize = 30;
        this.currentSize = 0;
        this.availability = new boolean[this.maxSize];
        for (int i = 0; i < this.maxSize; i++) {

            this.availability[i] = false;

        }
        this.deck = new Card[this.maxSize];

    }

    public Deck(int maxSize) {

        this.maxSize = maxSize;
        this.currentSize = 0;
        this.availability = new boolean[this.maxSize];
        for (int i = 0; i < this.maxSize; i++) {

            this.availability[i] = false;

        }
        this.deck = new Card[this.maxSize];

    }

    public Deck(Deck deck) {

        this.maxSize = deck.getMaxSize();
        this.currentSize = deck.getCurrentSize();
        this.availability = new boolean[this.maxSize];
        for (int i = 0; i < this.maxSize; i++) {

            this.availability[i] = deck.getAvailability(i);

        }
        this.deck = new Card[this.maxSize];
        for (int i = 0; i < this.maxSize; i++) {

            this.deck[i] = new Card(deck.getCard(i));

        }
    }


    // Getters
    public int getMaxSize() {

        return this.maxSize;

    }

    public int getCurrentSize() {

        return this.currentSize;

    }

    public boolean getAvailability(int index) {

        return this.availability[index];

    }

    public Card getCard(int cardIndex) {

        return this.deck[cardIndex];

    }


    // Managing Cards
    public void addCard(String creatureType, String damageType) {

        if (currentSize < maxSize) {

            this.deck[this.currentSize++] = new Card(creatureType, damageType);

        }

    }

    public void dealCard(int cardIndex) {

        this.availability[cardIndex] = true;

    }

    public void returnCard(int cardIndex) {

        this.availability[cardIndex] = true;
        currentSize++;

    }

    // Printing Deck
    public void printDeck() {

        int i = 0;
        for (Card card : this.deck) {

            System.out.print("Creature: " + card.getDamageType() + " " + card.getCreatureType() + " Atk: " + card.getAttack() + " Def: " + card.getDefense() + " Dealt: ");
            if (availability[i]) {

                System.out.println("Y");

            } else {

                System.out.println("N");

            }
            i++;

        }

    }

}
