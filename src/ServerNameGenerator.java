import java.util.Arrays;

public class ServerNameGenerator {
    static String[] adjectives = {"attentive", "unknown", "dark", "injected", "colorful", "indecisive", "confident","lucrative", "joy","powerful"};
    static String[] nouns= {"cat", "alien", "cow", "insect", "soup", "rome", "computer","automobile", "jet","human"};
    static  int[] numbers = {1, 2, 3, 4, 5};

    static public String generator(){
        int randNum = (int)(Math.random() * 10);
        int randNum2 = (int)(Math.random() * 10);
      return "Your server name is: \n" + adjectives[randNum] + "-" + nouns[randNum2];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(adjectives));
        System.out.println(Arrays.toString(nouns));
        System.out.println(generator());
    }
}
