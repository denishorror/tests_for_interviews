package emptylist;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {
    public static void main(String[] args) {
        System.out.println("before");
        List<Long> list = new ArrayList<>();
        for (Long aLong : list) {
            System.out.println("проверка в цикле");
        }
        System.out.println(list);
    }
}
