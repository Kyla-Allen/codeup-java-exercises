import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIOExercise {
    //METHODS


    public static List<String> getFileData (String path){
        List<String> output = null;
        try {
            output = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }


//    MAIN
    public static void main (String[] args){
        String path = "src/test.txt";
        System.out.println(getFileData(path));
    }
}
