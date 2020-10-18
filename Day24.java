
import java.util.HashMap;
import java.util.Scanner;

public class Day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			String[] fname=new String[n];
			String[] lname=new String[n];
			HashMap<String, Integer> map=new HashMap<>();
			for(int i=0;i<n;i++){
				String a=s.next();
				String b=s.next();
				fname[i]=a;
				lname[i]=b;
				if(!map.containsKey(a)){
					map.put(a, 1);
				}else{
					map.put(a, 2);
				}
			}
			for(int i=0;i<n;i++){
				int v=map.get(fname[i]);
				if(v==1){
					System.out.println(fname[i]);
				}else{
					System.out.println(fname[i]+" "+lname[i]);
				}
			}
			System.out.println();
		}
	}

}
