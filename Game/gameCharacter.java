public class gameCharacter {

  protected static String name;
  protected static int health;
  protected static int attackPower;

  public gameCharacter() {

    super();

  } // end of super constructor

  public gameCharacter(String name, int health, int attackPower) {

    this.name = name;
    this.health = health;
    this.attackPower = attackPower;

  } // end of constructor

  public int takeDamage(int damage) {

    Player.health = Player.health - Monster.attackPower;

    return damage;

  } // end takeDamage

  public String getName() {

    return name;

  } // end getName

  public int getAttackPower() {

    return attackPower;

  } // getAttackPower

  public int getHealth() {

    return health;

  } // end getHealth


} // end of class
