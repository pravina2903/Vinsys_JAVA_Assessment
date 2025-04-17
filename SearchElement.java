public class SearchElement {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 12, 9 };
        int target = 3;

        // Searching for the target element using a simple for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index : " + i);
                return; // Exits the program once the element is found
            }
        }

        // If the element is not found, this message will be printed
        System.out.println("Element " + target + " not found in the array...");
    }
}
