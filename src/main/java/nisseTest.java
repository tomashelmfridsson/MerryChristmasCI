import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class nisseTest {

    @Test
    public void shouldCreateNisse(){
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        String namn = TomteNisse.namn;
        assertEquals("Tomas", namn);
        int years = tomas.years;
        assertEquals(50, years);
    }

    @Test
    public void shouldGetNisseName(){
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        String actual = tomas.getName();
        assertEquals("Tomas", actual);
    }

    @Test
    public void shouldGetNisseYears() {
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        int years = tomas.getYears();
        assertEquals(50, years);
    }

    @Test
    public void changeNisseName(){
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        tomas.changeName("Bob");
        assertEquals("Bob", tomas.getName());
    }
}
/*



 */