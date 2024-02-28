package Doubles;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class HasDoubles {


    public static void main(String[] args) {
        int[] nums = {9, 4, 9, 8, 4};
        boolean flag = (nums.length - doubles(nums)) != 0;
        System.out.println(flag? "Есть дубли" : "Нет дублей");
    }

    public static int doubles(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        return set.size();
    }
}
