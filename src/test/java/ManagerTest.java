import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bill Lumbergh", 123456, 50000, "Stapler Confiscation");
    }

    @Test
    public void hasName(){
        assertEquals("Bill Lumbergh", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals(123456, manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Stapler Confiscation", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() throws Exception {
        assertEquals(55000, manager.raiseSalary(5000));
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, manager.payBonus());
    }
}
