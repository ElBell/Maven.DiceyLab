import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class testDice {
    @Test
    public void testTossLow() {
        //Given
        Dice testDie = new Dice(1);
        //When
        Integer actual = testDie.toss(new Random(17));
        //Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossHight() {
        //Given
        Dice testDie = new Dice(1);
        //When
        Integer actual = testDie.toss(new Random(8));
        //Then
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossRange() {
        //Given
        Dice testDie = new Dice(1);
        //When
        Integer actualNum = testDie.toss();
        //Then
        boolean actual = true;
        if(actualNum < 1 || actualNum > 6) {
            actual = false;
        }
        Assert.assertTrue(actual);
    }

    @Test
    public void testTossAndSumsRange() {
        //Given
        Dice testDie = new Dice(1);
        //When
        Integer actualNum = testDie.tossAndSum();
        //Then
        Boolean actual = true;
        if(actualNum < 1 || actualNum > 6) {
            actual = false;
        }
        Assert.assertTrue(actual);
    }

    @Test
    public void testTossAndSumsRange2() {
        //Given
        Dice testDie = new Dice(2);
        //When
        Integer actualNum = testDie.tossAndSum();
        //Then
        Boolean actual = true;
        if(actualNum < 2 || actualNum > 12) {
            actual = false;
        }
        Assert.assertTrue(actual);
    }
}
