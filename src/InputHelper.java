import java.util.Scanner;

public class InputHelper {

    public static String getNonZeroLengthString(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            String input = scan.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Please enter a valid string.");
        }
    }

    public static int getInt(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            if (scan.hasNextInt()) {
                int result = scan.nextInt();
                scan.nextLine();
                return result;
            }
            scan.nextLine();
            System.out.println("Please enter a valid value");
        }
    }

    public static double getDouble(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            if (scan.hasNextDouble()) {
                double result = scan.nextDouble();
                scan.nextLine();
                return result;
            }
            scan.nextLine();
            System.out.println("Please enter valid input.");
        }
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        while (true) {
            int value = getInt(scan, prompt + " [" + min + " - " + max + "]:");
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Error: Input is out of range.");
        }
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        while (true) {
            double value = getDouble(scan, prompt + " [" + min + " - " + max + "]:");
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Error: Input is out of range.");
        }
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        while (true) {
            int value = getInt(scan, prompt);
            if (value > 0) {
                return value;
            }
            System.out.println("Error: Input must be greater than 0.");
        }
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            String input = scan.nextLine().trim();

            if (input.equalsIgnoreCase("y")) return true;
            if (input.equalsIgnoreCase("n")) return false;

            System.out.println("Error: You must enter 'Y' or 'N'.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Testing InputHelper ");

        String name = getNonZeroLengthString(in, "Enter your name:");
        System.out.println("Hello, " + name + "!\n");

        int age = getRangedInt(in, "Enter your age", 1, 120);
        System.out.println("Your age is recorded as: " + age + "\n");

        boolean choice = getYNConfirm(in, "Do you like coding?");
        System.out.println("Your choice was: " + choice);
    }
}