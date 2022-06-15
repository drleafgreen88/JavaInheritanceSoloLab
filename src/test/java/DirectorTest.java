import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Mike Judge", 875632, 80000, "Occupational Hypnotherapy", 0.49);
    }

    @Test
    public void hasName(){
        assertEquals("Mike Judge", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals(875632, director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Occupational Hypnotherapy", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(0.49, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalary() throws Exception {
        assertEquals(88000, director.raiseSalary(8000));
    }

//    @Test
//    public void canPayBonus(){
//        assertEquals(800, director.payBonus());
//    }

    @Test
    public void canGetBiggerBonus(){
        assertEquals(81600, director.payBonus());
    }

}
