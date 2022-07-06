package test;

import basic.CollectionsAndFiles;
import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionsAndFilesTest {

    @Test
    public void readFileTest() throws IOException {
        CollectionsAndFiles tester = new CollectionsAndFiles();
        List<Integer> intList = tester.readIntFromFile("src/basic/file.txt");

        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Assert.assertEquals(expectedResult, intList);

    }
}