import java.util.Random;

public class Manager implements Employee{

    private int salary = setSalary() * 5;
    public static Random random = new Random();

    public Manager(Company company) {
        double profit = random.nextInt(25_000) + 115_000;
        double BONUS_PERCENT = 0.05;
        salary = (int) (salary + BONUS_PERCENT * profit);
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
