package com.gdstruc.midtermexam;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardStack cardStack = new CardStack(30);

        //The cards used for this game

        cardStack.push(new Card("F-104A", 1));
        cardStack.push(new Card("F-104C", 2));
        cardStack.push(new Card("F-2A", 3));
        cardStack.push(new Card("F-4E", 4));
        cardStack.push(new Card("F-14D", 5));
        cardStack.push(new Card("F-15C", 6));
        cardStack.push(new Card("F-15J", 7));
        cardStack.push(new Card("F-15E", 8));
        cardStack.push(new Card("F-16C", 9));
        cardStack.push(new Card("F-18", 10));
        cardStack.push(new Card("F-22", 11));
        cardStack.push(new Card("F-35C", 12));
        cardStack.push(new Card("Mirage 2000", 13));
        cardStack.push(new Card("Typhoon", 14));
        cardStack.push(new Card("MiG-21Bis", 15));
        cardStack.push(new Card("MiG-29", 16));
        cardStack.push(new Card("Su-27", 17));
        cardStack.push(new Card("Su-30SM", 18));
        cardStack.push(new Card("Su-33", 19));
        cardStack.push(new Card("Su-34", 20));
        cardStack.push(new Card("Su-37", 21));
        cardStack.push(new Card("ADF-11F", 22));
        cardStack.push(new Card("ADF-01", 23));
        cardStack.push(new Card("ADFX-01", 24));
        cardStack.push(new Card("XFA-27", 25));
        cardStack.push(new Card("ASF-X", 26));
        cardStack.push(new Card("CFA-44", 27));
        cardStack.push(new Card("F-5A", 28));
        cardStack.push(new Card("F-5E", 29));
        cardStack.push(new Card("Gripen", 30));

        for (int i = 1; i > 0;) //main loop
        {

            Random random = new Random();
            int randomValues = random.nextInt(3);
            //Randomizer
            switch (randomValues) {
                case 0 -> { //draw
                    int drawingCard = random.nextInt(5) + 1;
                    System.out.println("You draw a random card/s: " + drawingCard + " cards" + "\nHere are your drawn cards");
                    cardStack.draw(drawingCard);
                }
                case 1 -> { //discard
                    int DiscardedCard = random.nextInt(5) + 1;
                    System.out.println("You discard card/s " + DiscardedCard + " cards");
                    cardStack.discard(DiscardedCard);
                }
                case 2 -> { //retrieval
                    int RetrievedCard = random.nextInt(5) + 1;
                    System.out.println("You retrieve randomly " + RetrievedCard + " cards" + " \nHere are your retrieved cards");
                    cardStack.retrieve(RetrievedCard);
                }
            }

            cardStack.displayInfo();
            System.out.println("\nPress Enter to continue on playing");
            new Scanner(System.in).nextLine(); //player presses "enter" to continue the game

            if (cardStack.getTopDeck() <= 0)
            {
                i--;
            }


        }

        System.out.println("You ran out of cards, game over!");

    }

}