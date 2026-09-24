package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {
	public static void main(String[] args) {
		//Adjacency list or Hash Table
		Map<Integer,List<Integer>> adj=new HashMap<>();
		int[][] arr= {{0,1},{1,2},{1,0},{0,2},{1,3},{2,3},{3,2}};
		for(int[] row:arr) {
			int x=row[0];
			int y=row[1];
			
			adj.computeIfAbsent(x,k->new ArrayList<>()).add(y);
		}
		for(Entry<Integer, List<Integer>> table:adj.entrySet()) {
			Integer x=table.getKey();
			List<Integer> list=table.getValue();
			System.out.print(x);
			System.out.print(" -> ");
			System.out.println(list);
		}
	}
}
