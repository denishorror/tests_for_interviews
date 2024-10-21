package StringJoiner;

import java.util.StringJoiner;

public class TestStringJoiner {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("foo");
        joiner.add(null);
        joiner.add("baz");
        String joined = joiner.toString(); // "foo,bar,baz"
        System.out.println(joined);
    }
}
