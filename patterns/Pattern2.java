package patterns;
import java.util.Scanner;
/* For n = 5
The square pattern is:
  11111
  22222
  33333
  44444
  55555
*/
public class Pattern2 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			//For square patterns, the number of rows and columns will be same.
			System.out.print("Enter the number of rows and columns:");
			int n = s.nextInt();	
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
		
	}

}
