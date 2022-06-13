import java.util.ArrayList;
import java.util.List;

public class AIOBException {
    public int testArray() {
        List numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);

        return (int) numbers.get(5);
    }
}
