package IntegerToInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class IntContainsInt {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> numList1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> numList2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numList1);
        System.out.println(numList2);

        return numList1.stream()
                .filter(numList2::contains)
                .distinct()
                .mapToInt(i -> i)
                .toArray();

    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.stream(intersection).boxed().collect(Collectors.toList()));
    }
}

