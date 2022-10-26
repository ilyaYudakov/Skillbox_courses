import accessories.*;

import javax.annotation.processing.Processor;

public class Computer {

    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private Monitor monitor;
    private Keyboard keyboard;
    private final String vendor, name;


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getAllWeight() {
        double allWeight =
                ram.getWeight() + monitor.getWeight() +
                keyboard.getWeight() + hardDrive.getWeight();

        return allWeight / 1000;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
