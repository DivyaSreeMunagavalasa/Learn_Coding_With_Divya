package arrays;
import java.util.Scanner;
public class RemoveDuplicatesInPlaceFromSortedArray {
    public static int getCountOfUniqueElementsInArray(int [] arr){
        if (arr.length == 0) {
            System.out.println("The array is empty!");
            return 0; // Edge case: empty array
        }
        int i = 0;
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = s.nextInt();
        int [] arr = CreateArray.getArray(n);
        int countOfUniqueElementsInArray = getCountOfUniqueElementsInArray(arr);
        System.out.println("The count of unique elements in an array is: " + countOfUniqueElementsInArray);
        System.out.print("The array without duplicates is: ");
        for (int i = 0; i < countOfUniqueElementsInArray; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
