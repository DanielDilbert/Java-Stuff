public class Char3 extends gameCharacter3 {

    protected static int stamina;
    protected static int XP;

    public Char3(String name, int health, int attackPower, int stamina, int XP) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.stamina = stamina;
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

        return "Rogue's health" + health;

    } // end toString

} // end class
