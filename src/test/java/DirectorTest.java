import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Alex", "CCC333", 70000, "Tech and Ops", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Alex", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("CCC333", director.getNINUmber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(70000, director.getSalary(),0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech and Ops", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(75000,director.raiseSalary(5000), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1400, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

}
