package ru.dinar.patterns.structural.facade;

import java.util.Arrays;

/**
 * created: 06-04-2022 - 17:11
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Loading data... " + Arrays.toString(data));
    }

}
