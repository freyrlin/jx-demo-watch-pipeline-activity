package jenkinsx.example.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Global {

    private static final int SIZE = 10;
    static private List<String> events = new ArrayList<>();

    static synchronized public void putEvent(String e) {
        events.add(e);
        if (events.size() > SIZE) {
            events = events.subList(events.size() - SIZE, events.size());
        }
    }

    static public List<String> getEvents() {
        return events;
    }

}
