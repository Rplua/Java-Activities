package Module7.inheritanceChallenge;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate) {
        super(name, birthDate);
    }

    public SalariedEmployee(String name, String birthDate, double annualSalary, boolean isRetired) {
        super(name, birthDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    private void retire() {
        if (isRetired) {
            System.out.println("Employee is retired.");
        }
        if(!isRetired) {
            System.out.println("Employee is not retired.");
        }
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }
}
