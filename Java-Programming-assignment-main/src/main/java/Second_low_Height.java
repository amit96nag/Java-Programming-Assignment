import java.util.Arrays;
import java.util.Scanner;

public class Second_low_Height {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter Height");
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0], secmin = arr[1];
        if (min < secmin)
        {
            secmin = arr[1];
        }
        else {
            min = arr[1];
            secmin = arr[0];
           }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] < secmin && arr[i] > min)
            {
                secmin = arr[i];
            }
        }


        System.out.println("2 lowest height of babies " + secmin +" CM");
    }
}