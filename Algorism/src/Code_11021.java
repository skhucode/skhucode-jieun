import java.util.Scanner;

//A+B-7
public class Code_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int T=0; 
		int A=0, B=0;
		T = s.nextInt();
		for(int i=1; i<=T;i++) {
			A=s.nextInt();
			B=s.nextInt();
			System.out.printf( "Case #%d: %d\n",i, A+B);
		}
		
	}

}
