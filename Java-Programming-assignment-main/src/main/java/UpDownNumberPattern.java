public class UpDownNumberPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--)  //5 number row te gelo 1.*****,2.****,3.***,2.**,1.*
        {
            for (int j = 1; j <= i; j++)  //j er value 1-5 cilo tai 12345 ,j er value 1-4 tai 1234 VALUE1-3 tai123,value 1-2
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j); // Print the number
            }
            System.out.println();
        }
    }
}
