package BoldWorlds;

import java.util.*;
import java.util.stream.Collectors;

public class BoldWorlds {
    public static void main(String[] args) {
        List <String> messages = Arrays.asList("Сегодня в <b>MOSCOW</b> хорошая погода, а в <b>Piter</b> опять дождь",
                "В <b>piter</b> сегодня пробки 10 баллов. <b>Serpukhov</b>");

        Set <String> tags = messages.stream()
                .map(message -> message.split(" "))
                .flatMap(Arrays::stream)
                .filter(word -> word.startsWith("<b>"))
                .filter(word -> word.contains("</b>"))
                .map(word -> word.substring (0, word.length()-4))
                .map(word -> word.substring (3, word.length()))
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(tags);
    }
}
