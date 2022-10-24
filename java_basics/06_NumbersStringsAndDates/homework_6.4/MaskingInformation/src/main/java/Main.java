public class Main {

    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<' && text.contains(">")) {
                int beginIndex = text.indexOf('<');
                int endIndex = text.indexOf('>') + 1;

                if (beginIndex < endIndex) {
                    text = text.replaceAll(text.substring(beginIndex, endIndex), placeholder);
                }
            } else if (text.charAt(i) == '>') {
                text = text.replaceFirst(text.substring(i, i + 1), "\n#\n");
            }
        }
        text = text.replaceAll("\n#\n", ">");
        return text;
    }
}