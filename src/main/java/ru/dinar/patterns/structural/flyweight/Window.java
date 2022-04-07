package ru.dinar.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * created: 06-04-2022 - 17:39
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Window implements Display {

    private final int width;

    private final int high;

    private final Resolution resolution;

    private final Set<Color> cache;

    public Window(Resolution resolution) {
        this.resolution = resolution;
        this.high = resolution.getHigh();
        this.width = resolution.getWidth();
        this.cache = new HashSet<>();
    }

    public void display(byte[][] image) {
        if (image.length != width || (image.length > 0 && image[0].length != high)) {
            for (int i = 0; i < high; i++) {
                for (int j = 0; j < width; j++) {
                    // это плохо, так как каждый раз новый объект
                    // ColorPrinter.print(new Color(image[i][j]));
                    // вместо этого применим паттерн Flyweight
                    byte b = image[j][i];
                    Color color;
                    Optional<Color> optionalColor = cache.stream().filter(c -> c.getValue() == b).findFirst();
                    if (optionalColor.isPresent()) {
                        color = optionalColor.get();
                    } else {
                        Color newColor = new Color(b);
                        cache.add(newColor);
                        color = newColor;
                    }
                    ColorPrinter.print(color);
                }
                System.out.println();
            }
        } else {
            System.err.println("Resolution error");
        }
    }

    public enum Resolution {

        HD(720, 1080), FULL_HD(1080, 1920);

        private final int high;

        private final int width;

        Resolution(int high, int width) {
            this.high = high;
            this.width = width;
        }

        public int getHigh() {
            return high;
        }

        public int getWidth() {
            return width;
        }
    }


}
