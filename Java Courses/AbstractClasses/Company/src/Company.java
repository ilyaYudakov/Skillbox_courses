import java.util.*;

public class Company {

    private int income;
    private List<Employee> employeeList = new ArrayList<>();

    public void hire(Employee employee) {
        employeeList.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        this.employeeList = employees;
    }

    public void fire(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public  void printSalaryList(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {

        Collections.sort(employeeList);
        Collections.reverse(employeeList);
        List<Employee> salaryTop = new ArrayList<>();

        if (count > 0 && count <= employeeList.size()) {
            salaryTop = employeeList.subList(0, count);
            System.out.println("Список из " + count + " зарплат по убыванию:");
            printSalaryList(salaryTop);
            return salaryTop;
        } else if (count > employeeList.size()) {
            printSalaryList(employeeList);
            return employeeList;
        } else {
            System.out.println("нельзя сформировать список из отрицательных значений");
            return salaryTop;
        }

    }

    public List<Employee> getLowestSalaryStaff(int count) {

        List<Employee> salaryLow = new ArrayList<>();
        Collections.sort(employeeList);
        if (count > 0 && count <= employeeList.size()) {
            salaryLow = employeeList.subList(0, count);
            System.out.println("Список из " + count + " зарплат по возрастанию:");
            printSalaryList(salaryLow);
            return salaryLow;
        } else if (count > employeeList.size()){
            printSalaryList(employeeList);
            return employeeList;
        } else {
            System.out.println("нельзя сформировать список из отрицательных значений");
            return salaryLow;
        }
    }

    public double setIncome() {
        double minIncome = 0.0;
        double maxIncome = 15_000_000.0;

        return (Math.random() * maxIncome) + minIncome;
    }

    public double getIncome() {
        return income;
    }
}
