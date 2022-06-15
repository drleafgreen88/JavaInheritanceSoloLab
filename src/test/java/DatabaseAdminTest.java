import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Milton Waddams", 9876543, 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Milton Waddams", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals(9876543, databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary() throws Exception {
        assertEquals(44000, databaseAdmin.raiseSalary(4000));
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, databaseAdmin.payBonus());
    }

}
