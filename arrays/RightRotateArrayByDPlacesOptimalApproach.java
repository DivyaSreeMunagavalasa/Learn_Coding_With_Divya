package arrays;

import java.util.Scanner;

public class RightRotateArrayByDPlacesOptimalApproach {
    public static void rotateArrayRightByDPlaces(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        reverse(arr,0,n-1);
        reverse(arr, 0 , d-1);
        reverse(arr,d,n-1);
    }
    public static void reverse (int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of places to rotate the array to the right: ");
        int d = s.nextInt();
        System.out.println("Enter the number of elements in an array: ");
        int n = s.nextInt();
        int [] arr = CreateAndPrintArray.getArray(n);
        System.out.print("The original array is: ");
        CreateAndPrintArray.printArray(arr);
        rotateArrayRightByDPlaces(arr,d);
        System.out.printf("The array after rotating right by %d places is: ", d);
        CreateAndPrintArray.printArray(arr);
    }
}
