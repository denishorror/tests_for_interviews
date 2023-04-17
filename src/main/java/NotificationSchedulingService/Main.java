package NotificationSchedulingService;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    final private CopyOnWriteArrayList<Object> adminList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        AtomicBoolean busy = new AtomicBoolean(true);

        if (!busy.compareAndSet(false, true)) {
            System.out.println(busy);
            return;
        }
        System.out.println(busy);
    }
}
