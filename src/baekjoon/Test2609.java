package baekjoon;

import java.util.Scanner;

// 최대공약수, 최소공배수 구하기
public class Test2609 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 1;
		if (a == 1){
            System.out.println(1);
            System.out.println(b);
        }else if (b == 1){
            System.out.println(1);
            System.out.println(a);      
        }else{
            for (int i=2; i<=a; i++) {
                if(a%i == 0 && b%i==0) {
				    a /= i;
				    b /= i;
				    result *= i;
				    i --;
		    	}
		    }
		    System.out.println(result);
		    System.out.println(result*a*b);           
        }
	}

}
