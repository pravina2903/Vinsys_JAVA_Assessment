public class AverageArray {

    public static void main(String[] args) {
        double[] arr = { 0.5, 2.5, 3.5, 4.5 };
        double sum = 0;

        // Calculating the sum using a simple for loop
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculating the average
        double average = sum / arr.length;
        System.out.println("Average value : " + average);
    }
}
