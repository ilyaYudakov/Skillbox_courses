import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        String pat1 = "(<[0-9\\s]>)|<(\\d{4}\\s){2}\\d{4}>|<\\d{4}>|<\\d+\\s\\d+\\s\\d+>";
        Pattern pattern = Pattern.compile(pat1);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()){
            text =  text.replaceAll(pat1, placeholder);
        }else{
            return text;
        }
        return text;
    }

}