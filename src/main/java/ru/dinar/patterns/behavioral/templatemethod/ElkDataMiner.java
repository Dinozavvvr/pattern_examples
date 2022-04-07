package ru.dinar.patterns.behavioral.templatemethod;

import java.io.File;

/**
 * created: 07-04-2022 - 20:33
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class ElkDataMiner extends DataMiner {

    @Override
    public void logFile(File file) {
        System.out.println("Sending file to logstash");
    }

}
