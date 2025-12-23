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


}
/*
Skriv koden som gör att testet i uppgift 3 blir godkänt och spara parametrarna i två attribut: userName, password. För alla kommande uppgifter gör likadant Red – Green – Refactor

Skriv test som hämtar attributet userName

Skriv test som hämtar attributet passWord

Skriv ett test som ändrar userName


 */