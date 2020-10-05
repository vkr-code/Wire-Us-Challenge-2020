import java.util.ArrayList;
import java.util.Scanner;

public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			ArrayList<ArrayList<Integer>> list=new ArrayList<>();
			int n=s.nextInt();
			ArrayList<Integer> l=new ArrayList<>();
			for(int i=0;i<n;i++){
				int v=s.nextInt();
				l.add(v);
			}
			list.add(l);
			for(int i=0;i<n-1;i++){
				ArrayList<Integer> r=list.get(i);
				ArrayList<Integer> k=new ArrayList<>();
				for(int j=0;j+1<r.size();j+=1){
					k.add(r.get(j)+r.get(j+1));
				}
				list.add(k);
			}
			for(int i=n-1;i>=0;i--){
				System.out.println(list.get(i));
			}
		}
	}

}
