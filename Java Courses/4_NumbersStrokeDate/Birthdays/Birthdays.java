package Birthdays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {
    public static void main(String[] args) {

        System.out.println(collectBirthdays(1980,12,12));

    }

    public static StringBuilder collectBirthdays(int year, int month, int day) {

        LocalDate birthday =  LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int age = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy - EE");
        if (birthday.isAfter(today)) return new StringBuilder("");

        StringBuilder sb = new StringBuilder();

        while (today.isAfter(birthday) || today.isEqual(birthday)) {
            sb.append(System.lineSeparator())
                    .append(age).append(" - ").append(formatter.format(birthday));
            birthday = birthday.plusYears(1);
            age++;
        }
        return sb;
    }
}
