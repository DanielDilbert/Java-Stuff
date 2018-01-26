import java.security.SecureRandom;
import java.util.Scanner;

public class adventureGameRunner {

  public static void main(String[] args) {

  Dungeon myDungeon = new Dungeon(); // create new Dungeon

  Scanner input = new Scanner(System.in);
  SecureRandom randomChance = new SecureRandom();

  Room currentRoom = myDungeon.getRoom0();
  Room nextRoom = currentRoom;



  String Option;
  Boolean gameLoop = true;

  while (gameLoop) {

    if(currentRoom != null) {

    System.out.println(nextRoom);

    getInput(); // calling getInput Method

    Option = input.nextLine();

    if(Option.equalsIgnoreCase("n")) {

      nextRoom = nextRoom.getNorth(); // go North
      randomEncounter();

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go north. You are back in the Bathroom."); // if you cannot go north print error
        nextRoom = currentRoom;
      } // end if(nextRoom == null) loop
    } // end of option n

    else if(Option.equalsIgnoreCase("e")) {

      nextRoom = nextRoom.getEast(); // go East
      randomEncounter();

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go east. You are back in the Bathroom.");
        nextRoom = currentRoom;
      } // end if(nextRoom == null) loop
    } // end of option e

    else if(Option.equalsIgnoreCase("w")) {

      nextRoom = nextRoom.getWest(); // go West
      randomEncounter();

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go west. You are back in the Bathroom.");
        nextRoom = currentRoom;
    } // end if(nextRoom == null) loop
  } // end of option w

    else if(Option.equalsIgnoreCase("s")) {

      nextRoom = nextRoom.getSouth(); // go
      randomEncounter();

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go south. You are back in the Bathroom.");
        nextRoom = currentRoom;
    } // end if(nextRoom == null) loop
  } // end of option s

    else if(Option.equalsIgnoreCase("q")) {
        System.out.println("\nYou have quit the game.");
          break;
    } // end of option q

    else if (Option != "n") {
      System.out.println("\nThat is not a valid choice. Try again.");
      } // end of Invalid Choice
    } // end of if(nextRoom != null) loop
  } // end of while loop
} // end of main

  private static void getInput() {

    System.out.println("\nn. North");
    System.out.println("e. East");
    System.out.println("w. West");
    System.out.println("s. South");
    System.out.println("q. Quit");

} // end of getInput Method

  private static void combatOptions(int heroHealth, int heroAttack, int heroMagic, int monsterHealth, int monsterAttack, int monsterXP, String monsterName) {

    SecureRandom randomNumbers = new SecureRandom();
    Scanner input = new Scanner(System.in);
  /*Loop Control*/
  // Declare loop variable and initialize it to be true
    Boolean combatGame = true;
  // While the loop control variable is true
    while (combatGame){

  /*Report Combat Stats*/
  // Print the Monster's name
    System.out.println("\nYou are fighting a " + monsterName + "!");
  // Print the Monster's health
    System.out.print("The monster HP: ");
    System.out.println(monsterHealth);
  // Print the Player's health
    System.out.print("Your HP: ");
    System.out.println(heroHealth);
  // Print the Player's magic points
    System.out.print("Your MP: ");
    System.out.println(heroMagic);


  /*Combat menu prompt*/
    int Option;
    System.out.println("\nCombat Options:");
  // Print option 1: Sword Attack
    System.out.println("  1.) Sword Attack");
  // Print option 2: Cast Spell
    System.out.println("  2.) Cast Spell");
  // Print option 3: Cahrge Mana
    System.out.println("  3.) Charge Mana");
  // Print option 4: Run Away
    System.out.println("  4.) Run Away");
  // Prompt player for action
    System.out.print("What action do you want to perform? ");

  // Declare variable for user input (as number) and acquire value from Scanner object
    Option = input.nextInt();

  // If player chose option 1, (check with equality operator)
    if(Option == 1) {

    // Print attack text:
    // "You strike the <monster name> with your sword for <hero attack> damage"
      System.out.println("\nYou strike the " + monsterName + " with you sword for " + heroAttack + " damage.");
      monsterHealth = monsterHealth - (heroAttack + randomNumbers.nextInt(3));
      heroHealth = heroHealth - monsterAttack;
    // The monster attacks the player
      System.out.print("The " + monsterName + " hits you for ");
      System.out.println(monsterAttack);
  // Calculating how much damage was done and subtracting it from the monster's health

} // End of if statement.

  // Else if player chose option 2, (check with equality operator)
    else if(Option == 2) {
    if(heroMagic < 3){
        System.out.println("Sorry, you don't have enough mana for that.");
    } // End of if statement.
    if(heroMagic >= 3){
        heroHealth = heroHealth - monsterAttack;
    // Print spell message:
    // "You cast the weaken spell on the monster."
    System.out.println("\nYou cast the weaken spell on the monster.");
    // The monster's health is divided by 2 each time you cast the spell
    monsterHealth = monsterHealth / 2;
    // The hero uses up his magic by 3 points
    heroMagic = heroMagic - 3;
    // The monster attacks the player
    System.out.print("The " + monsterName + " hits you for ");
    System.out.println(monsterAttack);
    // Calculating how much magic damage was done and dividing it from monster's health
  } // End of if statement.
} // End of else if option 2 statement.
  //Else if the player chose option 3, (check with equality operator)
  else if(Option == 3) {
    // The monster attacks you
    heroHealth = heroHealth - monsterAttack;
    // Print charging messgae:
    // "You focus and charge your magic power."
    System.out.println("\nYou focus and charge your magic power.");
    // You gain 1 point of magic each time you charge
    heroMagic = heroMagic + 1;
      // The monster attacks the player
      System.out.print("The " + monsterName + " hits you for ");
      System.out.println(monsterAttack);
    // The hero charges his magic and gains 1 magic each time
  } // End of else if statement.

  // Else if player chose option 4, (check with equality operator)
  else if(Option == 4) {
    // Print retreat message:
    // "You ran away!"
    System.out.println("\nYou ran away!");
    combatGame = false;
    break;
  } // End of else if statement.

  // Else the player chose incorrectly
  else if(Option != 1) {
      // Print an error message:
      // "I don't understand that command."
    System.out.println("\nI don't understand that command.");
  } // End of else if statement.

  if (monsterHealth <= 0) {
    combatGame = false;
    System.out.println("\nYou defeated the " + monsterName + "!");
    break;
  }

  if (heroHealth <= 0) {
    combatGame = false;
    System.out.println("You have been slain.");

  } // End of if statement.

  if (!combatGame){
      System.out.println("\nGame over.");
      break;
  } // End of while statement.
} // End of while(combatGame) statement.
} // End of combatOption method.

private static void randomEncounter() {

  SecureRandom randomChance = new SecureRandom();

  // A Player is created
  Player Hero = new Player("Hero", 100, 30, 0);

  // The counter will start at one and increase by one each time
  for(int counter = 1; counter <= 1; counter ++) {

    // The encounter will start from 0 and change between 0-10
    int encounter = 0 + randomChance.nextInt(10);

    // If the encounter == 1, you will encounter a Goblin
    if(encounter == 1) {

      Monster Goblin = new Monster("Goblin", 80, 13, 3);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Goblin.health, Goblin.attackPower, Goblin.xP, Goblin.name);

    } // end encounter 1

    // If the encounter == 2, you will encounter a Zombie
    if(encounter == 2) {

      Monster Zombie = new Monster("Zombie", 86, 12, 4);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Zombie.health, Zombie.attackPower, Zombie.xP, Zombie.name);

    } // end encounter 2

    // If the encounter == 3, you will encounter a Dragon
    if(encounter == 3) {

      Monster Dragon = new Monster("Dragon", 90, 16, 12);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Dragon.health, Dragon.attackPower, Dragon.xP, Dragon.name);

    } // end encounter 3

    // If the encounter == 4, you will encounter Frankenstein
    if(encounter == 4) {

      Monster Frankenstein = new Monster("Frankenstein", 85, 14, 6);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Frankenstein.health, Frankenstein.attackPower, Frankenstein.xP, Frankenstein.name);

    } // end encounter 4

    // If the encounter == 5, you will encounter a Vampire
    if(encounter == 5) {

      Monster Vampire = new Monster("Vampire", 40, 12, 4);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Vampire.health, Vampire.attackPower, Vampire.xP, Vampire.name);

    } // end encounter 5

    // If the encounter == 6, you will encounter a Feral Dog
    if(encounter == 6) {

    Monster FeralDog = new Monster("Feral Dog", 25, 10, 2);

    combatOptions(Hero.health, Hero.attackPower, Hero.mana, FeralDog.health, FeralDog.attackPower, FeralDog.xP, FeralDog.name);

  } // end encounter 6

    // If the encounter == 7, you will encounter a Wyvern
    if(encounter == 7) {

    Monster Wyvern = new Monster("Wyvern", 98, 18, 9);

    combatOptions(Hero.health, Hero.attackPower, Hero.mana, Wyvern.health, Wyvern.attackPower, Wyvern.xP, Wyvern.name);

  } // end encounter 7

  } // end for statement

} // end of randomEncounter

} // end of class
