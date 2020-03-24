import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Peter", "AAA111", 28000);
    }

    @Test
    public void canGetName(){
        assertEquals("Peter", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AAA111", developer.getNINUmber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(28000, developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000,developer.raiseSalary(2000), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(280, developer.payBonus(), 0.01);
    }

}
