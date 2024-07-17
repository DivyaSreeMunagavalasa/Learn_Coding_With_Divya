/* Problem Statement:
Given an array, we have to find the largest element in an array.
 */
package arrays;
import java.util.Scanner;
public class LargestElementInAnArray {
    public static int getLargestElement(int [] arr){
        int largest = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = s.nextInt();
        // Use the CreateArray class to get the array
        int [] arr = CreateArray.getArray(n);
        int largest = getLargestElement(arr);
        System.out.println("The largest element in an array is: " + largest);
    }
}
