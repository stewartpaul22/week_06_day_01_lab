import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ArrayTest {

    private ArrayListExample arrayListExample;
//    private ArrayList<Integers> numbers;

    @Before
    public void before() {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        arrayListExample = new ArrayListExample(myNumbers);
    }

    @Test
    public void canAddItem() {
        arrayListExample.add("Hello");
        assertEquals(1, arrayListExample.getWordCount());
    }

    @Test
    public void canTotalNumbers() {
        assertEquals(10, arrayListExample.getTotal());
    }

    @Test
    public void canGetRandomNumber() {
        ArrayList results = arrayListExample.getNumbers();
        int randomNumber = arrayListExample.getRandomNumber();
        assertTrue(results.contains(randomNumber));
    }

}
