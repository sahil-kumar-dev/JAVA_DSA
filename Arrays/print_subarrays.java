public class print_subarrays {

    // Method to print all subarrays of a given array
    public static void printSubarrays(int numbers[]) {
        int ts = 0; // Initialize total subarrays count
        // Outer loop to select starting point of subarray
        for (int i = 0; i < numbers.length; i++) {
            int start = i; // Starting index of subarray
            // Inner loop to select ending point of subarray
            for (int j = i; j < numbers.length; j++) {
                int end = j; // Ending index of subarray
                // Loop to print elements of the subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++; // Increment total subarrays count
                System.out.println(); // Newline after each subarray
            }
            System.out.println(); // Newline after each starting point
        }
        System.out.println("Total subarrays = " + ts); // Print total subarrays count
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10 }; // Example array

        printSubarrays(arr); // Call the method to print subarrays

    }
}
