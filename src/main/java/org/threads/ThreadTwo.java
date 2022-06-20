package org.threads;

public class ThreadTwo extends Thread {

    ChatLogic chat;

    public ThreadTwo(ChatLogic chat) {
        this.chat = chat;
    }

    //@Override
    public void run() {
        try {
            while(true) {
                chat.second();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}