package baekjoon;

import java.util.Scanner;

// ���丮��
public class Test10872 {
	public static void main(String[] args) {
		// �ݺ���
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		int fac = 1;
//		for (int i=1; i<=N; i++) {
//			fac *= i;
//		}
//
//		System.out.println(fac);	
		
		// ����Լ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fac(N));
	}
	
	public static int fac(int N) {
		if (N <= 1) {
			return 1;
		}
		return fac(N-1)*N;
		
	}
}
