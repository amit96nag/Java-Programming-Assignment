
import java.util.Random;

public class Generate_random_password {

    public static String Password(int Length) {
        String low = "abcdefghijklmnopqrstuvwxyz";
        String high = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "@#$%&*";
        String number = "1234567890";

        String all = low + high + special + number;

        Random random = new Random();
        StringBuilder sc = new StringBuilder();

        char c1 = low.charAt(random.nextInt(low.length()));
        char c2 = high.charAt(random.nextInt(high.length()));
        char c3 = special.charAt(random.nextInt(special.length()));
        char c4 = number.charAt(random.nextInt(number.length()));

        sc.append(c1).append(c2).append(c3).append(c4);


        for (int i = 4; i < Length; i++) {
            char newchr=all.charAt(random.nextInt(all.length()));
            sc.append(newchr);
        }

        return sc.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random Password:");
        System.out.println(Password(8));
    }
}
