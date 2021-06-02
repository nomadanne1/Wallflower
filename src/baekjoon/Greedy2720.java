package baekjoon;

import java.util.Scanner;

//ºº≈πº“ ªÁ¿Â µø«ı
public class Greedy2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i <N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;
		
		for (int i = 0; i<N; i++) {
			int qq =arr[i]/q;
			int qqq = arr[i]%q;
			int dd = qqq/d;
			int ddd = qqq%d;
			int nn = ddd/n;
			int nnn = ddd%n;
			int pp = nnn/p;
			
			System.out.println(qq+" "+dd+" "+nn+" "+pp);
		}

	}
}
