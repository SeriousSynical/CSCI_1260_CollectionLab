import java.util.Random;

public class Card {

    // Initializing Fields
    int attack;
    int defense;
    String creatureType;
    String damageType;


    // Constructors
    public Card(String creatureType, String damageType) {

        Random random = new Random();

        attack = random.nextInt(4) + 1;
        defense = random.nextInt(4) + 1;
        this.creatureType = creatureType;
        this.damageType = damageType;

    }

    public Card(int attack, int defense, String creatureType, String damageType) {

        this.attack = attack;
        this.defense = defense;
        this.creatureType = creatureType;
        this.damageType = damageType;

    }

    public Card(Card card) {

        this.attack = card.getAttack();
        this.defense = card.getDefense();
        this.creatureType = card.getCreatureType();
        this.damageType = card.getDamageType();

    }


    // Setters
    public void setAttack(int attack) {

        this.attack = attack;

    }

    public void setDefense(int defense) {

        this.defense = defense;

    }

    public void setCreatureType(String creatureType) {

        this.creatureType = creatureType;

    }

    public void setDamageType(String damageType) {

        this.damageType = damageType;

    }


    // Getters
    public int getAttack() {

        return this.attack;

    }

    public int getDefense() {

        return this.defense;

    }

    public String getCreatureType() {

        return this.creatureType;

    }

    public String getDamageType() {

        return this.damageType;

    }

}
