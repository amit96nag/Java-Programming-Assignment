import java.util.Scanner;

public class Note_Count {
    public static void main(String[] args) {
        System.out.print("Give Any Amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();


        int notes[]={1000,500,200,100,50,20,10,5,1};
        for (int i=0;i<notes.length;i++)
         {
            int count=amount/notes[i];
            if (count>0)
            {
                amount = amount % notes[i];
                System.out.println(notes[i] + "   " + count );
            }


         }
    }
}
