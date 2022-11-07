package com.gdstruc.otie.module4;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayQueue arrayQueue = new ArrayQueue(14);

        Scanner scanner = new Scanner(System.in);

        Random arraysEnqueueing = new Random();
        Random arrayIdentificationNumber = new Random();

        int arraysJoining;
        int gamesBegun = 0;

        while(gamesBegun < 10)
        {
            arraysJoining = arraysEnqueueing.nextInt(7) + 1;
            for (int i = 0; i < arraysJoining; i++)
            {
                Player player = new Player("Player " + (arrayIdentificationNumber.nextInt(100) + i));
                arrayQueue.enqueue(player);
            }

            System.out.println("Number of Players in que: " + arraysJoining);
            System.out.println("\nPlayers in que: ");
            arrayQueue.printQueue();

            if (arrayQueue.size() >= 5)
            {
                System.out.println("\nCurrently ingame players:");

                for(int i = 0; i < 5; i++)
                {
                    Player dequeueArray = arrayQueue.dequeue();
                    System.out.println(dequeueArray);
                }
                
                if (arrayQueue.size() == 0)
                {
                    System.out.println("\nNo one is queueing... ");
                }
                else
                {
                    System.out.println("\nThis Player is now first in queue: " + arrayQueue.peek());
                }
                gamesBegun++;
            }

            System.out.println("\nCurrently Active Games: " + gamesBegun);
            System.out.println("\npress enter to begin next game");
            scanner.nextLine();
        }
    }
}