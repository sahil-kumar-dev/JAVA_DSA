// import java.util.*;

public class array_1 {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static int largestNum(int nums[]){

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }

        return largest;

    }

    public static void main(String[] args) {
        int marks[] = new int[50];
        int number[] = {1,2,3,4,5};
        
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }

        // Passing array as argument

        update(marks);

        // Linear Search in array

        int numbers[] = {1,2,3,4,5,6,7,9,10};

        int index = linearSearch(numbers, 10); // Corrected the method call

        System.out.println(index);

        // Largest Number

        int nums[] = {1,2,3,4,10,11,14};

        int largest = largestNum(nums);

        System.out.println(largest);

    }
}