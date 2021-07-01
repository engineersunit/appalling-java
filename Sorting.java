import java.util.Arrays;

class Sorting {
    public static void main(String[] args) {
        // bubble sort
        int[] input = new int[] { 34, 12, 56, 89, 23, 94, 54, 19, 50, 41 };
        System.out.println("Before sort:: " + Arrays.toString(input));
        long startTime = System.nanoTime();
        for (int i = 0; i < input.length - 1; i++) {
            boolean doBreak = true;
            for (int j = 0; j < input.length - 1 - i; j++) {
                int swap;
                if (input[j] > input[j + 1]) {
                    swap = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = swap;
                    doBreak = false;
                }
            }
            if (doBreak) {
                break;
            }
        }
        System.out.println("Bubble sort:: " + Arrays.toString(input) + " in time:"
                + String.valueOf(System.nanoTime() - startTime));

        // selection sort
        input = new int[] { 34, 12, 56, 89, 23, 94, 54, 19, 50, 41 };
        int min = 0;
        startTime = System.nanoTime();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[min] > input[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int swap;
                swap = input[i];
                input[i] = input[min];
                input[min] = swap;
            }
        }
        System.out.println("Selection sort:: " + Arrays.toString(input) + " in time:"
                + String.valueOf(System.nanoTime() - startTime));
        
    }
}