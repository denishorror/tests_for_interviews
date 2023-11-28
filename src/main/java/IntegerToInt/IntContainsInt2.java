package IntegerToInt;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//Версия с Set - оптимальная
class IntContainsInt2 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(set1);
        Set<Integer> set2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(set2);

        set1.retainAll(set2);
        return set1.stream()
                .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 9};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.stream(intersection).boxed().collect(Collectors.toList()));
    }
}

