package baekjoon;


import java.util.Arrays;
import java.util.Scanner;

//국회의원 선거
public class Greedy1417 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //후보수
		
		int dasom = sc.nextInt(); //다솜 득표수
	
		int[] arr = new int[N-1]; //다솜 제외 득표수
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		
		int min = 0;
		
		// 후보 1명일때
		if(N== 1) { 
			System.out.println(0);
			return;
		}
		
		//
		while(true) {
		Arrays.sort(arr); //후보 오름차순정렬
		boolean election = true;	
			if (dasom<=arr[arr.length-1]) { //-> 다솜Lose.
				dasom++;
				arr[arr.length-1]--;
				min++;
				election = false;
				
			}
			if(election) {
				break;
			}
		}
		System.out.println(min);	
	}
}
