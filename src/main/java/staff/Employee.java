package staff;

public abstract class Employee {

    private String name;
    private int nationalInsuranceNumber;
    protected int salary;

    public Employee(String name, int nationalInsuranceNumber, int salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(int amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Why would you want to raise somebody's salary by a negative amount?");

        return (salary + amount);
    }

    public int payBonus(){
        return (int) (salary * .01);
    }

    public void changeName(String newName) throws Exception {
        if (newName.isEmpty())
            throw new Exception("I believe you have my stapler.");
        name = newName;

    }
}
