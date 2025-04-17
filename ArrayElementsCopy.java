public class ArrayElementsCopy {

    public static void main(String[] args) {
        int[] original = { 5, 10, 15, 20 };
        int[] copy = new int[original.length];

        // Copying elements from one array to another
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Printing the copied array
        System.out.print("Copied Array is : ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
