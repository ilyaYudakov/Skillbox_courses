import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

            boolean hasDigit = false;
            int spaceCount = 0;
            if (input.length() != 0) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        spaceCount++;
                    }
                    if (Character.isDigit(input.charAt(i))) {
                        hasDigit = true;
                        break;
                    }
                }

                if (spaceCount != 2 || hasDigit) {
                    System.out.println("Введенная строка не является ФИО");
                    return;
                }

                String firstname = input.substring(0, input.indexOf(' ')).trim();
                String lastname = input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim();
                String patronymic = input.substring(input.lastIndexOf(' ')).trim();

                System.out.println("Фамилия: " + firstname + "\nИмя: " + lastname + "\nОтчество: " + patronymic);
            }
        }
    }
}