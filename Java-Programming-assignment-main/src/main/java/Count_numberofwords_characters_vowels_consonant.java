public class Count_numberofwords_characters_vowels_consonant {
    public static void main(String[] args) {
        String s= "I am a SQA Engineer";
        String arr[]=s.split(" ");
        System.out.println("Words: "+arr.length);
// char ber kora
        StringBuilder combined = new StringBuilder();
        for (String word : arr) {
            combined.append(word);
        }
        System.out.println("Chars: " + combined.length());

//vowels ber kora
        char ch[]=s.toCharArray();
        String vowels="aeiouAEIOU";
        int count=0;
        for ( char v :ch){
            if (vowels.indexOf(v)>-1) {
               count++;
            }

        }
        System.out.println("vowels: "+count);
        //constant ber kora
        String consonant ="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        count=0;
        for ( char cons :ch){
            if (consonant.indexOf(cons)!=-1) {
                count++;
            }
        }
        System.out.println("Consonant: "+count);
    }
}
