public class Main {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод

    String newText = text.replaceAll("[\\-\\d]", " ");
    newText = newText.replaceAll("[\\.!\\?;,:]", "");
    newText = newText.replaceAll("\\s+", "\n");
    if (!text.equals("")) {
      return newText;
    }
    return "";
  }
}