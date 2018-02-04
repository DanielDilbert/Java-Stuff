public class Monster extends gameMonster {

  protected static int XP;

  public Monster(String name, int health, int attackPower, int XP) {

    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
    this.XP = XP;

  } // end of constructor

  public void attack(Player thePlayer) {

    Player.health = Player.health - Monster.attackPower;

  } // end Player

  public void takeTurn(Player thePlayer) {


  } // end takeTurn

  public int getXP() {

    return XP;

  } // getXP


} // end of class
