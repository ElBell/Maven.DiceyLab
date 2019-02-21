import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class testBins {

    @Test
    public void testMakeBins() {
        //Given
        Bins testBins = new Bins(1, 5);

        //When

        //Then
        HashMap<Integer, Integer> actual = testBins.getBins();
        HashMap<Integer, Integer> expected = new HashMap<Integer, Integer>();
        expected.put(1, 0);
        expected.put(2, 0);
        expected.put(3, 0);
        expected.put(4, 0);
        expected.put(5, 0);


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeBins2() {
        //Given
        Bins testBins = new Bins(3, 4);

        //When

        //Then
        HashMap<Integer, Integer> actual = testBins.getBins();
        HashMap<Integer, Integer> expected = new HashMap<Integer, Integer>();
        expected.put(3, 0);
        expected.put(4, 0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin() {
        //Given
        Bins testBins = new Bins(3, 4);

        //When

        testBins.incrementBin(3);

        //Then

        Integer expected = 1;
        Integer actual = testBins.getBins(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin2() {
        //Given
        Bins testBins = new Bins(3, 4);

        //When

        testBins.incrementBin(4);
        testBins.incrementBin(4);
        //Then

        Integer expected = 2;
        Integer actual = testBins.getBins(4);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetBinNum() {
        //Given
        Bins testBins = new Bins(3, 4);

        //When

        //Then

        Integer expected = 0;
        Integer actual = testBins.getBins(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBinNum2() {
        //Given
        Bins testBins = new Bins(3, 4);


        //When
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        //Then

        Integer expected = 6;
        Integer actual = testBins.getBins(4);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTotal() {
        //Given
        Bins testBins = new Bins(3, 4);


        //When
        testBins.incrementBin(3);
        testBins.incrementBin(3);
        testBins.incrementBin(3);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        //Then

        Integer expected = 6;
        Integer actual = testBins.total();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTotal2() {
        //Given
        Bins testBins = new Bins(3, 4);


        //When
        testBins.incrementBin(3);
        //Then

        Integer expected = 1;
        Integer actual = testBins.total();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPercentage() {
        //Given
        Bins testBins = new Bins(3, 4);


        //When
        testBins.incrementBin(3);
        testBins.incrementBin(3);
        testBins.incrementBin(3);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        //Then

        Float actual = testBins.percentage(3, 6);
        Float expected = 0.5f;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPercentage2() {
        //Given
        Bins testBins = new Bins(3, 4);


        //When
        testBins.incrementBin(3);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        testBins.incrementBin(4);
        //Then

        Float actual = testBins.percentage(3, 4);
        Float expected = 0.25f;

        Assert.assertEquals(expected, actual);
    }
}
