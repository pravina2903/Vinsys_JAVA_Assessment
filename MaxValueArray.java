public class MaxValueArray {
    public static void main(String[] args) {
        int[] arr = {8, 22, 15, 30, 10};
        int max = arr[0];

        // Finding the maximum value using a simple for loop
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value is : " + max);
    }
}

