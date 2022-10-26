import accessories.*;
import enums.HDType;
import enums.MonitorType;
import enums.TypeRam;

import javax.lang.model.type.TypeMirror;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Lenovo", "Z50-70");
//        computer.setProcessor(new Processor(1.7, 23.7, 4, "intel"));
        computer.setKeyboard(new Keyboard("lalala", false, 456.3));
        computer.setHardDrive(new HardDrive(HDType.SDD, 500, 856.87));
        computer.setRam(new Ram(TypeRam.DDR3, 6, 17));
        computer.setMonitor( new Monitor(15.6, 1500, MonitorType.IPS));

        System.out.println(computer);

        System.out.println("общий вес комплектующих: " + computer.getAllWeight());
    }
}
