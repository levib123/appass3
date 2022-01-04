package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("TWENTY QUESTIONS");
            System.out.println("Guess what number I'm thinking of from 1-100");

            int randomNum = (int) (Math.random() * 100);
            int counter = 1;



            while(true) {
                System.out.print("Guess " + counter + ": ");
                int guess = input.nextInt();

                if (guess > randomNum) {
                    System.out.println("Too High!");
                    counter++;
                    continue;
                } else if (guess < randomNum) {
                    System.out.println("Too Low!");
                    counter++;
                    continue;
                } else if (guess == randomNum) {
                    System.out.println("Correct!");
                    break;
                }
            }

            System.out.println("Would you like to play again? (y/n) ");

            if (input.nextLine().equals("y")){
                continue;
            }


        }
    }
}
