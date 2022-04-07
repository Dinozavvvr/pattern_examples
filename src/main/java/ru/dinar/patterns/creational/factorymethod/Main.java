package ru.dinar.patterns.creational.factorymethod;

/**
 * Main
 * created: 05-04-2022 - 14:50
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    private static final String SYSTEM = "MacOS";

    private static final String WIN10 = "Windows10";
    private static final String MACOS = "MacOS";

    public static void main(String[] args) {
        Dialog dialog = getDialog();

        dialog.render();

        Button button = dialog.createButton();
        button.onClick(() -> System.out.println("Hello world!"));
        button.render();
    }

    public static Dialog getDialog() {
        if (SYSTEM.equals(WIN10)) {
            return new WindowsDialog();
        } else if (SYSTEM.equals(MACOS)) {
            return new MacOsDialog();
        } else {
            throw new IllegalArgumentException("unsupported platform");
        }
    }

}
