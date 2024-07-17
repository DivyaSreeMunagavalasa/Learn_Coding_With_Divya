/*Problem Statement:
Given an array of size n, write a program to check if the given array is
sorted in (ascending / Increasing / Non-decreasing) order or not. If the
array is sorted then return True, Else return False.
Note: Two consecutive equal values are considered to be sorted.
 */
package arrays;
import java.util.Scanner;
public class CheckIfAnArrayIsSorted {
    public static int[] getArray(int n){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static boolean isArraySorted(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] >= arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = s.nextInt();
        int []arr;
        arr = getArray(n);
        boolean isSorted = isArraySorted(arr);
        if(isSorted){
            System.out.println("Array is sorted in ascending order!");
        }
        else{
            System.out.println("Array is not sorted in ascending order!");
        }
    }
}
