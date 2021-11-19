package com.gdstruc.module4queues;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matchCount = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayQueue playerList = new ArrayQueue(10);
        ArrayQueue queue = new ArrayQueue(7);

        playerList.add(new Player(1, "Esuna", 100));
        playerList.add(new Player(2, "Konpa", 69));
        playerList.add(new Player(3, "Shtola", 24));
        playerList.add(new Player(4, "Potato", 34));
        playerList.add(new Player(5, "Yoship", 57));
        playerList.add(new Player(6, "Manderville", 89));
        playerList.add(new Player(7, "Hildy", 22));


        Random rand = new Random();
        int ranValue = 8;

        System.out.println("Current People in Queue: ");
        playerList.printQueue();

        while (matchCount < 10) {
            int randQueue = rand.nextInt(ranValue) + 1;


            for (int i = 0; i < randQueue; i++) { //Adds players to the queue
                queue.add(playerList.peek());
                playerList.remove();

                if (queue.size() >= 7) {
                    break;
                }
            }
            System.out.println("Match count: " + matchCount);
            System.out.println("Players in Queue: ");
            System.out.println("Press Enter to continue matchmaking ");
            queue.printQueue();
            scanner.nextLine();

            //Starts the game
            if (queue.size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    playerList.add(queue.peek());
                    queue.remove();
                }
                matchCount++;
                System.out.println("Game Starting (Press Enter)...");
                scanner.nextLine();
                System.out.println("Finishing Game (Press Enter)...");
                scanner.nextLine();
                System.out.println("Players will now be returned (Press Enter).");
                scanner.nextLine();
            }


        }



    }

}