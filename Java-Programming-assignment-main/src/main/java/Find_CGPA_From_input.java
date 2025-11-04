import java.util.Arrays;
import java.util.Scanner;

public class Find_CGPA_From_input {
    public static void main(String[] args) {
        double[] numbers = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        Arrays.sort(numbers);

        System.out.print("Enter CGPA: ");
        Scanner scanner = new Scanner(System.in);
        double target = scanner.nextDouble();

        int start = 0;
        int end = numbers.length - 1;
        boolean found = false;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (numbers[mid] == target)
            {
                found = true;
                break;
            }
            else if (numbers[mid] < target)
            {
                start = mid + 1;
            }
            else //mid>target
            {
                end = mid - 1;
            }
        }


        if (found) {
            System.out.println("CGPA found!");
        } else {
            System.out.println("NOt Found!");
        }

        scanner.close();

    }
}
