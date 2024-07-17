/* Problem Statement
Given an array,return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.
 */
package arrays;

import java.util.Scanner;

public class CheckRotatedSortedArray {
    public static int[] getArray(int n){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static boolean checkSortedRotatedArray(int [] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>arr[(i+1) % n]){
                count++;
            }
        }
        return count<=1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = s.nextInt();
        int [] arr ;
        arr = getArray(n);
        boolean isSortedRotatedArray = checkSortedRotatedArray(arr);
        if(isSortedRotatedArray){
            System.out.println("The array is sorted and rotated");
        }
        else{
            System.out.println("The array is not sorted and rotated");
        }
    }
}
