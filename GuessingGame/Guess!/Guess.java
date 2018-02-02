import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        String word = "hello";

        System.out.println("Welcome to my guessing game!");
        System.out.println("Your word is 5 letters long!");

        Start();

    } // end main

    public static void Start() {
        Scanner choice = new Scanner(System.in);
        int Tries = 12;
        System.out.println("Tries left: " + Tries);

        Boolean Game = true;
        String[] wrongGuesses = {"a", "b", "c", "d", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        while(Game) {

            String Guess = choice.nextLine();

            if (Guess.equalsIgnoreCase("h")) {

                System.out.println("Correct!");

                System.out.println("Tries left: " + Tries);

            } else if (Guess.equalsIgnoreCase("e")) {

                System.out.println("Correct!");

                System.out.println("Tries left: " + Tries);

            } else if (Guess.equalsIgnoreCase("l")) {

                System.out.println("Correct!");

                System.out.println("Tries left: " + Tries);

            } else if (Guess.equalsIgnoreCase("o")) {

                System.out.println("Correct!");

                System.out.println("Tries left: " + Tries);

            } else if (Guess.equals(wrongGuesses[0])) {

                System.out.println("Incorrect! Try again.");

                Tries--;

                System.out.println("Tries left: " + Tries);

            }

            if(Tries <= 0) {

                System.out.println("Game over!");
                Game = false;
            }
        } // end while
    } // end Start

} // end Guess
