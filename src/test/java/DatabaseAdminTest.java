import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim", "BBB222", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("BBB222", databaseAdmin.getNINUmber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(35000,databaseAdmin.raiseSalary(5000), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.01);
    }


}
