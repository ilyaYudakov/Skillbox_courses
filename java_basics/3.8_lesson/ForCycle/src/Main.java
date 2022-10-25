import java.util.Scanner;

//Напишите программу, которая будет находить все пары положительных целых чисел, произведение которых будет равно значению value. Например, если ввести число 6, программа должна выдать следующий результат:
//        1*6
//        2*3
//        3*2
//        6*1

public class Main {
    public static void main(String[] args) {

        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i++ ) {
            for (int j = 1; j <= value; j++) {
                if (i * j == value) {
                    System.out.println(i + " * " +j);
                }
            }
        }
    }
}
