import java.util.Arrays;

public class ServerNameGenerator {
    private static String[] adjectives = {"crazy", "wistful", "docile", "warm", "pretty", "cold", "energetic", "sweet", "logical", "arrogant"};
    private static String[] nouns = {"cat", "dog", "armadillo", "penguin", "carrot", "squirrel", "parrot", "ox", "koala", "zebra"};

    public static String returnElement (String[] array){
     int random = (int) (Math.random() * 9) + 0;
     String element = array[random];
     return element;
    }

    public static void main(String[] args) {
        String noun = returnElement(nouns);
        String adj = returnElement(adjectives);

        String message = "Your server is named:\n " + adj +"-"+ noun;
        System.out.println(message);
    }
}
