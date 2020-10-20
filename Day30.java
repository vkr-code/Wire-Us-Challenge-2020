
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		int n=s.nextInt();
		while(n--!=0){
			int v=s.nextInt();
			Set<Integer> st=new HashSet<>();
			for(int i=0;i<n;i++){
				if(!st.contains(v)){
					System.out.print(v+" ");
					st.add(v);
				}
			}
			System.out.println();
		}

	}
	}

}
