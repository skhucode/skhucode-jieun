package class04;

import java.util.Scanner;

/*최대공약수와 최소공배수

두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
*/
public class Code_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int GCM=1, LCM=1;//최대공약수, 최소공배수
		
	    if(x<y) {
	    	int temp = x;
	    	x=y;
	    	y=temp;
	    }
	    for(int i=1; i<=y; i++) {
	    	if(x%i==0 && y%i==0) {
	    		GCM=i;
	    	}
	    }
		
	    LCM=GCM*(y/GCM)*(x/GCM);
		System.out.println(GCM);
		System.out.println(LCM);
	}

}
