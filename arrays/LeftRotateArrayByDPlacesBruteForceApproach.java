package arrays;
import java.util.Scanner;

import static arrays.CreateAndPrintArray.*;

public class LeftRotateArrayByDPlacesBruteForceApproach {
    // This is the Brute Force Approach to rotate the array to left by d places
    public static void rotateArrayLeftByDPlaces(int [] arr, int d){
        int n = arr.length;
        d = d % n;
        int [] temp = new int[d];
        for(int i = 0 ; i < d ; i++){
            temp[i] = arr[i];
        }
        for(int i = d ; i < n ; i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d ; i < n ; i++){
            arr[i] = temp[i-(n-d)];
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of places to rotate the array to left : ");
        int d = s.nextInt();
        System.out.println("Enter the number of elements in an array : ");
        int n = s.nextInt();
        int [] arr = CreateAndPrintArray.getArray(n);
        System.out.println("The original array is: ");
        CreateAndPrintArray.printArray(arr);
        rotateArrayLeftByDPlaces(arr,d);
        System.out.println("The left rotated array by one place is: ");
        CreateAndPrintArray.printArray(arr);
    }
}
