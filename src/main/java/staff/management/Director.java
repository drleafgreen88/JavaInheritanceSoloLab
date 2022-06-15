package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int nationalInsuranceNumber, int salary, String deptName, double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int payBonus(){
        return (int) (salary * 1.02);
    }
}
