public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        NPException npexception = new NPException();
        try {
            npexception.testNullPointer();
        }
        catch (NullPointerException e)
        {
            System.out.println("Exception found: \n" + e);
        }
    }
}