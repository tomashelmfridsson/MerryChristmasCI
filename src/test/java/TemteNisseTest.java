import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemteNisseTest {
    @Test
    public void nisseTest(){
        TomteNisse nisse = new TomteNisse("Nisse",107);
        assertEquals("TomteNisse{namn='Nisse', years=107}",nisse.toString());
    }
}
