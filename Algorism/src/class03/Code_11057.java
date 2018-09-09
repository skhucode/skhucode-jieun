package class03;
import java.util.*;

import java.math.*;
/*
오르막 수 





시간 제한

메모리 제한

제출

정답

맞은 사람

정답 비율


1 초 256 MB 10827 5229 4149 47.982% 





문제
 

오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이 때, 인접한 수가 같아도 오름차순으로 친다.

예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.

수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.




입력
 

첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.




출력
 

첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.






예제 입력 1 복사 
 1





예제 출력 1 복사 
 10







예제 입력 2 복사 
 2





예제 출력 2 복사 
 55







예제 입력 3 복사 
 3





예제 출력 3 복사 
 220

*/
public class Code_11057 {
	  public static long mod = 10007;

	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        long[][] d = new long[n+1][10];

	        for (int i=0; i<=9; i++) {

	            d[1][i] = 1;

	        }

	        for (int i=2; i<=n; i++) {

	            for (int j=0; j<=9; j++) {

	                for (int k=0; k<=j; k++) {

	                    d[i][j] += d[i-1][k];

	                    d[i][j] %= mod;

	                }

	            }

	        }

	        long ans = 0;

	        for (int i=0; i<10; i++) {

	            ans += d[n][i];

	        }

	        ans %= mod;

	        System.out.println(ans);

	    }

}
