
import java.util.Scanner;
import java.util.Stack;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			Stack<Integer> st=new Stack<>();
			for(int i=0;i<n;i++){
				st.push(s.nextInt());
			}
			reverse(st);
			while(!st.isEmpty()){
				System.out.print(st.pop()+" ");
			}
			System.out.println();
		}
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) return;
		int v=st.pop();
		reverse(st);
		st.push(v);
	}

}
