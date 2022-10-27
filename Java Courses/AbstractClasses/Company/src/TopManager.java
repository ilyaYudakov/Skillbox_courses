public class TopManager implements Employee{

    private int salary = setSalary() * 10;

    public TopManager(Company company) {
        if (company.getIncome() > 10_000_000) {
            double BONUS_PERCENT = 1.5;
            salary = (int) (salary + salary * BONUS_PERCENT);
        }
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
