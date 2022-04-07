package ru.dinar.patterns.structural.proxy;

import ru.dinar.patterns.structural.flyweight.Window;

import java.util.Arrays;

/**
 * created: 06-04-2022 - 18:41
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        // данные
        byte[][] image = new byte[Window.Resolution.HD.getWidth()][Window.Resolution.HD.getWidth()];
        byte s = '*';

        for (byte[] bytes : image) {
            Arrays.fill(bytes, s);
        }

        // будем использовать класс Window из пакета flyweight в качестве проксируемого класса

        // можно заметить что это один в один - декоратор - но разница в том что декоратор использует агрегацию
        // базового декоратора и может предоставить другой интерфейс, прокси же может использовать как агрегацию
        // так и композицию, содержит в себе более конкретный объект и совпадает с интерфейсом конкретного класса
        TimedWindow window = new TimedWindow(new Window(Window.Resolution.HD));
        window.display(image);
    }

}
