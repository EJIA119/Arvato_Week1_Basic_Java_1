package test;

import basic.JavaStreams;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JavaStreamsTest {

    @Test
    public void readFileTest() throws IOException {
        JavaStreams tester = new JavaStreams();
        List<Integer> intList = tester.readFromFile("src/basic/file.txt");

        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assert.assertEquals(expectedResult, intList);
    }

}