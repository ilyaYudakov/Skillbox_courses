public class Basket {

    private int basketsCount = 0;
    private String items;
    private int totalPrice = 0;
    private int limit, allBasketProducts;
    private double totalWeight = 0, allBasketsPrice;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;

    }

    public int getBasketsCount() {
        return basketsCount;
    }

    public int getAllBasketProducts() {
        return allBasketProducts;
    }

    public double getAllBasketsPrice() {
        return allBasketsPrice;
    }

    public void increaseBasketsCount(int basketsCount) {
        this.basketsCount+= basketsCount;
    }

    private void increaseAllBasketsPrice(int price) {
        allBasketProducts += price;
    }

    private void increaseAllBasketProducts(int allBasketProducts) {
        this.allBasketProducts += allBasketProducts;
    }

    public double getAveragePriceOfProduct() {
        return allBasketsPrice / allBasketProducts;
    }

    public  double getAveragePriceOfBasket() {
        return allBasketsPrice / basketsCount;
    }

    public void increaseCount(int count) {
        basketsCount += count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight = totalWeight + weight;
        increaseAllBasketProducts(count);
        increaseAllBasketsPrice(price * count);
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
