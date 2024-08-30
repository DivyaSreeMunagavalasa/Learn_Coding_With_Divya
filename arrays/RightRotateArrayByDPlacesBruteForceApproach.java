package arrays;

import java.util.Scanner;

public class RightRotateArrayByDPlacesBruteForceApproach {
    // This is the Brute Force Approach to rotate the array to right by d places
    public static void rotateArrayRightByDPlaces(int [] nums, int k){
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];
        // Copy the last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        // Shift the rest of the array to the right by k positions
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        // Copy the elements from temp to the beginning of the array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of places to rotate the array to right : ");
        int d = s.nextInt();
        System.out.println("Enter the number of elements in an array : ");
        int n = s.nextInt();
        int [] arr = CreateAndPrintArray.getArray(n);
        System.out.println("The original array is: ");
        CreateAndPrintArray.printArray(arr);
        rotateArrayRightByDPlaces(arr,d);
        System.out.println("The left rotated array by one place is: ");
        CreateAndPrintArray.printArray(arr);
    }
}
