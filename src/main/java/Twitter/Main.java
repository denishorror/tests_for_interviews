package Twitter;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <String> messages = Arrays.asList("Сегодня в #MOSCOW хорошая погода, а в #Piter опять дождь",
                "В #piter сегодня пробки 10 баллов");

        Set <String> tags = messages.stream()
                .map(message -> message.split(" "))
                .flatMap(Arrays::stream)
                .filter(word -> word.startsWith("#"))
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(tags);
    }
}
