package baekjoon;


import java.util.Arrays;
import java.util.Scanner;

//��ȸ�ǿ� ����
public class Greedy1417 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //�ĺ���
		
		int dasom = sc.nextInt(); //�ټ� ��ǥ��
	
		int[] arr = new int[N-1]; //�ټ� ���� ��ǥ��
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		
		int min = 0;
		
		// �ĺ� 1���϶�
		if(N== 1) { 
			System.out.println(0);
			return;
		}
		
		//
		while(true) {
		Arrays.sort(arr); //�ĺ� ������������
		boolean election = true;	
			if (dasom<=arr[arr.length-1]) { //-> �ټ�Lose.
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
