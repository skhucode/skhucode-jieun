package class01;
import java.util.*;
/*
30 


문제
 

어느날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.

미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라. (그 수가 존재한다면)




입력
 	

N을 입력받는다. N는 최대 10^5개의 숫자로 구성되어 있다.




출력
 

미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.






예제 입력 1 복사 
 30





예제 출력 1 복사 
 30







예제 입력 2 복사 
 102





예제 출력 2 복사 
 210







예제 입력 3 복사 
 2931





예제 출력 3 복사 
 -1
*/

public class Code_10610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char배열 s에 각 인덱스에 값을 대입한다.
		char[] s = sc.nextLine().toCharArray();
		//총 합계를 sum이라고 정의한다.
		int sum =0;
		for(int i=0; i<s.length; i++) {
			sum += s[i] - '0';
		}
		//배열 s를 정렬한다.
		Arrays.sort(s);
		//수의 첫번째 인덱스가 0이고 3으로 나눴을때 떨어진다면 출력한다.
		if(s[0] == '0' && sum%3 == 0) {
			for(int i=s.length-1; i>=0; i--) {
				System.out.println(s[i]);
			}
			System.out.println();
		}else {
			System.out.println(-1);
		}
	}

}
