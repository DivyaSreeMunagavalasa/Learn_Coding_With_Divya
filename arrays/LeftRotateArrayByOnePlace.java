package arrays;
import java.util.Scanner;

public class LeftRotateArrayByOnePlace {
    public static void rotateArrayByOnePlaceInLeft(int [] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = s.nextInt();
        if(n == 0){
            System.out.println("Enter positive value for the number of elements in array");
            return;
        }
        int [] arr = CreateAndPrintArray.getArray(n);
        System.out.println("The original array is: ");
        CreateAndPrintArray.printArray(arr);
        rotateArrayByOnePlaceInLeft(arr);
        System.out.println("The left rotated array by one place is: ");
        CreateAndPrintArray.printArray(arr);
    }
}
