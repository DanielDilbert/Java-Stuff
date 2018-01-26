public class Monster extends gameCharacter {

  protected int xP;

  public Monster(String name, int health, int attackPower, int xP) {

    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
    this.xP = xP;

  } // end of constructor

  public void attack(Player thePlayer) {

    Player.health = Player.health - Monster.attackPower;

  } // end Player

  public void takeTurn(Player thePlayer) {


  } // end takeTurn

  public int getXP() {

    return xP;

  } // getXP


} // end of class
