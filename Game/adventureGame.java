import java.security.SecureRandom;
import java.util.Scanner;

public class adventureGame {

  public static void main(String[] args) {

      Dungeon myDungeon = new Dungeon(); // create new Dungeon
      //randomEncounter fight = new randomEncounter();
      /*
      Create more Player's for a four Player team. Example: Knight, Archer, Mage, Rogue
       */

      Player Knight = new Player("Daniel", 125, 30, 3, 0); // Player's stats are kept at the end of each battle.

      Char1 Archer = new Char1("Josh", 80, 16, 3, 0);

      Char2 Mage = new Char2("Lawrence", 60, 9, 6, 0);

      Char3 Rogue = new Char3("Chris", 75, 19, 3, 0);


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

      randomChance.nextInt(20);
      if (randomChance.nextInt() >= 2) {
        randomEncounter();
      }

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go north. You are back in the Living Room."); // if you cannot go north print error
        nextRoom = currentRoom;
      } // end if(nextRoom == null) loop
    } // end of option n

    else if(Option.equalsIgnoreCase("e")) {

      nextRoom = nextRoom.getEast(); // go East

      randomChance.nextInt(20);
      if (randomChance.nextInt() >= 2) {
        randomEncounter();
      }

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go east. You are back in the Living Room.");
        nextRoom = currentRoom;
      } // end if(nextRoom == null) loop
    } // end of option e

    else if(Option.equalsIgnoreCase("w")) {

      nextRoom = nextRoom.getWest(); // go West

      randomChance.nextInt(20);
      if (randomChance.nextInt() >= 2) {
          randomEncounter();
      }
        if(nextRoom == null) {
          System.out.println("\nError. You cannot go west. You are back in the Living Room.");
          nextRoom = currentRoom;
    } // end if(nextRoom == null) loop
  } // end of option w

    else if(Option.equalsIgnoreCase("s")) {

      nextRoom = nextRoom.getSouth(); // go

      randomChance.nextInt(20);
      if (randomChance.nextInt() >= 2) {
        randomEncounter();
      }

      if(nextRoom == null) {
        System.out.println("\nError. You cannot go south. You are back in the Living Room.");
        nextRoom = currentRoom;
    } // end if(nextRoom == null) loop
  } // end of option s

    else if(Option.equalsIgnoreCase("q")) {
        System.out.println("\nYou have quit the game.");
          gameLoop = false;
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

private static void randomEncounter() {

  SecureRandom randomChance = new SecureRandom();

  // A Player is created
  // Try to implement more Player's and implement the ability to choose a specific Player at the start



  // The counter will start at one and increase by one each time
  for(int counter = 1; counter <= 1; counter ++) {

    // The encounter will start from 0 and change between 0-10
    int encounter = randomChance.nextInt(10);

    // If the encounter == 1, you will encounter a Goblin
    if(encounter == 1) {

      Monster Goblin = new Monster("Goblin", 80, 13, 3);

      combatOptions(Goblin.health, Goblin.attackPower, Goblin.XP, Goblin.name);

    } // end encounter 1

    // If the encounter == 2, you will encounter a Zombie
    if(encounter == 2) {

      Monster Zombie = new Monster("Zombie", 86, 12, 4);

      combatOptions(Zombie.health, Zombie.attackPower, Zombie.XP, Zombie.name);

    } // end encounter 2

    // If the encounter == 3, you will encounter a Dragon
    if(encounter == 3) {

      Monster Dragon = new Monster("Dragon", 90, 16, 12);

      combatOptions(Dragon.health, Dragon.attackPower, Dragon.XP, Dragon.name);

    } // end encounter 3

    // If the encounter == 4, you will encounter Frankenstein
    if(encounter == 4) {

      Monster Frankenstein = new Monster("Frankenstein", 85, 14, 6);

      combatOptions(Frankenstein.health, Frankenstein.attackPower, Frankenstein.XP, Frankenstein.name);

    } // end encounter 4

    // If the encounter == 5, you will encounter a Vampire
    if(encounter == 5) {

      Monster Vampire = new Monster("Vampire", 40, 12, 4);

      combatOptions(Vampire.health, Vampire.attackPower, Vampire.XP, Vampire.name);

    } // end encounter 5

    // If the encounter == 6, you will encounter a Feral Dog
    if(encounter == 6) {

    Monster FeralDog = new Monster("Feral Dog", 25, 10, 2);

    combatOptions(FeralDog.health, FeralDog.attackPower, FeralDog.XP, FeralDog.name);

  } // end encounter 6

    // If the encounter == 7, you will encounter a Wyvern
    if(encounter == 7) {

    Monster Wyvern = new Monster("Wyvern", 98, 18, 9);

    combatOptions(Wyvern.health, Wyvern.attackPower, Wyvern.XP, Wyvern.name);

  } // end encounter 7

    // If the encounter == 8, you will encounter a Ghoul
    if(encounter == 8) {

      Monster Ghoul = new Monster("Ghoul", 36, 13, 5);

      combatOptions(Ghoul.health, Ghoul.attackPower, Ghoul.XP, Ghoul.name);

    } // end encounter 8

    // If the encounter == 9, you will encounter a Leviathian
    if(encounter == 9) {

      Monster Leviathan = new Monster("Leviathan", 126, 27, 15);

      combatOptions(Leviathan.health, Leviathan.attackPower, Leviathan.XP, Leviathan.name);

    } // end encounter 9

    // If the encounter == 10, you will encounter a Golgothan
    if(encounter == 10) {

      Monster Golgothan = new Monster("Golgothan", 59, 11, 6);

      combatOptions(Golgothan.health, Golgothan.attackPower, Golgothan.XP, Golgothan.name);

    } // end encounter 10

  } // end for statement

} // end of randomEncounter



  private static void combatOptions(/*int heroHealth, int heroAttack, int heroMagic, */int monsterHealth, int monsterAttack, int monsterXP, String monsterName) {

    SecureRandom randomNumbers = new SecureRandom();
    Scanner input = new Scanner(System.in);

    /*Loop Control*/
    // Declare loop variable and initialize it to be true
    Boolean combatGame = true;
    Boolean FirstTurn = true;
    Boolean SecondTurn = true;
    Boolean ThirdTurn = true;

    // While the loop control variable is true
    /*Loop:*/
    while (combatGame) {

      /*Report Combat Stats*/
      // Print the Monster's name
      System.out.println("\nYou are fighting a " + Monster.name + "!");

      // Print the Monster's health
      System.out.print("The monster HP: " + Monster.health + "\n");

      // Print the Player's health
      System.out.print("Your HP: " + Player.health + "      ");
      System.out.print("Archer's HP: " + Char1.health + "      ");
      System.out.print("Mage's HP: " + Char2.health + "      ");
      System.out.print("Rogue's HP: " + Char3.health + "\n");

      // Print the Player's magic points
      System.out.print("Your MP: " + Player.mana + "        ");
      System.out.print("Archer's stamina: " + Char1.stamina + "        ");
      System.out.print("Mage's mana: " + Char2.mana + "        ");
      System.out.print("Rogue's stamina: " + Char3.stamina + "\n");

      // Print the Player's experience points
      System.out.print("Your XP: " + Player.XP + "        ");
      System.out.print("Archer's XP: " + Char1.XP + "        ");
      System.out.print("Mage's XP: " + Char1.XP + "        ");
      System.out.print("Rogue's XP: " + Char3.XP + "\n");

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
      if (Option == 1) {

        System.out.println("\nYou strike the " + Monster.name + " with your sword." /* for " + Player.attackPower  + " damage."*/);
        Monster.health = Monster.health - (Player.attackPower + randomNumbers.nextInt(3));

        FirstTurn = false;

        if (Monster.health > 0) {
          // The monster attacks the player
          Player.health = Player.health - Monster.attackPower;
          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
          FirstTurn = false;
        }
      } // End of if statement.

      else if (Option == 2) {
        if (Player.mana < 3) {
          System.out.println("Sorry, you don't have enough mana for that.");
        } // End of if statement.

        if (Player.mana >= 3) {
          Player.health = Player.health - Monster.attackPower;

          System.out.println("\nYou cast the weaken spell on the monster.");
          Monster.health = Monster.health / 2;
          Player.mana = Player.mana - 3;

          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
          FirstTurn = false;
        } // End of if statement.
      } // End of else if option 2 statement.

      else if (Option == 3) {
        if (Player.mana < 2) {
          System.out.println("Sorry, you don't have enough mana for that.");
        } // End of if statement.

        if (Player.mana >= 2) {

          System.out.println("Who would you like to heal?");
          System.out.println("Type s to heal yourself");
          System.out.println("Type a to heal the Archer");
          System.out.println("Type m to heal the Mage");
          System.out.println("Type r to heal the Rogue");

          Scanner choice = new Scanner(System.in);
          Choice = choice.nextLine();

          if (Choice.equalsIgnoreCase("s")) {
            Player.health = Player.health - Monster.attackPower;

            System.out.println("\nYou heal yourself for 36 HP.");
            Player.health = Player.health + 36;
            Player.mana = Player.mana - 2;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            FirstTurn = false;
          } // end self heal

          if (Choice.equalsIgnoreCase("a")) {
            Player.health = Player.health - Monster.attackPower;

            System.out.println("\nYou heal the Archer for 36 HP.");
            Char1.health = Char1.health + 36;
            Player.mana = Player.mana - 2;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            FirstTurn = false;
          } // end Archer heal

            if (Choice.equalsIgnoreCase("m")) {
          Player.health = Player.health - Monster.attackPower;

          System.out.println("\nYou heal the Mage for 36 HP.");
          Char2.health = Char2.health + 36;
          Player.mana = Player.mana - 2;

          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
          FirstTurn = false;
        } // end Mage heal

          if (Choice.equalsIgnoreCase("r")) {
            Player.health = Player.health - Monster.attackPower;

            System.out.println("\nYou heal the Rogue for 36 HP.");
            Char3.health = Char3.health + 36;
            Player.mana = Player.mana - 2;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            FirstTurn = false;
          } // end Rogue heal

        } // End of if statement.
      } // End of else if option 3 statement.

      else if (Option == 4) {

        Player.health = Player.health - Monster.attackPower;

        System.out.println("\nYou focus and charge your magic power.");
        Player.mana = Player.mana + 1;

        System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
        FirstTurn = false;

      } // End of else if statement.

      else if (Option == 5) {

        System.out.println("\nYou ran away!");

        break; // Continues to outer loop
      } // End of else if statement.

      else if (Option != 1) {

        System.out.println("\nI don't understand that command.");
      } // End of else if statement.

      if (Player.health <= 0) {
        combatGame = false;
        System.out.println("You have been slain.");
      }

      if (!combatGame) {

        System.out.println("\nGame over.");

        System.out.println("Would you like to play again?");

        Scanner choice = new Scanner(System.in);
        Choice = choice.nextLine();

        if (Choice.equalsIgnoreCase("y")) {
          break; // Continues the game atm
          // Restart entire game
        } else if (Choice.equalsIgnoreCase("n")) {

          break;  // end the entire program!!?!!?!!
        } else if (Choice != "y") {

          System.out.println("\nThat is not a valid choice. Try again.");
        }
      } // End of if statement.


      if (Monster.health <= 0) {

        System.out.println("\nYou defeated the " + Monster.name + "!");
        System.out.println("You have gained " + Monster.XP + "XP");
        Player.XP = Player.XP + Monster.XP;
        Char1.XP = Char1.XP + Monster.XP;
        Char2.XP = Char2.XP + Monster.XP;

      // Level up!
      if (Player.XP >= 9 || Char1.XP >= 9 || Char2.XP >= 9) {
        System.out.println("You leveled up!");
        Player.health = Player.health + 15;
        Char1.health = Char1.health + 12;
        Char1.health = Char2.health + 6;

        Player.attackPower = Player.attackPower + 4;
        Char1.attackPower = Char1.attackPower + 2;
        Char2.attackPower = Char2.attackPower + 1;

        Player.XP = Player.XP - Player.XP;
        Char1.XP = Char1.XP - Char1.XP;
        Char2.XP = Char2.XP - Char2.XP;
      } // end level up
        break; // goes on to next turn
    } // end monster death

      /* **********************************************BEGIN SECOND TURN***************************************************************** */
      // After the Player's turn, the archer will take its turn
      // test
      if (!FirstTurn) {

        /*Report Combat Stats*/
        // Print the Monster's name
        System.out.println("\nYou are fighting a " + Monster.name + "!");

        // Print the Monster's health
        System.out.print("The monster HP: " + Monster.health + "\n");

        // Print the Player's health
        System.out.print("Your HP: " + Player.health + "      ");
        System.out.print("Archer's HP: " + Char1.health + "      ");
        System.out.print("Mage's HP: " + Char2.health + "      ");
        System.out.print("Rogue's HP: " + Char3.health + "\n");

        // Print the Player's magic points
        System.out.print("Your MP: " + Player.mana + "        ");
        System.out.print("Archer's stamina: " + Char1.stamina + "        ");
        System.out.print("Mage's mana: " + Char2.mana + "        ");
        System.out.print("Rogue's stamina: " + Char3.stamina + "\n");

        // Print the Player's experience points
        System.out.print("Your XP: " + Player.XP + "        ");
        System.out.print("Archer's XP: " + Char1.XP + "        ");
        System.out.print("Mage's XP: " + Char1.XP + "        ");
        System.out.print("Rogue's XP: " + Char3.XP + "\n");


        System.out.println("\nCombat Options for Archer:");
        // Print option 1: Bow Attack
        System.out.println("  1.) Bow Attack");
        // Print option 2: Cast Pin Point
        System.out.println("  2.) Cast Pin Point");
        // Print option 3: Charge Stamina
        System.out.println("  3.) Charge Stamina");
        // Prompt player for action
        System.out.print("What action do you want to perform? ");

        Option = input.nextInt();


        // If player chose option 1, (check with equality operator)
        if (Option == 1) {

          System.out.println("\nYou strike the " + Monster.name + " with your bow.");
          Monster.health = Monster.health - (Char1.attackPower + randomNumbers.nextInt(3));

          if (Monster.health > 0) {
            // The monster attacks the player
            Char1.health = Char1.health - Monster.attackPower;
            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            SecondTurn = false;

          }

        } // End of if statement.

        else if (Option == 2) {
          if (Char1.stamina < 3) {
            System.out.println("Sorry, you don't have enough stamina for that.");
          } // End of if statement.

          if (Char1.stamina >= 3) {
            Char1.health = Char1.health - Monster.attackPower;

            System.out.println("\nYou use Pin Point on the monster.");
            Monster.health = Monster.health / 2;
            Char1.stamina = Char1.stamina - 3;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            SecondTurn = false;

          } // End of if statement.
        } // End of else if option 2 statement.

        else if (Option == 3) {

          Char1.health = Char1.health - Monster.attackPower;

          System.out.println("\nYou focus and charge your stamina.");
          Char1.stamina = Char1.stamina + 1;

          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
          SecondTurn = false;

        } // End of else if statement.
      } // End of if statement.

      else if (Option != 1) {

        System.out.println("\nI don't understand that command.");
      } // End of else if statement.

      if (Char1.health <= 0) {
        combatGame = false;
        System.out.println("Archer has been slain!");
      }

      if (!combatGame) {

        System.out.println("\nGame over.");

        System.out.println("Would you like to play again?");

        Scanner choice = new Scanner(System.in);
        Choice = choice.nextLine();

        if (Choice.equalsIgnoreCase("y")) {
          break; // Continues the game atm
          // Restart entire game
        } else if (Choice.equalsIgnoreCase("n")) {

          break;  // end the entire program!!?!!?!!
        } else if (Choice != "y") {

          System.out.println("\nThat is not a valid choice. Try again.");
        }
      } // End of if statement.


      if (Monster.health <= 0) {

        System.out.println("\nThe team defeated the " + Monster.name + "!");
        System.out.println("The team has gained " + Monster.XP + "XP");
        Player.XP = Player.XP + Monster.XP;
        Char1.XP = Char1.XP + Monster.XP;
        Char2.XP = Char2.XP + Monster.XP;

        // Level up!
        if (Player.XP >= 9 || Char1.XP >= 9 || Char2.XP >= 9) {
          System.out.println("You leveled up!");
          Player.health = Player.health + 15;
          Char1.health = Char1.health + 12;
          Char1.health = Char2.health + 6;

          Player.attackPower = Player.attackPower + 4;
          Char1.attackPower = Char1.attackPower + 2;
          Char2.attackPower = Char2.attackPower + 1;

          Player.XP = Player.XP - Player.XP;
          Char1.XP = Char1.XP - Char1.XP;
          Char2.XP = Char2.XP - Char2.XP;
        } // end Level up
        break;
      } // end Monster death
      // end 2nd turn



      /* **********************************************BEGIN THIRD TURN***************************************************************** */
      if (!SecondTurn) {

        /*Report Combat Stats*/
        // Print the Monster's name
        System.out.println("\nYou are fighting a " + Monster.name + "!");

        // Print the Monster's health
        System.out.print("The monster HP: " + Monster.health + "\n");

        // Print the Player's health
        System.out.print("Your HP: " + Player.health + "      ");
        System.out.print("Archer's HP: " + Char1.health + "      ");
        System.out.print("Mage's HP: " + Char2.health + "      ");
        System.out.print("Rogue's HP: " + Char3.health + "\n");

        // Print the Player's magic points
        System.out.print("Your MP: " + Player.mana + "        ");
        System.out.print("Archer's stamina: " + Char1.stamina + "        ");
        System.out.print("Mage's mana: " + Char2.mana + "        ");
        System.out.print("Rogue's stamina: " + Char3.stamina + "\n");

        // Print the Player's experience points
        System.out.print("Your XP: " + Player.XP + "        ");
        System.out.print("Archer's XP: " + Char1.XP + "        ");
        System.out.print("Mage's XP: " + Char1.XP + "        ");
        System.out.print("Rogue's XP: " + Char3.XP + "\n");

        System.out.println("\nCombat Options for Mage:");
        // Print option 1: Bow Attack
        System.out.println("  1.) Staff Attack");
        // Print option 2: Cast Pin Point
        System.out.println("  2.) Cast Lightning Bolt");
        // Print option 3: Charge Stamina
        System.out.println("  3.) Charge Mana");
        // Prompt player for action
        System.out.print("What action do you want to perform? ");

        Option = input.nextInt();

        // If player chose option 1, (check with equality operator)
        if (Option == 1) {

          System.out.println("\nYou strike the " + Monster.name + " with your staff.");
          Monster.health = Monster.health - (Char2.attackPower + randomNumbers.nextInt(3));

          ThirdTurn = false;

          if (Monster.health > 0) {
            // The monster attacks the player
            Char2.health = Char2.health - Monster.attackPower;
            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

          }

        } // End of if statement.

        else if (Option == 2) {
          if (Char2.mana < 3) {
            System.out.println("Sorry, you don't have enough stamina for that.");
          } // End of if statement.

          if (Char2.mana >= 3) {
            Char2.health = Char2.health - Monster.attackPower;

            System.out.println("\nYou use Lightning Bolt on the monster.");
            Monster.health = Monster.health - 18;
            Char2.mana = Char2.mana - 3;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
            ThirdTurn = false;
          } // End of if statement.
        } // End of else if option 2 statement.

        else if (Option == 3) {

          Char2.health = Char2.health - Monster.attackPower;

          System.out.println("\nYou meditate and gain mana.");
          Char2.mana = Char2.mana + 2;

          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");
          ThirdTurn = false;
        } // End of else if statement.
      } // End of if statement.

      else if (Option != 1) {

        System.out.println("\nI don't understand that command.");
      } // End of else if statement.

      if (Char2.health <= 0) {
        combatGame = false;
        System.out.println("Mage have been slain.");
      }

      if (!combatGame) {

        System.out.println("\nGame over.");

        System.out.println("Would you like to play again?");

        Scanner choice = new Scanner(System.in);
        Choice = choice.nextLine();

        if (Choice.equalsIgnoreCase("y")) {
          break; // Continues the game atm
          // Restart entire game
        } else if (Choice.equalsIgnoreCase("n")) {

          break;  // end the entire program!!?!!?!!
        } else if (Choice != "y") {

          System.out.println("\nThat is not a valid choice. Try again.");
        }
      } // End of if statement.


      if (Monster.health <= 0) {

        System.out.println("\nThe team defeated the " + Monster.name + "!");
        System.out.println("The team has gained " + Monster.XP + "XP");
        Player.XP = Player.XP + Monster.XP;
        Char1.XP = Char1.XP + Monster.XP;
        Char2.XP = Char2.XP + Monster.XP;

        // Level up!
        if (Player.XP >= 9 || Char1.XP >= 9 || Char2.XP >= 9) {
          System.out.println("You leveled up!");
          Player.health = Player.health + 15;
          Char1.health = Char1.health + 12;
          Char1.health = Char2.health + 6;

          Player.attackPower = Player.attackPower + 4;
          Char1.attackPower = Char1.attackPower + 2;
          Char2.attackPower = Char2.attackPower + 1;

          Player.XP = Player.XP - Player.XP;
          Char1.XP = Char1.XP - Char1.XP;
          Char2.XP = Char2.XP - Char2.XP;
        } // end level up
        break;
      } // end monster death

      /* **********************************************END THIRD TURN***************************************************************** */



      /* **********************************************BEGIN LAST TURN***************************************************************** */
      if (!ThirdTurn) {

        /*Report Combat Stats*/
        // Print the Monster's name
        System.out.println("\nYou are fighting a " + Monster.name + "!");

        // Print the Monster's health
        System.out.print("The monster HP: " + Monster.health + "\n");

        // Print the Player's health
        System.out.print("Your HP: " + Player.health + "      ");
        System.out.print("Archer's HP: " + Char1.health + "      ");
        System.out.print("Mage's HP: " + Char2.health + "      ");
        System.out.print("Rogue's HP: " + Char3.health + "\n");

        // Print the Player's magic points
        System.out.print("Your MP: " + Player.mana + "        ");
        System.out.print("Archer's stamina: " + Char1.stamina + "        ");
        System.out.print("Mage's mana: " + Char2.mana + "        ");
        System.out.print("Rogue's stamina: " + Char3.stamina + "\n");

        // Print the Player's experience points
        System.out.print("Your XP: " + Player.XP + "        ");
        System.out.print("Archer's XP: " + Char1.XP + "        ");
        System.out.print("Mage's XP: " + Char1.XP + "        ");
        System.out.print("Rogue's XP: " + Char3.XP + "\n");


        System.out.println("\nCombat Options for Rogue:");
        // Print option 1: Bow Attack
        System.out.println("  1.) Blade Attack");
        // Print option 2: Cast Pin Point
        System.out.println("  2.) Shadow Blade");
        // Print option 3: Charge Stamina
        System.out.println("  3.) Charge Stamina");
        // Prompt player for action
        System.out.print("What action do you want to perform? ");

        Option = input.nextInt();

        // If player chose option 1, (check with equality operator)
        if (Option == 1) {

          System.out.println("\nYou strike the " + Monster.name + " with your blade.");
          Monster.health = Monster.health - (Char3.attackPower + randomNumbers.nextInt(3));

          if (Monster.health > 0) {
            // The monster attacks the player
            Char3.health = Char3.health - Monster.attackPower;
            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

          }

        } // End of if statement.

        else if (Option == 2) {
          if (Char3.stamina < 3) {
            System.out.println("Sorry, you don't have enough stamina for that.");
          } // End of if statement.

          if (Char3.stamina >= 3) {
            Char3.health = Char3.health - Monster.attackPower;

            System.out.println("\nYou use Shadow Blade on the monster.");
            Monster.health = Monster.health - 24;
            Char3.stamina = Char3.stamina - 3;

            System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

          } // End of if statement.
        } // End of else if option 2 statement.

        else if (Option == 3) {

          Char3.health = Char3.health - Monster.attackPower;

          System.out.println("\nYou charge your stamina.");
          Char3.stamina = Char3.stamina + 2;

          System.out.print("The " + Monster.name + " hits you for " + Monster.attackPower + "\n");

        } // End of else if statement.
      } // End of if statement.

      else if (Option != 1) {

        System.out.println("\nI don't understand that command.");
      } // End of else if statement.

      if (Char3.health <= 0) {
        combatGame = false;
        System.out.println("Rogue have been slain.");
      }

      if (!combatGame) {

        System.out.println("\nGame over.");

        System.out.println("Would you like to play again?");

        Scanner choice = new Scanner(System.in);
        Choice = choice.nextLine();

        if (Choice.equalsIgnoreCase("y")) {
          break; // Continues the game atm
          // Restart entire game
        } else if (Choice.equalsIgnoreCase("n")) {

          break;  // end the entire program!!?!!?!!
        } else if (Choice != "y") {

          System.out.println("\nThat is not a valid choice. Try again.");
        }
      } // End of if statement.


      if (Monster.health <= 0) {

        System.out.println("\nThe team defeated the " + Monster.name + "!");
        System.out.println("The team has gained " + Monster.XP + "XP");
        Player.XP = Player.XP + Monster.XP;
        Char1.XP = Char1.XP + Monster.XP;
        Char2.XP = Char2.XP + Monster.XP;
        Char3.XP = Char3.XP + Monster.XP;

        // Level up!
        if (Player.XP >= 9 || Char1.XP >= 9 || Char2.XP >= 9) {
          System.out.println("You leveled up!");
          Player.health = Player.health + 15;
          Char1.health = Char1.health + 12;
          Char1.health = Char2.health + 6;
          Char1.health = Char3.health + 8;

          Player.attackPower = Player.attackPower + 4;
          Char1.attackPower = Char1.attackPower + 2;
          Char2.attackPower = Char2.attackPower + 1;
          Char3.attackPower = Char3.attackPower + 3;

          Player.XP = Player.XP - Player.XP;
          Char1.XP = Char1.XP - Char1.XP;
          Char2.XP = Char2.XP - Char2.XP;
          Char3.XP = Char3.XP - Char3.XP;
        } // end level up
        break;
      } // end monster death


    } // End of while(combatGame) statement.
  } // End of combatOption method.
  } // end of class