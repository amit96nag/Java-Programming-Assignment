import java.util.Arrays;
import java.util.Random;

public class MAX_MIN_Nmber {
    public static void main(String[] args) {

        int[] number = new int[10];
        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        System.out.println("Generated 10 Random Numbers ");
        System.out.println(Arrays.toString(number));

        int min2 = number[0];
        int max2 = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min2) {
                min2 = number[i];
            }
            if (number[i] > max2) {
                max2 = number[i];
            }
        }
        System.out.println("Minimum Number: " + min2);
        System.out.println("Maximum Number: " + max2);


    }
}
