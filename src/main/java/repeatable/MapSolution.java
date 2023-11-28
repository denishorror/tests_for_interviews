package repeatable;

import java.util.*;
import java.util.stream.Collectors;

public class MapSolution {
    public static void main(String[] args) {
        int[] input = {10, 6, 10, 10, 7, 10, 10, 8, 8, 10, 9, 5};
        Set<Integer> inputList = Arrays.stream(input)
                .boxed()
                .collect(Collectors.toSet());

//        Set<Integer> collect = inputList.stream()
//                .filter(i -> inputList.stream()
//                        .filter(i::equals)
//                        .count() == 1)
//                .collect(Collectors.toSet());

        System.out.println(inputList);
    }
}

