package killDouble;

import java.util.ArrayList;
import java.util.List;

public class KillDouble {
    public static void main(String[] args) {
//        String input = "Зздрррраавствввууй,    Ссссбееерррр!";
        String input = "Zzzdraaavstvuyyy,  Sssberrr!";
        String expected = "Здравствуй, Сбер!";

        String s = killDoubles(input);
        System.out.println(s);
    }
    public static String killDoubles(String input) {
        List<Character> finalString = new ArrayList<>();
        char[] anyString = input.toCharArray();
        for (int i = 0, anyStringLength = anyString.length-1; i < anyStringLength; i++) {
            char c = anyString[i];
            if (c != anyString[i + 1]) {
                finalString.add(c);
            }
        }
        return String.valueOf(finalString);
    }
}
