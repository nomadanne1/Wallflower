package baekjoon;

import java.util.Scanner;

//���μ�����
public class Test11653 {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// �Ҽ� ���ϴ� ���
		// �Ҽ�* 1���� ū �ڿ��� �� 1�� �ڱ� �ڽŸ��� ����� ������ ��.
//		int count = 0;
//		for (int i=2; i<=N ;i++ ) { // 1�� �Ҽ��� �ƴϱ� ������ 2���� �����Ѵ�.
//			for (int j=2; j<=i; j++) {
//				if(i%j == 0) {
//					count++; // count�� 2�̻��̸� �Ҽ��� �ƴϴ�.
//				}	
//			}
//			if(count == 1) {
//				System.out.println("�Ҽ�"+i);
//		
//			}
//			count=0;// i+1 �ɶ� count �ʱ�ȭ
//		}
		
		// �Է¹��� ���� ���μ� ���� �ϴ� ���
		for(int i = 2; i <= N; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N /= i; // N/i=N
		 	}
		}
	}
}
