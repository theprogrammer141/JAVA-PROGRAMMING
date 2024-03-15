import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of array:");
        size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element{%d}:", i);
            array[i] = input.nextInt();
        }

        for (int j : array) {
            System.out.println(j);
        }

        int min = array[0];
        int min_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                min_index = i;
            }
        }

        int max = array[0];
        int max_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                max_index = i;
            }
        }

        int sum = 0;
        double average;

        for (int j : array) {
            sum += j;
        }
        average = (double) sum / size;

        System.out.println("Min element: " + min);
        System.out.println("Index: " + min_index);

        System.out.println("Max element: " + max);
        System.out.println("Index: " + max_index);

        System.out.println("Average: " + average);
    }
}
