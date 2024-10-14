import java.util.Scanner;

public class ColorCodeMapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-25) to get the corresponding color code pair, or type 'ref' for the reference manual:");

try {
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("ref")) {
            System.out.println(ColorCode.getColorReference());
        } else {
            try {
                int inputNumber = Integer.parseInt(input);
                String colorPair = ColorCode.getColorPair(inputNumber);
                System.out.println("Color code for " + inputNumber + " is: " + colorPair);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 25 or 'ref' for the manual.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
} catch(Exception exception) {
exception.printStackTrace();
}

        scanner.close();
    	}
}
