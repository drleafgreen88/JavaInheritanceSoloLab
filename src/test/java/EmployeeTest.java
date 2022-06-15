import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Director;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
    }

    @Test
    public void managerAsEmployee() {
        employee = new Manager("Peter Gibbons", 123456, 50000, "TPS Reporting");
        assertEquals("Peter Gibbons", employee.getName());
    }

    @Test
    public void directorAsEmployee(){
        employee = new Director("Joanna", 111111, 60000, "Flair Policing", 12.50);
        assertEquals("Joanna", employee.getName());
    }

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Samir", 222222, 35000);
        assertEquals("Samir", employee.getName());
    }

    @Test
    public void databaseAdminAsEmployee(){
        employee = new Developer("Tom Smykowski", 333333, 45000);
        assertEquals("Tom Smykowski", employee.getName());
    }

    @Test(expected = Exception.class)
    public void checkCannotIncreaseSalaryByNegativeAmount() throws Exception {
        employee = new Developer("Tom Smykowski", 333333, 45000);
        employee.raiseSalary(-3000);
    }

    @Test(expected = Exception.class)
    public void checkCannotIncreaseSalaryByZero() throws Exception {
        employee = new Developer("Tom Smykowski", 333333, 45000);
        employee.raiseSalary(0);
    }

    @Test(expected = Exception.class)
    public void checkCannotChangeNameIfNoNameGiven() throws Exception {
        employee = new Developer("Tom Smykowski", 333333, 45000);
        employee.changeName("");
    }

    @Test(expected = Exception.class)
    public void checkCannotChangeNameIfNameIsNull() throws Exception {
        employee = new Developer("Tom Smykowski", 333333, 45000);
        employee.changeName(null);
    }

    @Test
    public void checkCanChangeName() throws Exception {
        employee = new Developer("Tom Smykowski", 333333, 45000);
        employee.changeName("Bob");
        assertEquals("Bob", employee.getName());
    }


}
