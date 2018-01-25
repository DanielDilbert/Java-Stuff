package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	 System.out.println( "Hello, welcome to my SUPER BASIC RPG!\n");

	 Characters();
	 Stats();


	 // begin combat

	 } // end main

    public static void Characters() {

        String Hero1 = "Daniel";
        String Hero2 = "Marlene";

        String Monster1 = "Goblin";
        String Monster2 = "Skeleton";


        int Hero1HP = 100;
        int Hero2HP = 100;
        int Hero1ATT = 32;
        int Hero2ATT = 24;

        int Monster1HP = 100;
        int Monster2HP = 120;

        int Monster1ATT = 31;
        int Monster2ATT = 27;


        System.out.println("Hero: " + Hero1);
        System.out.println(Hero1 + " " + "Health: " + (Hero1HP - Monster1ATT));
        System.out.println(Hero2 + " " + "Health: " + (Hero2HP - Monster2ATT));

    } // end Characters

    public static void Stats () {

        int Hero1HP = 100;
        int Hero2HP = 100;
        int Hero1ATT = 32;
        int Hero2ATT = 24;

        int Monster1HP = 100;
        int Monster2HP = 120;

        int Monster1ATT = 31;
        int Monster2ATT = 27;

    } // end Stats

    public static void Combat() {

        Boolean game = true;
        int userchoice = 0;

        while (game == true) {

            if (userchoice == 1) {
                
            } // end 1st if

        }

    } // end Combat

} // end program
