import java.util.Scanner;
public class Bob {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Say something to Bob....");
        String input = scan.nextLine();

        if(input.equals("")){
            System.out.println("Bob: Fine! Be that way!");
        } else if(input.charAt(input.length() - 1 ) == '!'){
            System.out.println("Bob: Whoa, chill out!");
        } else if (input.charAt(input.length() - 1 ) == '?'){
            System.out.println("Bob: Sure!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
