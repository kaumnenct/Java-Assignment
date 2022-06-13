public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        NPException npexception = new NPException();
        AIOBException aiobException = new AIOBException();

        //testing NullPointerException
        try {
            npexception.testNullPointer();
            aiobException.testArrayIndexOutOfBounds();
        }
        catch (NullPointerException | IndexOutOfBoundsException e)
        {
            System.out.println("Exception(s) found: \n" + e);
        }

        //testing ArrayIndexOutOfBoundsException
        try
        {
            aiobException.testArrayIndexOutOfBounds();
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Exception 2. found: \n" + e);
        }
    }
}