package class01;
import java.util.*;
/*
동전0

문제
 

준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만드려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.




입력
 

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)




출력
 

첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.




예제 입력 1 복사 
 10 4200
1
5
10
50
100
500
1000
5000
10000
50000





예제 출력 1 복사 
 6







예제 입력 2 복사 
 10 4790
1
5
10
50
100
500
1000
5000
10000
50000





예제 출력 2 복사 
 12







 



출처
 */
public class Code_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//동전의 종류는 n개
		int n = sc.nextInt();
		//가치의 합 즉 합계
		int k = sc.nextInt();
		//동전 종류의 단위값을 배열로써 각 배열의 인덱스에 순차적으로 입려
		int[] a = new int[n];
		for( int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		//동전 개수의 최소값
		int ans = 0;
		
		for(int i=n-1; i>=0; i--) {
			ans += k/a[i];
			k %= a[i];
		}
		System.out.println(ans);
	}

}
