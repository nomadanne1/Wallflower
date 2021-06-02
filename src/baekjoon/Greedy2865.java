package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// ���� ������ ���۽�ŸK
public class Greedy2865 {
	
	public static void main (String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt(); //���� N��
		int M = sc.nextInt(); //M �帣
		int K = sc.nextInt(); //���� K��
		
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
		
		
		//�� �������� �ִ밪 �̾Ƴ�
		Double[] arr = new Double[N];
		
		double max = 0;
		for(int i = 0; i<M;i++) {
		    for(int j=0; j<N; j++) {
			double tmp = list.get(i).get(j+1);
		    // ����������  ����ū �ɷ�ġ �迭�� ����.
			if(tmp>max)
		       arr[j]=tmp;
			//System.out.println(arr[j]);
		    }
		}
		
	
		//�������� ����
		Arrays.sort(arr,Comparator.reverseOrder());
		
		double sum = 0;
		for(int i=0; i<K ;i++) {
			//System.out.println("i���"+i);
			//System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println(Math.round(sum)/1.0);
	
	}
	
}
