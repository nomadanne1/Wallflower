package baekjoon;

import java.util.Scanner;

//소인수분해
public class Test11653 {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 소수 구하는 방법
		// 소수* 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수.
//		int count = 0;
//		for (int i=2; i<=N ;i++ ) { // 1은 소수가 아니기 때문에 2부터 시작한다.
//			for (int j=2; j<=i; j++) {
//				if(i%j == 0) {
//					count++; // count가 2이상이면 소수가 아니다.
//				}	
//			}
//			if(count == 1) {
//				System.out.println("소수"+i);
//		
//			}
//			count=0;// i+1 될때 count 초기화
//		}
		
		// 입력받은 숫자 소인수 분해 하는 방법
		for(int i = 2; i <= N; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N /= i; // N/i=N
		 	}
		}
	}
}
