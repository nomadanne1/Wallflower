package baekjoon;

import java.util.Scanner;

// �ּҰ����
public class Test1934 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = 1;
		for(int i=0; i<N; i++) { // �Է¹��� N��ŭ �ݺ�
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 1 ) {
				System.out.println(b);
			}else if (b ==1) {
				System.out.println(a);
			}else {
				for(int j=2; j<=a; j++) {
					if(a%j==0 && b%j==0) {
						a /=j;
						b /=j;
						result *= j;
						j--; // �ڶ� ���������� Ȯ���ϱ����ؼ�
					}
				}
				result= result*a*b;
				System.out.println(result);
				result = 1; //�ʱ�ȭ
			}
		}
	}
}
