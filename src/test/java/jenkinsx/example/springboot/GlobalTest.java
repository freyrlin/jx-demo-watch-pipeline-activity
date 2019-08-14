package jenkinsx.example.springboot;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GlobalTest {

    @Test
    void putEvent() {
        Global.putEvent("a");
        Global.putEvent("b");
        Global.putEvent("c");
        Global.putEvent("d");
        Global.putEvent("e");
        Global.putEvent("f");
        Global.putEvent("g");
        Global.putEvent("h");
        Global.putEvent("i");
        Global.putEvent("j");
        Global.putEvent("k");
        List<String> events = Global.getEvents();
        assertEquals(10, events.size());
        assertEquals("b", events.get(0));
        assertEquals("k", events.get(9));
    }

}