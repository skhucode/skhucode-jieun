package class04;

import java.util.Scanner;

/*최소공배수
두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
*/
public class Code_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int GCM=1,LCM=1;
		int[] arr = new  int[3];
		for(int i=0; i<num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A<B) {
				int temp = A;
				A=B;
				B=temp;
			}
		    for(int j=1; j<=B; j++) {
		    	if(B%j==0 && B%j==0) {
		    		GCM=j;
		    	}
		    }
		    LCM=GCM*(A/GCM)*(B/GCM);
			arr[i] = LCM;
		}
		for(int k=0; k<num; k++) {
			System.out.println(arr[k]);
		}
	}

}
