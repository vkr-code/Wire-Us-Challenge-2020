
import java.util.Scanner;
import java.util.Stack;

public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			int q=s.nextInt();
			Stack<Integer> st=new Stack<>();
			for(int i=0;i<n;i++){
				int v=s.nextInt();
				if(!st.contains(v)) st.push(v);
			}
			for(int i=0;i<q;i++){
				int v1=s.nextInt();
				int v2=s.nextInt();
				if(v1==1){
					for(int j=0;j<v2;j++){
						int v=s.nextInt();
						if(!st.contains(v)) st.push(v);
					}
				}else{
					for(int j=0;j<v2;j++){
						st.pop();
					}
				}
			}
			while(!st.isEmpty()){
				System.out.print(st.pop()+" ");
			}
			System.out.println();
		}
	}

}
