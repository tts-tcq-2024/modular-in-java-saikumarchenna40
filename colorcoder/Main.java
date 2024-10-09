import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Define the 25-pair color code mapping
    private static final Map<Integer, String[]> colorCodeMap = new HashMap<>();

    static {
        colorCodeMap.put(1, new String[]{"Blue", "White"});
        colorCodeMap.put(2, new String[]{"Orange", "White"});
        colorCodeMap.put(3, new String[]{"Green", "White"});
        colorCodeMap.put(4, new String[]{"Brown", "White"});
        colorCodeMap.put(5, new String[]{"Slate", "White"});
        colorCodeMap.put(6, new String[]{"Blue", "Orange"});
        colorCodeMap.put(7, new String[]{"Blue", "Green"});
        colorCodeMap.put(8, new String[]{"Blue", "Brown"});
        colorCodeMap.put(9, new String[]{"Blue", "Slate"});
        colorCodeMap.put(10, new String[]{"Orange", "Green"});
        colorCodeMap.put(11, new String[]{"Orange", "Brown"});
        colorCodeMap.put(12, new String[]{"Orange", "Slate"});
        colorCodeMap.put(13, new String[]{"Green", "Brown"});
        colorCodeMap.put(14, new String[]{"Green", "Slate"});
        colorCodeMap.put(15, new String[]{"Brown", "Slate"});
        colorCodeMap.put(16, new String[]{"Blue", "Blue"});
        colorCodeMap.put(17, new String[]{"Orange", "Orange"});
        colorCodeMap.put(18, new String[]{"Green", "Green"});
        colorCodeMap.put(19, new String[]{"Brown", "Brown"});
        colorCodeMap.put(20, new String[]{"Slate", "Slate"});
        colorCodeMap.put(21, new String[]{"Blue", "White"});
        colorCodeMap.put(22, new String[]{"Orange", "White"});
        colorCodeMap.put(23, new String[]{"Green", "White"});
        colorCodeMap.put(24, new String[]{"Brown", "White"});
        colorCodeMap.put(25, new String[]{"Slate", "White"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the pair number (1-25) to get the color code:");
        int pairNumber = scanner.nextInt();
        
        if (pairNumber < 1 || pairNumber > 25) {
            System.out.println("Invalid pair number. Please enter a number between 1 and 25.");
        } else {
            String[] colors = colorCodeMap.get(pairNumber);
            System.out.printf("Pair %d: Major Color - %s, Minor Color - %s%n", pairNumber, colors[0], colors[1]);
        }

        scanner.close();
    }
}
