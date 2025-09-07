package JavaTest;

import java.util.stream.IntStream;

public class Limit {
    public static void main(String[] args) {
        IntStream.iterate(1, x -> x + 1)
//                .sorted()
                .limit(5)
                .forEach(System.out::print);
    }
}
