import java.util.Scanner;

public class Code_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int A=0;int B=0;

		while(scan.hasNextInt()) {
			A = scan.nextInt();
			B = scan.nextInt();
			if((A==0)&&(B==0))
				break;
			System.out.println(A+B);
		}
	}

}
