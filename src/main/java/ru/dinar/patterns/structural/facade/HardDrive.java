package ru.dinar.patterns.structural.facade;

/**
 * created: 06-04-2022 - 17:12
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("Reading data... Size = " + size);
        return "Data =)".getBytes();
    }

}
