public class Player extends gameCharacter {

  protected static int mana;
  protected static int XP;

  public Player(String name, int health, int attackPower, int mana, int XP) {

    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
    this.mana = mana;
    this.XP = XP;

  } // end of constructor

  public static void attack(Monster Goblin) {

    Monster.health = Monster.health - Player.attackPower;

  } // end attack

  public void castSpell(Monster Goblin) {



  } // end castSpell

  public void chargeMana() {

    this.mana = mana + 5;

  } // end chargeMana

  public void takeTurn(Monster Goblin) {



  } // end takeTurn

  public int getMana() {

    this.mana = mana;

    return mana;

  } // end getMana

  public String toString() {

    return "Player's health" + health;

  } // end toString

} // end class
