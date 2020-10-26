
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Day34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			HashMap<Integer, Integer> map=new HashMap<>();
			for(int i=0;i<n;i++){
				int v=s.nextInt();
				if(!map.containsKey(v)){
					map.put(v, 1);
				}else{
					int r=map.get(v);
					r+=1;
					map.put(v, r);
				}
			}
				Set<Integer> keys=map.keySet();
				ArrayList<Integer> list=new ArrayList<>(keys);
				Collections.sort(list,Collections.reverseOrder());
				int max=-1;
				int c=2;
				for(int i=0;i<list.size();i++){
					int v=map.get(list.get(i));
					if(v>=4 && c==2){
						max=list.get(i)*list.get(i);
						c-=2;
					}else if(v>=2){
						max=Math.abs(max*list.get(i));
						c-=1;
					}
					if(c==0) break;
				}
				System.out.println(max);
		}
	}

}
