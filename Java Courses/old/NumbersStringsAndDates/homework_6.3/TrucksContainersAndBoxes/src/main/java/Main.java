import java.util.Scanner;

public class Main {

    private static final int TRUCK_CONSTANT = 12;
    private static final int CONTAINER_CONSTANT = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам

        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        int containerNumber = 0;
        int trucksNumber = 0;

        for (int i = 1; i <= boxes; i++) {
            if ((i - 1) % (TRUCK_CONSTANT * CONTAINER_CONSTANT) == 0) {
                trucksNumber++;
                System.out.println("Грузовик: " + trucksNumber);
            }
            if ((i - 1) % CONTAINER_CONSTANT == 0) {
                containerNumber++;
                System.out.println("\tКонтейнер: " + containerNumber);
            }
            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucksNumber + " шт.");
        System.out.println("контейнеров - " + containerNumber + " шт.");
    }
}



