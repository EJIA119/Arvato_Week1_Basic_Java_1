package test;

import basic.HighestAndLowest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HighestAndLowestTest {
    int[] arr = { -3, 12, 5, 7, 19, 15, 12, 2 };

    @Test
    public void findHighest(){
        HighestAndLowest myTest = new HighestAndLowest();

        Assert.assertEquals(19,myTest.findHighest(arr));
    }

    @Test
    public void findLowest(){
        HighestAndLowest myTest = new HighestAndLowest();
        Assert.assertTrue(myTest.findLowest(arr) == -3);
    }
}