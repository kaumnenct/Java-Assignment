package org.threads;

import java.util.Scanner;

public class ChatLogic {

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    String str1,str2;
    int flag = 0;

    public synchronized void first() throws InterruptedException {
        if (flag==1) {
            wait();
        }
        System.out.print("1: ");
        str1 = sc1.nextLine();
        if(str1.equalsIgnoreCase("end")) {
            System.out.println("\nWell, > 1 < has left the chat. Ending the conversation.");
            System.exit(0);
        }

        flag = 1;
        notify();
    }

    public synchronized void second() throws InterruptedException {
        if (flag == 2) {
            wait();
        }
        System.out.print("2: ");
        str2 = sc2.nextLine();
        if(str2.equalsIgnoreCase("end")) {
            System.out.println("\nWell, > 2 < has left the chat. Ending the conversation.");
            System.exit(0);
        }
        flag = 2;
        notify();
    }
}
