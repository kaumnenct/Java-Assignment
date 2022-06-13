package org.exceptions;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        NPException npexception = new NPException();
        AIOBException aiobException = new AIOBException();

        //testing NullPointerException
        try {
            npexception.testNullPointer();
            aiobException.testArrayIndexOutOfBounds();
        }
        catch (NullPointerException | IndexOutOfBoundsException e)
        {
            logger.info("Exception 1. found: \n" + e);
        }

        //testing ArrayIndexOutOfBoundsException
        try
        {
            aiobException.testArrayIndexOutOfBounds();
        }
        catch (IndexOutOfBoundsException e)
        {
            logger.info("Exception 2. found: \n" + e);
        }
    }
}