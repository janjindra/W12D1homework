import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jan", "ABC123", 50000, "Technology");
    }

    @Test
    public void canGetName(){
        assertEquals("Jan", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ABC123", manager.getNINUmber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, manager.getSalary(),0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Technology",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(55000,manager.raiseSalary(5000), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, manager.payBonus(), 0.01);
    }

}
