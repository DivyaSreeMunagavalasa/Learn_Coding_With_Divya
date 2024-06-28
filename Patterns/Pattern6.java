package patterns;
import java.util.Scanner;
/* For n = 5
The triangular pattern is:
  1
  12
  123
  1234
  12345
*/
public class Pattern6 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			//Enter the number of rows
			System.out.print("Enter the number of rows :");
			int n = s.nextInt();	
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

}
