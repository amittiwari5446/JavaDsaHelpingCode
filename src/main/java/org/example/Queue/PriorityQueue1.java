package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

class Pair{
	int val, freq;

	public Pair(int val, int freq) {
		super();
		this.val = val;
		this.freq = freq;
	}
}

class Triplet{
	int a,b,c;

	public Triplet(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		minHeap.add(4);
		minHeap.add(2);
		minHeap.add(6);
		minHeap.add(1);
		System.out.println(minHeap);
		System.out.println("--------------");
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(8);
		maxHeap.add(2);
		maxHeap.add(5);
		maxHeap.add(1);
		maxHeap.add(7);
		maxHeap.add(3);
		System.out.println(maxHeap);
		System.out.println("--------------");
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
		System.out.println("--------------------");
		
		
		PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b)->b.freq-a.freq);// max heap according to freq
		pq.add(new Pair(2, 5));
		pq.add(new Pair(3, 8));
		pq.add(new Pair(4, 1));
		pq.add(new Pair(5, 10));
		pq.add(new Pair(6, 7));
		
		while(!pq.isEmpty()) {
			Pair x=pq.poll();
			System.out.println(x.val+", "+x.freq);
		}
		
		
		System.out.println("--------------------");
		PriorityQueue<Triplet> pq2=new PriorityQueue<Triplet>((x,y)->x.c-y.c); //min heap according to c
		pq2.add(new Triplet(2,7,9));
		pq2.add(new Triplet(1,3,1));
		pq2.add(new Triplet(7,0,3));
		pq2.add(new Triplet(9,8,6));
		pq2.add(new Triplet(4,1,4));
		while(!pq2.isEmpty()) {
			Triplet x=pq2.poll();
			System.out.println(x.a+", "+x.b+", "+x.c);
		}
		
		
		System.out.println("--------------------");
		PriorityQueue<int[]> pq3=new PriorityQueue<int[]>((a,b)->a[1]-b[1]); //min heap according to 2nd element
		pq3.add(new int[]{2,8,0});
		pq3.add(new int[]{7,9,4});
		pq3.add(new int[]{4,1,8});
		pq3.add(new int[]{1,7,1});
		pq3.add(new int[]{9,3,5});
		while(!pq3.isEmpty()) {
			int[] x=pq3.poll();
			System.out.println(x[0]+", "+x[1]+", "+x[2]);
		}
	}
}
