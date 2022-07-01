import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {

        try{
            List<Integer> intList = readFromFile("src/file.txt");
            System.out.println("Integers list from file = " + intList);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    static List<Integer> readFromFile(String fileName) throws IOException{

        List<Integer> intList = new ArrayList<>();
        char[] charVal = new char[32];
        try(Reader reader = Files.newBufferedReader(Paths.get(fileName))){
            while(reader.read(charVal) >= 0){
                for (char value: charVal) {
                    if(Character.isDigit(value)){
                        intList.add(Character.getNumericValue(value));
                    }
                }
            }
        }

        return intList;
    }

}
