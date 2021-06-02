package baekjoon;

import java.util.Scanner;

public class Test2747 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		// 0 1 1 2 3 5 8 ...
		
		long fibo1 = 0;
		long fibo2 = 1;
		long fibo3 = 1;
//		int fibo1 = 0;
//		int fibo2 = 1;
//		int fibo3 = 1;
	
		for (int i=2; i<=input; i++) {
			fibo3 = fibo1 + fibo2; 
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
		if(input == 0) {
			System.out.println(fibo1);
		}else if(input == 1){
			System.out.println(fibo2);
		}else {
			System.out.println(fibo3);			
		}

	}
}
//  재귀함수 사용 -> 시간초과
//	public static void main (String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		System.out.println(Fibonacci(input));
//	}
//	
//	// 0 1 1 2 3 5 8 ...
//	public static int Fibonacci (int input) {
//		if (input == 0) { return 0;	}
//		if (input == 1) { return 1;	}
//		
//		int result = Fibonacci(input-1) + Fibonacci(input-2);
//		
//		return result;
//	}

