package org.threads;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ThreadTwo extends Thread{
    private static final Logger logger = LogManager.getLogger(org.exceptions.Main.class);
    public void run() {
        BasicConfigurator.configure();

        logger.info("The tread has started!");
        for (int i = 1; i < 100; i++)
        {
            if (i % 6 == 0 && i % 4 == 0) {
                logger.info("Thread 2 found a number divisible by 6 and 4: " + i);
            }
        }
    }
}
