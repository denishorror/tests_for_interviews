package repeatable;


import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] input = {10, 6, 10, 10, 7, 10, 10, 8, 8, 10, 9, 5};
        List <Integer> inputList = Arrays.stream(input)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> repeatable = inputList.stream()
                .filter(i -> inputList.stream()
                        .filter(i::equals)
                        .count() == 1)
                .collect(Collectors.toSet());

        System.out.println(repeatable);
    }


}

