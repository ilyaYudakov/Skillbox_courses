public class Main {

    public static void main(String[] args) {
        Integer vasyaAge = 25;
        Integer katyAge = 52;
        Integer mishaAge = 35;

        Integer min = -1;
        Integer middle = -1;
        Integer max = -1;

        if (vasyaAge > katyAge && vasyaAge > mishaAge) {
            min = vasyaAge;
            if (katyAge > mishaAge) {
                max = katyAge;
                middle = mishaAge;
            }
        } else if (katyAge > vasyaAge && katyAge > mishaAge) {
            min = katyAge;
            if (vasyaAge > mishaAge) {
                max = vasyaAge;
                middle = mishaAge;
            } else {
                max = mishaAge;
                middle = vasyaAge;
            }
        } else if (mishaAge > vasyaAge && mishaAge > katyAge) {
            min = mishaAge;
            if (vasyaAge > katyAge) {
                max = vasyaAge;
                middle = katyAge;
            }
        } else {
            max = katyAge;
            middle = vasyaAge;
        }
        System.out.println("Minimal age:  " + middle);
        System.out.println("Middle age:  " + max);
        System.out.println("Maximal age:  " + min);
    }
}
