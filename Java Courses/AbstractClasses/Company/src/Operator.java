public class Operator implements Employee{


    private final int salary = setSalary();
    private final Company company;

    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
