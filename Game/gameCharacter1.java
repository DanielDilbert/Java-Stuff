public class gameCharacter1 {

    protected static String name;
    protected static int health;
    protected static int attackPower;
    protected static int monsterHealth;

    public gameCharacter1() {


    }

    public gameCharacter1(String name, int health, int attackPower) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.monsterHealth = health;

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
