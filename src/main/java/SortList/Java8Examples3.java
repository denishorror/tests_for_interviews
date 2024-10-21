package SortList;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Java8Examples3 {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("яблоко", 10, new BigDecimal("9.99")),
                new Item("банан", 20, new BigDecimal("19.99")),
                new Item("апельсин", 10, new BigDecimal("29.99")),
                new Item("грейпфрут", 10, new BigDecimal("29.99")),
                new Item("папайя", 20, new BigDecimal("9.99")),
                new Item("яблоко", 10, new BigDecimal("9.99")),
                new Item("банан", 10, new BigDecimal("19.99")),
                new Item("яблоко", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> group = items
                .stream()
//                .sorted(Comparator.comparing(Item::getName))
                .collect(Collectors.toMap(Item::getName, item -> 1L, Long::sum));
        Map<String, Long> sortedGroup = new TreeMap<>(group);

        //            counting.merge(String.valueOf(item.getPrice()), 1L, Long::sum);
        //            counting.merge(String.valueOf(item.getQty()), 1L, Long::sum);

        System.out.println(sortedGroup);



        for (Object o : sortedGroup.values()) {
            System.out.println(o);
        }

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

        System.out.println(sum);

    }
}
