public class Remove_Vowels {
    public static void main(String[] args) {
       String s="I am a SQA Engineer";

        System.out.println(s.replace("A", "")
                 .replace("a", "")
                .replace("E","")
                .replace("e","")
                .replace("I","")
                .replace("i",""));

    }
}
