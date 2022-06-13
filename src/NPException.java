public class NPException {
    public void testNullPointer(){
        Integer number = null;

        if (number > 0) {
            System.out.println(number + "is positive!");
        }
    }
}
