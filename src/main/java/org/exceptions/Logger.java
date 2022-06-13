package org.exceptions;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

public class Logger {
    private static final org.apache.log4j.Logger logger = LogManager.getLogger(Main.class);

    public void logError(String error) {
        BasicConfigurator.configure();

        logger.info(error);
    }
}
