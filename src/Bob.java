import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say hello to Bob. \nBob is a lackadaisical teenager. \nIn conversation, his responses are very limited...");
        System.out.println("Please have a conversation with Bob!");
        for (; true; ) {
            String userResp = scanner.nextLine();
            if (userResp.endsWith("?")) {
                System.out.println("(-_-) Bob: Sure...");
            } else if (userResp.endsWith("!")) {
                System.out.println("(o_o) Bob: Whoa, chill out!");
            } else if (userResp.startsWith(" ") & userResp.endsWith(" ")) {
                System.out.println("(╯°□°)╯Bob: Fine. Be that way!");
            } else if(userResp.startsWith("ok") | userResp.endsWith("bye")){
                System.out.println("(-_-) Bob: Whatever... laterzzz");
                break;
            }
            else{
                System.out.println("(-_-) Bob: Whatever...");
            }
        }




    }
}
