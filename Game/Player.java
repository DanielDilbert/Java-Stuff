public class Player extends gameCharacter {

  protected static int mana;

  public Player(String name, int heroHealth, int attackPower, int mana) {

    this.name = name;
    this.health = heroHealth;
    this.attackPower = attackPower;
    this.mana = mana;

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
