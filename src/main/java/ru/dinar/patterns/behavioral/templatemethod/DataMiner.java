package ru.dinar.patterns.behavioral.templatemethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * created: 07-04-2022 - 20:23
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public abstract class DataMiner {

    public byte[] mine(String path) {
        try {
            File file = openFile(path);
            logFile(file);
            return readFile(file);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public byte[] readFile(File file) throws IOException {
        return Files.readAllBytes(file.toPath());
    }

    public File openFile(String path) {
        return new File(path);
    }

    public void logFile(File file) {
        System.out.println("INFO: reading file {" + file.getName()+ "}");
    }

}
