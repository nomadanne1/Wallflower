package baekjoon;

import java.util.Scanner;

//¼³ÅÁ¹è´Þ
public class greedy2839 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N%5 == 0) {
			System.out.println(N/5);
			return;
		}
		
		int a = N/3;
		int b = N/5;
		
		for(int i = b; i>=0; i--) {
			for(int j = 0; j<=a; j++) {

				if (5*i+3*j == N) {
					System.out.println(i+j);
					return;
				}
			}
		}
		System.out.println(-1);
	}

}
