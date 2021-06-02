package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 나는 위대한 슈퍼스타K
public class Greedy2865 {
	
	public static void main (String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt(); //예선 N명
		int M = sc.nextInt(); //M 장르
		int K = sc.nextInt(); //본선 K명
		
		HashMap<Integer, Double> map = new HashMap<Integer,Double>();
		ArrayList<HashMap<Integer,Double>> list = new ArrayList<HashMap<Integer,Double>>();
		
		for (int i =0; i<M; i++) {
			for (int j = 0; j<N; j++) {
				map = new HashMap<Integer,Double>();
				map.put(sc.nextInt(),sc.nextDouble());
				list.add(map);
			}	
		}
		
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(1).get(1));
		
		
		//각 참가자의 최대값 뽑아냄
		Double[] arr = new Double[N];
		
		double max = 0;
		for(int i = 0; i<M;i++) {
		    for(int j=0; j<N; j++) {
			double tmp = list.get(i).get(j+1);
		    // 각참가자의  가장큰 능력치 배열에 저장.
			if(tmp>max)
		       arr[j]=tmp;
			//System.out.println(arr[j]);
		    }
		}
		
	
		//내림차순 정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		double sum = 0;
		for(int i=0; i<K ;i++) {
			//System.out.println("i출력"+i);
			//System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println(Math.round(sum)/1.0);
	
	}
	
}
