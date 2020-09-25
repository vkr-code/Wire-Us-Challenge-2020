
import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			HashMap<String,Integer> map=new HashMap<>();
			for(int i=0;i<n;i++){
				String str=s.next();
				if(!map.containsKey(str)){
					map.put(str, 1);
				}else{
					int v=map.get(str);
					v+=1;
					map.put(str, v);
				}
			}
			int q=s.nextInt();
			for(int i=0;i<q;i++){
				String str=s.next();
				System.out.println(map.get(str)==null?0:map.get(str));
			}
		}
	}

}
