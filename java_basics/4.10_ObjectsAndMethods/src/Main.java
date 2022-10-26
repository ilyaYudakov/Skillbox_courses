public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("bread", 200, 1, 2.54);
        basket.add("fox", 400, 1, 200.54);
        basket.add("bread", 200, 1, 50.5);

        basket.print("Milk");
        System.out.printf("Общий вес - %.2f", basket.getTotalWeight());

//        Arithmetic arithmetic = new Arithmetic(2, 3);

        System.out.println(basket.getAllBasketsPrice());
        System.out.println(basket.getAveragePriceOfBasket());
        System.out.println(basket.getAveragePriceOfProduct());
        System.out.println(basket.getBasketsCount());
    }
}
