package org.threads;

public class Main {

    public static void main(String[] args) {

        ChatLogic chat = new ChatLogic();

        new ThreadOne(chat).start();
        new ThreadTwo(chat).start();

    }
}