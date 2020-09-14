package week37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countUniqueOpg {

    public static void main(String[] args) {

        //Creating our list.
        List<Integer> myNumbers = new ArrayList();

        //Adding data/values to our list.
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(104);
        myNumbers.add(7);
        myNumbers.add(2);
        myNumbers.add(-48);
        myNumbers.add(-48);
        myNumbers.add(43984);
        myNumbers.add(4943);

        //Printing the initial list.
        System.out.println("Starting list: " + myNumbers);

        //Calling the method on our myNumbers list.
        countUnique(myNumbers);

    }

    //Creating the countUnique method with a List parameter called numbers (of type integer)
    static void countUnique(List<Integer> numbers){

        //To obtain the unique values in the list i decided to use a HashSet which implements the Set interface.
        //Set extends Collection<E> and is a collection that contains no duplicate elements
        //Which means it's perfect for finding unique values.
        Set<Integer> hashList = new HashSet<>(numbers);

        //Printing the HashSet values (since it contains no duplicate values we get the unique values).
        System.out.println("Unique Values: " + hashList);

        //Printing the size of the HashSet to get the amount of unique values.
        System.out.println("Amount of unique values: " + hashList.size());
    }

}

