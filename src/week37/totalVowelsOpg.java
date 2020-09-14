package week37;

import java.util.ArrayList;
public class totalVowelsOpg {

    public static void main(String[] args) {
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("This");
        vowels.add("Is");
        vowels.add("A");
        vowels.add("Vowel");
        vowels.add("Counter");
        totalVowels(vowels);

    }
    static void totalVowels(ArrayList<String> vowels){
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        if(vowels.size() < 1){
            System.out.println("The ArrayList is empty");
        }
        else {
            for (int i = 0; i < vowels.size(); i++) {
                String lower = vowels.get(i).toLowerCase();

                for (int j = 0; j < lower.length(); j++) {
                    char myChar = lower.charAt(j);

                    if (myChar == 'a') aCount++;
                    else if (myChar == 'e') eCount++;
                    else if (myChar == 'i') iCount++;
                    else if (myChar == 'o') oCount++;
                    else if (myChar == 'u') uCount++;


                }
            }
            System.out.println(" a's: " + aCount + "\n e's: " + eCount + "\n i's: " + iCount + "\n o's: " + oCount + "\n u's: " + uCount);
        }
        /*
       Fancy solution with no loops (help from stackoverflow)
        System.out.println(vowels);
        String arrayToString = vowels.toString();
        int length = arrayToString.length();
        System.out.println("a's: " + (length - arrayToString.replace("a", "").length()));
        System.out.println("e's: " + (length - arrayToString.replace("e", "").length()));
        System.out.println("i's: " + (length - arrayToString.replace("i", "").length()));
        System.out.println("o's: " + (length - arrayToString.replace("o", "").length()));
        System.out.println("u's: " + (length - arrayToString.replace("u", "").length()));
    */
    }

}
