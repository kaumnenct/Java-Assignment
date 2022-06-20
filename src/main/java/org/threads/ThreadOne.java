package org.threads;

public class ThreadOne extends Thread {

    ChatLogic chat;

    public ThreadOne(ChatLogic chat) {
        this.chat = chat;
    }

    //@Override
    public void run() {
        try {
            while(true) {
                chat.first();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}