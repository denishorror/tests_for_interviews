package SortList;

import java.util.*;
import java.util.stream.Collectors;

public class SortOfSet {
    public static void main(String[] args) {
//Unsorted list
        HashSet<String> numbersSet = new LinkedHashSet<>(
                Arrays.asList("15", "11", "11", "55", "47", "18", "1123", "520", "366", "420") );

        List<String> numbersList = new ArrayList<String>(numbersSet) ;        //set -> list

//Sort the list
        Collections.sort(numbersList);

        numbersSet = new LinkedHashSet<>(numbersList);          //list -> set

//Print set to confirm
        System.out.println(numbersSet
                .stream()
                .collect(Collectors.joining(", ")));
    }
}
