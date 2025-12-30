import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomteNisseTest {
    @Test
    public void getTomteNisseNameAgeTest(){
        TomteNisse tomte = new TomteNisse("Nisha", 38);
        String name = tomte.getNamn();
        int age = tomte.getYears();
        // Verify name
        assertEquals("Nisha",name);
        //Verify age
        assertEquals(38, age);

    }


}
