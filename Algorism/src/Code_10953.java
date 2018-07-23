import java.util.Scanner;

public class Code_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
				
		int A=0;int B=0;
		int T=0;
		T = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<T; i++) {
			//arr 배열에 값을 입력받을 때 ,을 기준으로 다,가 나오면 다음 칸에 값을 삽입하여 저장한다.
			String arr[] = scan.nextLine().split(",");
			//값을 문자로 받았기 때문에 integer로 다시 변환하여 계산한 후 int값으로 출력한다.
			System.out.printf("%d\n",Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			
			
		}
	}

}
