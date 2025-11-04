

import java.util.Scanner;

public class BinaryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char ch[]=input.toCharArray();
        boolean isBinary = true;

        if (input.isEmpty()) {
            isBinary = false;
        }
        else
        {
            for (char number :ch)
            {
                if (number != '0' && number != '1')
                {

                    isBinary = false;
                    break;
                }
            }
        }

        if (isBinary) {
            System.out.println(" The string is a valid binary number.");
        } else {
            System.out.println(" The string is NOT a binary number.");
        }

        scanner.close();
    }
}
