package src;
public class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveUp() {
        return currentFloor++;
    }

    public int moveDown() {
        return currentFloor--;
    }

    public void move(int floor) {
        while (floor != currentFloor) {
            if (floor > maxFloor || floor < minFloor) {
                System.out.println("Неправильно указан этаж, попробуйте еще раз");
                break;
            } else if (floor > currentFloor) {
                System.out.println("Двигается наверх - " + moveUp());
            } else {
                System.out.println("Двигается вниз - " + moveDown());
            }
        }
        System.out.println();
    }
}
