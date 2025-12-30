import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TomteNisseTest {

    @Test
    public void shouldCreateNisse(){
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        String name = TomteNisse.name;
        assertEquals("Tomas", name);
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
        int years = tomas.getAge();
        assertEquals(50, years);
    }

    @Test
    public void changeNisseName(){
        TomteNisse tomas = new TomteNisse("Tomas", 50);
        tomas.changeName("Bob");
        assertEquals("Bob", tomas.getName());
    }
    @Test
    public void getTomteNisseNameAgeTest(){
        TomteNisse tomte = new TomteNisse("Nisha", 38);
        String name = tomte.getName();
        int age = tomte.getYears();
        // Verify name
        assertEquals("Nisha",name);
        //Verify age
        assertEquals(38, age);

    }

}
