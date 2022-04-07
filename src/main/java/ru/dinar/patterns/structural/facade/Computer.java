package ru.dinar.patterns.structural.facade;

/**
 * created: 06-04-2022 - 17:13
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Computer {

    private static final long BOOT_ADDRESS = 1234123412L;
    private static final long BOOT_SECTOR = 10172389L;
    private static final int SECTOR_SIZE = 389;

    private final Cpu processor;
    private final Memory ram;
    private final HardDrive hd;

    public Computer() {
        this.processor = new Cpu();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();

        System.out.println("Computer started");
    }

}
