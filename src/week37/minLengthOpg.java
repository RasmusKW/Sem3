package week37;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minLengthOpg {

    public static void main(String[] args) {

        List<String> words = new ArrayList();
        words.add("This");
        words.add("Is");
        words.add("A");
        words.add("String");
        words.add("Counter");
        minLength(words);

    }

    static void minLength(List<String> word){
        String longestWord = "";
        for (String words : word){
            if (words.length() > longestWord.length()){
                longestWord = words;
            }
        }

        String shortestWord = longestWord;
        for (String words : word){
            if (words.length() < shortestWord.length()){
                shortestWord = words;
            }
        }
        System.out.println("Shortest string is: " + shortestWord + "\n" + "The word length is: " + shortestWord.length());
    }

}
