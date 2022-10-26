public class IndividualEntrepreneurClient extends Client {

    @Override
    public void put(double amount) {
        double getChange01 = amount * 0.01;
        double getChange005 = amount * 0.005;
        super.put(amount < 1000 ? amount - getChange01 : amount - getChange005);
    }
}
