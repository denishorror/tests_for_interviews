package repeatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class CountRepeats {
        public static void main(String[] args) {

            List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13,13, 21, 34, 55, 89, 144, 233);

            System.out.println("Count all with frequency");
            Set<Integer> set = new HashSet<Integer>(list);
            for (Integer r : set) {
                System.out.println(r + ": " + Collections.frequency(list, r));
            }
        }}
