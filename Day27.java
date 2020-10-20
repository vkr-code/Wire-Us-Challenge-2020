
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Day27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<String,Integer> map=new HashMap<>();
		ArrayList<String> l=new ArrayList<>();
		while(n--!=0){
			String str=s.next();
			if(!map.containsKey(str)){
				map.put(str, 1);
			}else{
				int v=map.get(str);
				v+=1;
				map.put(str, v);
			}
		}
		Set<String> keys=map.keySet();
		for(String key:keys){
			l.add(key);
		}
		Collections.sort(l);
		for(String str:l){
			System.out.println(str+" "+map.get(str));
		}
	}

}
