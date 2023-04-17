package ForEachTest;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class ForEachTest {
    public static void main(String[] args) {
        out.println("==================");
        List<Long> longList = new ArrayList<>();
        longList.forEach(System.out::println);
    }
}
