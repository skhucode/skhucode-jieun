import java.util.Scanner;
// 숫자의 합
public class Code_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		
		int num = s.nextInt();
		s.nextLine();
		
		//s.nextLine()으로 받은 문자열을 배열 arr에 split메소드를 이용해 하나씩 잘라서  배열로 입력 받는다.
		String[] arr = s.nextLine().split("");
		int sum =0;
		for(int i=0; i<num; ++i) {
			//배열 arr은 String 값이므로 그 값을 sum에다 더할 떄는 Integer 타입으로 받아서 합해야한다.
			sum+=Integer.parseInt(arr[i]);	
		}
		System.out.printf("%d",sum);
	}

}
