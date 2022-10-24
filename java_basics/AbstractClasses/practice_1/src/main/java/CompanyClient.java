public class CompanyClient extends Client {

    @Override
    public void take(double amount) {
        super.take(amount + (amount * 0.01));
    }
}
