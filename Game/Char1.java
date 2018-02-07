public class Char1 extends gameCharacter1 {

    protected static int stamina;
    protected static int XP;

    public Char1(String name, int health, int attackPower, int mana, int XP) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.stamina = mana;
        this.XP = XP;

    } // end of constructor

    public static void attack(Monster Goblin) {

        Monster.health = Monster.health - Char1.attackPower;

    } // end attack

    public void castSpell(Monster Goblin) {



    } // end castSpell

    public void chargeMana() {

        this.stamina = stamina + 5;

    } // end chargeMana

    public void takeTurn(Monster Goblin) {



    } // end takeTurn

    public int getMana() {

        this.stamina = stamina;

        return stamina;

    } // end getMana

    public String toString() {

        return "Archers's health" + health;

    } // end toString

} // end class
