package Atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class TestClassAtomicCounter {

    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int id;
    public TestClassAtomicCounter() {
        id = COUNTER.getAndIncrement();
    }
    public int getId() {
        return id;
    }

    public static void main(String... args) {
        System.out.println(new TestClassAtomicCounter().getId()); //1
        System.out.println(new TestClassAtomicCounter().getId()); //2
        System.out.println(new TestClassAtomicCounter().getId()); //3
    }
}

