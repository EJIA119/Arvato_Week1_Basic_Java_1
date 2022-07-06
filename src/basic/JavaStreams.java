package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {

        try{
            List<Integer> intList = readFromFile("src/basic/file.txt");
            System.out.println("Integers list from file = " + intList);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> readFromFile(String fileName) throws IOException{

        List<Integer> intList = new ArrayList<>();
        char[] charVal = new char[32];
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            int val;
            while ((val = br.read()) != -1) {
                if(Character.isDigit(val))
                    intList.add(Character.getNumericValue(val));
            }
        }

        return intList;
    }

}
