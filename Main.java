public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        String[] elements = new String[] {"Fire", "Ice", "Thunder", "Emotional"};
        String[] creatures = new String[] {"Slime", "Skeleton", "Zombie", "Dragon", "Bear", "Dude"};

        Deck deck = new Deck(elements.length * creatures.length);

        for (String element : elements) {

            for (String creature : creatures) {

                deck.addCard(creature, element);

            }

        }

        System.out.println("Current Deck:");
        deck.printDeck();
        System.out.println();

        deck.dealCard(creatures.length);

        System.out.println("Current Deck:");
        deck.printDeck();
        System.out.println();

        Deck deck2 = new Deck(deck);

        System.out.println("Second Deck:");
        deck2.printDeck();
        System.out.println();

    }

}
