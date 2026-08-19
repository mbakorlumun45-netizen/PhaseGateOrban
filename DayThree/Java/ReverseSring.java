public class ReverseSring{
    public static String Reversed(String word){

    String reversedWord = "";

    for(int count = 1; count < word.length() - 1; count--){

        reversedWord = word.charAt(count);    
    }
    return reversedWord;
    }

public static void main(String[] args){

    String word = "merlin";

    String result = Reversed(word);

    System.out.println(result);
}
}
