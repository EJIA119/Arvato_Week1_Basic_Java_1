import java.io.*;
import java.util.*;

public class CollectionsAndFiles {
    public static void main(String[] args) {

        try {
            List<Integer> intList = readIntFromFile("src/file.txt");
            System.out.println("Integers list from file = " + intList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static List<Integer> readIntFromFile(String fileName) throws IOException {

        List<Integer> intList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int val;
            while ((val = br.read()) != -1) {
                intList.add(Character.getNumericValue(val));
            }
        }

        return intList;
    }
}
