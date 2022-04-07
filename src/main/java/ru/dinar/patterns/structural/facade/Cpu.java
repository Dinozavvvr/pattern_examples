package ru.dinar.patterns.structural.facade;

/**
 * created: 06-04-2022 - 17:09
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Cpu {

    public void freeze() {
        System.out.println("Freezing...");
    }

    public void jump(long position) {
        System.out.println("Current position: " + position);
    }

    public void execute() {
        System.out.println("Executing...");
    }

}
