package SortList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {


        List fruitList = new ArrayList<Fruit>();
        Fruit apple=new Fruit(1, "Apple", "Sweet");
        Fruit orange=new Fruit(2, "Orange", "Sour");
        Fruit banana=new Fruit(4, "Banana", "Sweet");
        Fruit grape=new Fruit(3, "Grape", "Sweet and Sour");

        fruitList.add(apple);
        fruitList.add(orange);
        fruitList.add(banana);
        fruitList.add(grape);

//        Map<String, List<Fruit>> fruitMap = fruitList.stream()
//                .collect(Collectors.groupingBy(Fruit::getTaste, Collectors.toList()));
//        System.out.println(fruitMap);
        // .sorted(Comparator.comparing)
    }
}
