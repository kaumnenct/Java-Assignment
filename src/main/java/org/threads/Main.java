package org.threads;

public class Main {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        threadOne.start();
        threadTwo.start();
    }
}
