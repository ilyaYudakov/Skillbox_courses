public class Main {

    public static void main(String[] args) {

    }

    public static int calculateSalarySum(String text) {
        //TODO: реализуйте метод

        String[] strArr = text.split("\\s+");
        int totalSalary = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (Character.isDigit(strArr[i].charAt(0))) {
                totalSalary = totalSalary + Integer.parseInt(strArr[i]);
            }
        }
        return totalSalary;
    }
}