public class SalariedEmployee extends Employee{

    private double annualSalary;


    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 12;
        return paycheck;
    }


}
