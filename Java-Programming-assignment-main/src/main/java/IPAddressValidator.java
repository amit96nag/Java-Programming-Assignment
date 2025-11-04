import java.util.Scanner;

public class IPAddressValidator {

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4)
        {
            return false;
        }
        for (String part : parts)
        {
            if (!part.matches("\\d+"))
            {
                return false;
            }
            int number = Integer.parseInt(part);
            if (number < 0 || number > 255) {
                return false;
            }
        }


        String first = parts[0];
        if (first.equals("0")) {
            return false;
        }
        if (first.length() == 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = scanner.nextLine();
        
        if (isValidIP(ip)) {
            System.out.println(" Valid IP address");
        } else {
            System.out.println(" Invalid IP address");
        }

        scanner.close();
    }
}
