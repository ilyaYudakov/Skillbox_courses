<<<<<<< HEAD
=======
import java.util.Calendar;
import java.util.GregorianCalendar;
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import java.util.Calendar;
import java.util.GregorianCalendar;

=======
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
@DisplayName("М4.6 Даты")
class MainTest {

    @Test
    @DisplayName("Введенная дата больше текущей")
    public void futureDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        launch(calendar.get(Calendar.DAY_OF_MONTH),
<<<<<<< HEAD
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.YEAR), "");
=======
            calendar.get(Calendar.MONTH) + 1,
            calendar.get(Calendar.YEAR), "");
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
    }

    @Test
    @DisplayName("Введен декабрь предыдущего года")
    public void thirtyFirstOfDecember() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR) - 1;
        calendar.set(year, Calendar.DECEMBER, 31);
        int dayOdWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String exp = formatDate(0, 31, 12, year, dayOdWeek);
        if (calendar.equals(Calendar.getInstance())) {
            calendar = Calendar.getInstance();
            exp += formatDate(1, 31, 12, calendar.get(Calendar.YEAR),
<<<<<<< HEAD
                    calendar.get(Calendar.DAY_OF_WEEK));
=======
                calendar.get(Calendar.DAY_OF_WEEK));
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
        }
        launch(31, 12, year, exp);
    }

    @Test
    @DisplayName("Введена текущая дата")
    public void currentDate() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String exp = formatDate(0, day, month, year,
<<<<<<< HEAD
                calendar.get(Calendar.DAY_OF_WEEK));
=======
            calendar.get(Calendar.DAY_OF_WEEK));
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
        launch(day, month, year, exp);
    }

    @Test
    @DisplayName("Введен прошлый год")
    public void lastYearDate() {
        Calendar calendar = new GregorianCalendar();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String exp = formatDate(1, day, month, year,
<<<<<<< HEAD
                calendar.get(Calendar.DAY_OF_WEEK));
=======
            calendar.get(Calendar.DAY_OF_WEEK));
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf

        calendar.add(Calendar.YEAR, -1);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);
        exp = formatDate(0, day, month, year,
<<<<<<< HEAD
                calendar.get(Calendar.DAY_OF_WEEK)) + System.lineSeparator() + exp;
=======
            calendar.get(Calendar.DAY_OF_WEEK)) + System.lineSeparator() + exp;
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf

        launch(day, month, year, exp);
    }

    @Test
    @DisplayName("Введенно первое января текущего года")
    public void firstOfJanuary() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        calendar.set(year, Calendar.JANUARY, 1);
        String exp = formatDate(0, 1, 1, year,
<<<<<<< HEAD
                calendar.get(Calendar.DAY_OF_WEEK));
=======
            calendar.get(Calendar.DAY_OF_WEEK));
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
        launch(1, 1, year, exp);
    }

    private void launch(int day, int month, int year, String exp) {
        String act = Main.collectBirthdays(year, month, day);
        Assertions.assertEquals(exp, replaceSeparatorToCurrentOs(act));
    }

    /*
      Replace CRLF and LF to OS dependent separator
      @param text - string to apply
    */
    private String replaceSeparatorToCurrentOs(String text) {
        return text.strip()
<<<<<<< HEAD
                .replaceAll("\r\n", "\n")
                .replaceAll("\n", System.lineSeparator());
=======
            .replaceAll("\r\n", "\n")
            .replaceAll("\n", System.lineSeparator());
>>>>>>> 685a9acd4cd130928025686daf95a8026bc1bbbf
    }

    private String formatDate(int number, int day, int month, int year, int dayOfWeek) {
        StringBuilder builder = new StringBuilder();
        builder.append(number).append(" - ");
        if (day < 10) {
            builder.append(0);
        }
        builder.append(day).append(".");
        if (month < 10) {
            builder.append(0);
        }
        builder.append(month).append(".").append(year).append(" - ").append(getDayOfWeek(dayOfWeek));
        return builder.toString();
    }

    private String getDayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Sun";
            case 2:
                return "Mon";
            case 3:
                return "Tue";
            case 4:
                return "Wed";
            case 5:
                return "Thu";
            case 6:
                return "Fri";
            case 7:
                return "Sat";
        }
        return "";
    }


}