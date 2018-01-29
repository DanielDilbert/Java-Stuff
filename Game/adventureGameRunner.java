import java.security.SecureRandom;
import java.util.Scanner;

public class adventureGameRunner {

  public static void main(String[] args) {

  Dungeon myDungeon = new Dungeon(); // create new Dungeon

  Scanner input = new Scanner(System.in);
  //SecureRandom randomChance = new SecureRandom();

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
    System.out.println("\nYou are fighting a " + Monster.name + "!");
  // Print the Monster's health
    System.out.print("The monster HP: " + Monster.health + "\n");

  // Print the Player's health
    System.out.print("Your HP: " + Player.health + "\n");

  // Print the Player's magic points
    System.out.print("Your MP: " + Player.mana + "\n");



  /*Combat menu prompt*/
    int Option;
    String Choice;

    System.out.println("\nCombat Options:");
  // Print option 1: Sword Attack
    System.out.println("  1.) Sword Attack");
  // Print option 2: Cast Weaken
    System.out.println("  2.) Cast Weaken");
    // Print option 3: Heal
      System.out.println("  3.) Cast Heal");
  // Print option 4: Charge Mana
    System.out.println("  4.) Charge Mana");
  // Print option 5: Run Away
    System.out.println("  5.) Run Away");
  // Prompt player for action
    System.out.print("What action do you want to perform? ");

  // Declare variable for user input (as number) and acquire value from Scanner object
    Option = input.nextInt();


  // If player chose option 1, (check with equality operator)
    if(Option == 1) {

      System.out.println("\nYou strike the " + Monster.name + " with you sword for " + Player.attackPower + " damage.");
      Monster.health = Monster.health - (Player.attackPower + randomNumbers.nextInt(3));

    if (Monster.health > 0) {
      // The monster attacks the player
      Player.health = Player.health - Monster.attackPower;
      System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
    }

} // End of if statement.

    else if(Option == 2) {
    if(Player.mana < 3){
        System.out.println("Sorry, you don't have enough mana for that.");
    } // End of if statement.

    if(Player.mana >= 3){
        Player.health = Player.health - Monster.attackPower;

    System.out.println("\nYou cast the weaken spell on the monster.");

    Monster.health = Monster.health / 2;

    Player.mana = Player.mana - 3;

    System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

  } // End of if statement.
} // End of else if option 2 statement.

    else if(Option == 3) {
      if(Player.mana < 2){
        System.out.println("Sorry, you don't have enough mana for that.");
      } // End of if statement.

      if(Player.mana >= 2){
        Player.health = Player.health - Monster.attackPower;

        System.out.println("\nYou heal yourself for 36 HP.");

        Player.health = Player.health + 36;

        Player.mana = Player.mana - 2;

        System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

      } // End of if statement.
    } // End of else if option 3 statement.

  else if(Option == 4) {

    Player.health = Player.health - Monster.attackPower;

    System.out.println("\nYou focus and charge your magic power.");

    Player.mana = Player.mana + 1;

    System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

  } // End of else if statement.

  else if(Option == 4) {

    System.out.println("\nYou ran away!");
    //combatGame = false;
    break; // Continues to outerloop
  } // End of else if statement.

  else if(Option != 1) {

    System.out.println("\nI don't understand that command.");
  } // End of else if statement.

  if (Monster.health <= 0) {
    //combatGame = false;
    System.out.println("\nYou defeated the " + Monster.name + "!");
    break;
  }

  if (Player.health <= 0) {
    combatGame = false;
    System.out.println("You have been slain.");

  } // End of if statement.

  if (!combatGame){

      System.out.println("\nGame over.");

      System.out.println("Would you like to play again?");

    Scanner choice = new Scanner(System.in);
    Choice = choice.nextLine();

      if(Choice.equalsIgnoreCase("y"))  {

        // Restart entire game
      }

      else if(Choice.equalsIgnoreCase("n")) {
        //combatGame = false;

        break;

      }

      else if (Choice != "y") {

        System.out.println("\nThat is not a valid choice. Try again.");
      }


  } // End of while statement.
} // End of while(combatGame) statement.
} // End of combatOption method.

private static void randomEncounter() {

  SecureRandom randomChance = new SecureRandom();

  // A Player is created
  // Try to implement more Player's and implement the ability to choose a specific Player at the start
  Player Hero = new Player("Daniel", 100, 30, 0);

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

    // If the encounter == 8, you will encounter a Ghoul
    if(encounter == 8) {

      Monster Ghoul = new Monster("Ghoul", 36, 13, 5);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Ghoul.health, Ghoul.attackPower, Ghoul.xP, Ghoul.name);

    } // end encounter 8

    // If the encounter == 9, you will encounter a Leviathian
    if(encounter == 9) {

      Monster Leviathan = new Monster("Leviathan", 126, 27, 15);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Leviathan.health, Leviathan.attackPower, Leviathan.xP, Leviathan.name);

    } // end encounter 9

    // If the encounter == 10, you will encounter a Golgothan
    if(encounter == 10) {

      Monster Golgothan = new Monster("Golgothan", 59, 11, 6);

      combatOptions(Hero.health, Hero.attackPower, Hero.mana, Golgothan.health, Golgothan.attackPower, Golgothan.xP, Golgothan.name);

    } // end encounter 10

  } // end for statement

} // end of randomEncounter

} // end of class
