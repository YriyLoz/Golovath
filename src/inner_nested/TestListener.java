package inner_nested;

import java.util.ArrayList;
import java.util.List;

public class TestListener {
    private void react(String msg) {
        System.out.println("I have message: " + msg);
    }

    class MyListener implements Listener {
        @Override
        public void onEvent(String msg) {
            react(msg);
        }
    }

    public void init(EventSource eventSource) {
        eventSource.addListener(new MyListener());
    }


}





interface Listener {
    void onEvent(String msg);


}

class EventSource {
    private final List<Listener> listeners = new ArrayList<>();

    void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void run() {
        for (Listener l : listeners) {
            l.onEvent("Hello Baby!");
        }
    }
}