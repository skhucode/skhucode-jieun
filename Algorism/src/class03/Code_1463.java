package class03;

import java.util.*;
/*
1로 만들기 

문제
 

정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
1.X가 3으로 나누어 떨어지면, 3으로 나눈다.
2.X가 2로 나누어 떨어지면, 2로 나눈다.
3.1을 뺀다.

정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.


입력
 

첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 자연수 N이 주어진다.



출력
 

첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.



예제 입력 1 복사 
 2


예제 출력 1 복사 
 1



예제 입력 2 복사 
 10


예제 출력 2 복사 
 3
*/

public class Code_1463 {
	 public static int[] d;

	    public static int go(int n) {

	        if (n == 1) {

	            return 0;

	        }

	        if (d[n] > 0) {

	            return d[n];

	        }

	        d[n] = go(n-1) + 1;

	        if (n%2 == 0) {

	            int temp = go(n/2)+1;

	            if (d[n] > temp) {

	                d[n] = temp;

	            }

	        }

	        if (n%3 == 0) {

	            int temp = go(n/3)+1;

	            if (d[n] > temp) {

	                d[n] = temp;

	            }

	        }

	        return d[n];

	    }

	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        d = new int[n+1];

	        System.out.println(go(n));

	    }

	}