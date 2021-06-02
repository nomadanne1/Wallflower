package baekjoon;


import java.util.Arrays;
import java.util.Scanner;

// ATM 
public class Greedy11399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(N);
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//배열 -오름차순 정렬
		Arrays.sort(arr);
		
		int minimum = 0;
		
		for(int i = 0; i<N; i++) {
			for (int j=0; j<i+1; j++) {
				minimum += arr[j]; 
				//System.out.println("i값:"+i+"/j값:"+j);
				//System.out.println(minimum);
			}
			//System.out.println("-------------");
		}
		System.out.println(minimum);
	
	}

}