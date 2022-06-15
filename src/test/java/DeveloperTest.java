import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Michael Bolton", 654321, 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Michael Bolton", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals(654321, developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() throws Exception {
        assertEquals(33000, developer.raiseSalary(3000));
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus());
    }

}
