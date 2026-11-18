import java.util.Random;
import java.util.Scanner;

class Lab9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        int valCount = 0;
        int totalVal = 0;
        int maxVal = 0;
        int minVal = 0;
        boolean found = false;


        Random rand = new Random();
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        
        int sum = 0;
        int max = dataPoints[0];
        int min = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("\nResults ");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("\n--- Linear Search ---");

        int userInt = InputHelper.getRangedInt(scan, "Enter an integer value between 1 and 100 to count", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInt) {
                valCount++;
            }
        }
        System.out.println("The value " + userInt + " was found " + valCount + " time(s) in the array.");
        int findFirstTarget = InputHelper.getRangedInt(scan, "\nEnter another integer value between 1 and 100 to find its first position", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findFirstTarget) {
                System.out.println("The value " + findFirstTarget + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + findFirstTarget + " was not found in the array.");
        }
    }
}






