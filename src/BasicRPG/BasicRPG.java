package BasicRPG;
import java.util.Scanner;

import java.security.SecureRandom;
// Naming the file heroCreator
public class BasicRPG{

    // Declaring method
    public static void main(String[] args){

        // Setting the new Scanner
        Scanner input = new Scanner(System.in);
        // Create hero stats and initialize them to 0

        heroCreator();



    } // end of main method.

    private static void heroCreator() {

        Scanner input = new Scanner(System.in);
        int Option;
        Boolean heroCreator = true;
        int heroHealth = 0;
        int heroAttack = 0;
        int heroMagic = 0;
        int points = 20;
        while (heroCreator) {

            System.out.print("\nHealth: " + heroHealth);

            System.out.print(", Attack: " + heroAttack);

            System.out.println(", Magic: " + heroMagic);

            //1 stat point gives +10 health

            //1 stat point gives +1 attack power

            //1 stat point gives +3 magic power

            System.out.println("\n1.)   +10 health");

            System.out.println("2.)   +1 attack power");

            System.out.println("3.)   +3 magic power");

            System.out.print("You have "  + points + " points to spend: ");

            Option = input.nextInt();

            // If the player chooses option 1 they will allocate 10 points to health
            // Each time the player chooses an option the amount of points left
            // are deducted each time.
            if(Option == 1) {
                points = points - 1;
                heroHealth = heroHealth + 10;
            }
            // If the player chooses option 2 they will allocate 1 point to attack
            else if(Option == 2) {
                points = points - 1;
                heroAttack = heroAttack + 1;
            }
            // If the player chooses option 3 they will allocate 3 points to magic
            else if(Option == 3) {
                points = points - 1;
                heroMagic = heroMagic + 3;

            }
            // If the player doesn't choose 1-3 they will be give an error.
            else if(Option != 1) {
                System.out.println("\nThat is not a valid choice. Please try again.");
            }

            if(points <= 0) {
                heroCreator = false;
            }
        }
        combatAlgorithm(heroHealth, heroAttack, heroMagic);
    }

    // New method for creating monster
    private static void monsterCreator() {

        // Create variables for monsters and intialize them to player
        // choice
        int goblin = 1;
        int orc = 2;
        int troll = 3;

        // Create variables for monsters stats and initialize them to 0 certain
        // numbers

        // Use new randomm number generator
        SecureRandom randomNumbers = new SecureRandom();
        for(int counter = 1; counter <= 3; counter ++){
            int monster = 1 + randomNumbers.nextInt(3);

            if (monster == 1) {
                System.out.println("\nYou have encountered a Goblin!");
                break;
            }

            if (monster == 2) {
                System.out.println("\nYou have encountered an Orc!");
                break;
            }

            if (monster == 3) {
                System.out.println("\nYou have encountered a Troll!");
                break;
            }
        }
    }

    // New method for the random monster
    private static void combatAlgorithm(int heroHealth, int heroAttack, int heroMagic) {

        // Use new random number generator
        SecureRandom randomNumbers = new SecureRandom();

        int goblinHealth = 75 + randomNumbers.nextInt(24);
        int goblinAttack = 8 + randomNumbers.nextInt(4);
        int goblinXP = 1;
        int orcHealth = 100 + randomNumbers.nextInt(24);
        int orcAttack = 12 + randomNumbers.nextInt(4);
        int orcXP = 3;
        int trollHealth = 150 + randomNumbers.nextInt(49);
        int trollAttack = 15 + randomNumbers.nextInt(4);
        int trollXP = 5;
        String monsterName1 = "Goblin";
        String monsterName2 = "Orc";
        String monsterName3 = "Troll";

        // Begin for statement for random monsters
        for(int counter = 1; counter <= 3; counter ++){
            int monster = 1 + randomNumbers.nextInt(3);

            if (monster == 1) {
                System.out.println("\nGoblin HP: " + goblinHealth);
                System.out.print("Hero HP: " + heroHealth);
                System.out.println(", MP: " + heroMagic);
                combatOptions(heroHealth, heroAttack, heroMagic, goblinHealth, goblinAttack, goblinXP, monsterName1);

                break;
            }

            if (monster == 2) {
                System.out.println("\nOrc HP: " + orcHealth);
                System.out.print("Hero HP: " + heroHealth);
                System.out.println(", MP: " + heroMagic);
                combatOptions(heroHealth, heroAttack, heroMagic, orcHealth, orcAttack, orcXP, monsterName2);

                break;
            }

            if (monster == 3) {
                System.out.println("\nTroll HP: " + trollHealth);
                System.out.print("Hero HP: " + heroHealth);
                System.out.println(", MP: " + heroMagic);
                combatOptions(heroHealth, heroAttack, heroMagic, trollHealth, trollAttack, trollXP, monsterName3);

                break;
            }

        } // End of for statement.

    } // End of combatAlgorithm method.

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
            System.out.println("\nYou are fighting a " + monsterName + " !");
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
                // The goblin attacks the player
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
                    // The goblins's health is divided by 2 each time you cast the spell
                    monsterHealth = monsterHealth / 2;
                    // The hero uses up his magic by 3 points
                    heroMagic = heroMagic - 3;
                    // The goblin attacks the player
                    System.out.print("The " + monsterName + " hits you for ");
                    System.out.println(monsterAttack);
                    // Calculating how much damage magic was done and dividing it from monster's health
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
            }
            if (heroHealth <= 0) {
                combatGame = false;
            } // End of if statement.

            while (!combatGame){
                System.out.println("\nGame over.");
                break;
            } // End of while statement.
        } // End of while(combatGame) statement.
    } // End of combatOption method.
} // End of class
