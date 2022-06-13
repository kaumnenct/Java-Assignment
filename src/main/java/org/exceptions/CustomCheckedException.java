package org.exceptions;

public class CustomCheckedException {
    private String name;

    Logger logger = new Logger();
    public boolean containsSpecialCharacterOrIsNull(String name) {
        if (name == null)
            return true;
        for (char c : name.toCharArray()){
            if (c >= '!' && c <= '`') {
                return true;
            }
        }
        return false;
    }

    public CustomCheckedException(String name) throws INException {
        if (containsSpecialCharacterOrIsNull(name)) {
            String errorMessage = "A name cannot contain special characters or be null!";
            logger.logError(errorMessage);
            throw new INException(errorMessage);
        }

        this.name = name;
    }

    public void printName() {
        System.out.println("I've got name " + name);
    }
}
