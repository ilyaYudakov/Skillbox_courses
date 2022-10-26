package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        HomeWork #1

//        Elevator elevator = new Elevator(-3, 26);
//
//        while (true) {
//            System.out.println("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

//        HomeWork #2


        Dimensions dimensions = new Dimensions(200, 300, 1000);

        Order moscowOrder = new Order(dimensions, 20, "Moscow", false, "22-fa-45", true);
        Order order = moscowOrder.setMass(200);

        System.out.println(moscowOrder == order);
        System.out.println(moscowOrder.equals(order));

    }
}
