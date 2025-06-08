import java.util.Arrays;
import java.util.Random;


public class StatisticalArrayAnalysis {

	public static void main(String[] args) {
		
		// Generating Data of an integer array of size 25 in a range of 1-250.
		int[] data = generateRandomArray(25, 1, 250);
		
		// Display data in 5-column format
		System.out.println("Array Contents:");
        printDataInColumns(data, 5);	
		
		// Compute extremal values and their positions
		int largest     = findLargest(data);
        int smallest    = findSmallest(data);
        int posLargest  = findPosition(data, largest);
        int posSmallest = findPosition(data, smallest);
			
		System.out.println("");
		System.out.printf("Largest:  %3d at index %d%n", largest, posLargest);
        System.out.printf("Smallest: %3d at index %d%n%n", smallest, posSmallest);

        // Compute 2nd largest / smallest
        int[] second = findSecondLargestSmallest(data, largest, smallest);
        System.out.println("");
        System.out.printf("2nd Largest:  %3d at index %d%n", second[0], second[1]);
        System.out.printf("2nd Smallest: %3d at index %d%n%n", second[2], second[3]);

        // Compute 5th largest / smallest
        int[] fifth = findNthLargestSmallest(data, 5);
        System.out.println("");
        System.out.printf("5th Largest:  %3d at index %d%n", fifth[0], fifth[1]);
        System.out.printf("5th Smallest: %3d at index %d%n%n", fifth[2], fifth[3]);

        // Compute median
        int median    = findMedian(data);
        int posMedian = findPosition(data, median);
        System.out.println("");
        System.out.printf("Median: %3d at index %d%n", median, posMedian);

    }

    /** Generates an array of given size with random ints in [min, max]. */
    private static int[] generateRandomArray(int size, int min, int max) {
        Random gen = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = gen.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    /** Prints array elements in columns of given width. */
    private static void printDataInColumns(int[] data, int columns) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%6d", data[i]);
            if ((i + 1) % columns == 0) System.out.println();
        }
        System.out.println();
    }

    /** Finds the largest value in the array. */
    private static int findLargest(int[] data) {
        int max = Integer.MIN_VALUE;
        for (int v : data) {
            if (v > max) max = v;
        }
        return max;
    }

    /** Finds the smallest value in the array. */
    private static int findSmallest(int[] data) {
        int min = Integer.MAX_VALUE;
        for (int v : data) {
            if (v < min) min = v;
        }
        return min;
    }

    /**
     * Finds the second largest and second smallest values & positions.
     * @return [2nd-largest, index], [2nd-smallest, index]
     */
    private static int[] findSecondLargestSmallest(int[] data, int largest, int smallest) {
        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;
        int pos2Max = -1, pos2Min = -1;
        for (int i = 0; i < data.length; i++) {
            int v = data[i];
            if (v > secondMax && v < largest) {
                secondMax = v;
                pos2Max = i;
            }
            if (v < secondMin && v > smallest) {
                secondMin = v;
                pos2Min = i;
            }
        }
        return new int[]{secondMax, pos2Max, secondMin, pos2Min};
    }

    /**
     * Finds the nth largest and nth smallest values & positions by sorting.
     * @param n the rank (e.g., 5 for 5th largest/smallest)
     * @return [nth-largest, index], [nth-smallest, index]
     */
    private static int[] findNthLargestSmallest(int[] data, int n) {
        int[] copy = data.clone();
        Arrays.sort(copy);
        int nthSmall = copy[n - 1];
        int nthLarge = copy[copy.length - n];
        int posSmall = findPosition(data, nthSmall);
        int posLarge = findPosition(data, nthLarge);
        return new int[]{nthLarge, posLarge, nthSmall, posSmall};
    }

    /** Finds the median (middle element) after sorting array. */
    private static int findMedian(int[] data) {
        int[] copy = data.clone();
        Arrays.sort(copy);
        return copy[copy.length / 2];
    }

    /** Returns the index of the first occurrence of value in data (or -1). */
    private static int findPosition(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) return i;
        }
        return -1;
    }
}