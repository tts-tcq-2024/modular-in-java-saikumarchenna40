import java.util.HashMap;
import java.util.Map;

public class ColorCode {
    private static final String[] MAJOR_COLORS = {
            "Blue", "Orange", "Green", "Brown", "Slate"
    };

    private static final String[] MINOR_COLORS = {
            "White", "Red", "Black", "Yellow", "Violet",
            "Gray", "Pink", "Turquoise", "Gold", "Silver"
    };

    public static String getColorPair(int number) {
        if (number < 1 || number > 25) {
            throw new IllegalArgumentException("Number must be between 1 and 25");
        }

        int majorIndex = getMajorIndex(number);
        int minorIndex = getMinorIndex(number);
        return MAJOR_COLORS[majorIndex] + "-" + MINOR_COLORS[minorIndex];
    }

    private static int getMajorIndex(int number) {
        return (number - 1) / 5; // Calculate major color index
    }

    private static int getMinorIndex(int number) {
        return (number - 1) % 5; // Calculate minor color index
    }

    public static String getColorReference() {
        StringBuilder reference = new StringBuilder();
        reference.append("Color Code Reference:\n");
        for (int i = 1; i <= 25; i++) {
            reference.append(String.format("%2d: %s%n", i, getColorPair(i)));
        }
        return reference.toString();
    }
}