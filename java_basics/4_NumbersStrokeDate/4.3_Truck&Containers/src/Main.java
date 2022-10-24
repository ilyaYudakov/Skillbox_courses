import java.util.Scanner;

public class Main {
    private static final int TRUCK_CONSTANT = 12;
    private static final int CONTAINER_CONSTANT = 27;

    public static void main(String[] args) {
        System.out.print("Enter box`s: ");
        Scanner scanner = new Scanner(System.in);
        int boxCount = scanner.nextInt();

        int containerCount = (int) Math.ceil( (double) boxCount / CONTAINER_CONSTANT);
        int truckCount = (int) Math.ceil( (double) containerCount/ TRUCK_CONSTANT);

        int containerNumber = 1;
        int boxNumber = 1;
        for (int t = 1; t <= truckCount; ++t) {
            System.out.println("Truck " + t);
            for (int c = 0; c < TRUCK_CONSTANT && containerNumber <= containerCount; c++) {
                System.out.println("Container " + containerNumber);
                containerNumber++;
                for (int b = 0; b < CONTAINER_CONSTANT && boxNumber <= boxCount; b++) {
                    System.out.println("Box " + boxNumber);
                    boxNumber++;
                }
            }
        }
    }
}