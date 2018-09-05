import java.util.Scanner;

public class Code_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int A=0, B=0;
		
		Scanner scan = new Scanner(System.in);
		
		i=scan.nextInt();
		for(int j=0; j<i; ++j) {
			A=scan.nextInt();
	        B=scan.nextInt();
	        System.out.println(A+B);
		}
	}

}
