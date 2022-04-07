package ru.dinar.patterns.behavioral.templatemethod;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * created: 07-04-2022 - 20:23
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        String path = "src/main/java/ru/dinar/patterns/behavioral/templatemethod/file.txt";

        // майнер который собирает данные файла в logstash
        DataMiner elkDataMiner = new ElkDataMiner();
        elkDataMiner.mine(path);

        // переопределяем логику шагов не изменяя шаблонный метод mine(path)
        DataMiner customDataMiner = new DataMiner() {

            @Override
            public byte[] readFile(File file) throws IOException {
                byte[] data = super.readFile(file);
                System.out.println(Arrays.toString(data));
                return data;
            }

        };

        customDataMiner.mine(path);
    }

}
