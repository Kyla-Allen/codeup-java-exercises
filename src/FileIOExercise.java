import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOExercise {
    //METHODS


//    RETRIEVING INFO
    public static List<String> getFileData (String path){
        List<String> output = null;
        try {
            output = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

//    WRITING TO FILE
    public static void write2file (Path path, List<String> addThis){
        try{
            Files.write(path, addThis);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

//    ADDING TO FILE
    public static void add2file (Path path, List<String> addThis){
        try{
            Files.write(path, addThis, StandardOpenOption.APPEND);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

//    MAIN
    public static void main (String[] args){
        String path = "src/test.txt";
        Path p = Paths.get(path);
        List<String> lines = Arrays.asList("Eric", "Charles", "KQEWHad");

        write2file(p, lines);
        System.out.println(getFileData(path));
        lines = Arrays.asList("Cherry", "Espanol");
        add2file(p,lines);
        System.out.println(getFileData(path));
    }
}
