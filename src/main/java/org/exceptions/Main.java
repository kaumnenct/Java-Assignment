package org.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NPException, IOException {
        Logger logger = new Logger();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // unchecked error
        Integer number = 0, number2 = 0;

        System.out.println("Please input first number: ");
        try {
            number = Integer.valueOf(reader.readLine());
        }
        catch (NumberFormatException e) {
            number = null;
        }

        System.out.println("Please input second number: ");

        try {
            number2 = Integer.valueOf(reader.readLine());
        }
        catch (NumberFormatException e) {
            number2 = null;
        }

        if (number != null && number2 != null)
        {
            System.out.println("You can concatenate these two numbers! The result is : " + number + number2);
        }
        else
        {
            String errMessage = "You have to provide numbers if you want to use them!";

            logger.logError(errMessage);
            throw new NPException(errMessage);
        }
    }
}