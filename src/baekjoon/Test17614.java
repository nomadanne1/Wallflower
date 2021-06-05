package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 369
public class Test17614 {
	public static void main (String[] args) {
		
		// >> 시간초과
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		String a = "";
		for(int i=1; i<=N; i++) {
			a += i+"";
		}
		for(int i=0; i<a.length();i++) {
			if (a.charAt(i)=='3') {
				count ++;
			}else if (a.charAt(i)=='6') {
				count ++;
			}else if (a.charAt(i)=='9') {
				count ++;
			}
		}
		System.out.println(count);
		
		//﻿﻿ ★ 입력받은 자연수에 3,6,9 포함시 true 아닐시 false 반환하는 함수 만들기
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		
		System.out.println(f(N));
	}
	public static boolean f(int N) {
		String a = N+"";
		for(int i=0; i<a.length(); i++ ) {
			if(a.charAt(i)=='3'||a.charAt(i)=='6'||a.charAt(i)=='9') {
				return true;
			}
		}
		return false;	
	}
}
