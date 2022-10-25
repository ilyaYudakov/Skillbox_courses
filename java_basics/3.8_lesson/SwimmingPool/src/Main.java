public class Main {

//    Создайте переменную, в которой будет храниться текущий объём
//    бассейна, и каждую итерацию цикла добавляйте к нему fillingSpeed
//    и вычитайте из него devastationSpeed. Как только текущий объём
//    бассейна станет равен значению переменной volume, выполните
//    команду break. В процессе выполнения цикла считайте количество
//    итераций — это и будет время наполнения бассейна.

    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int xtime = 0;
        int increaseValue = fillingSpeed - devastationSpeed;
        int fiilingValue = 0;

        while (fiilingValue < volume) {
            xtime++;
            fiilingValue += increaseValue;
        }
        System.out.println("Заполнится за " + xtime + " минут");
    }
}
