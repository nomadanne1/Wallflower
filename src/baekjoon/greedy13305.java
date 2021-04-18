package baekjoon;

import java.util.Scanner;

//¡÷¿Øº“
public class greedy13305 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int[] km = new int[N-1];
		for (int i=0; i<N-1; i++) {
			km[i]= sc.nextInt();
		}
		
		int[] won = new int[N];
		for (int i=0; i<N ; i++) {
			won[i] = sc.nextInt();
		}


		long sum = 0;
		long minWon = won[0];
		
		for(int i=0; i<N-1 ; i++) {
			
			if(minWon > won[i]) {
				minWon = won[i];
			}
			sum += minWon*km[i];			
		}
		
		System.out.println(sum);	
	}
}
