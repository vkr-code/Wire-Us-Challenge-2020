
import java.util.Scanner;
import java.util.Stack;

public class Day12 {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    int n=s.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    int[] ans=new int[n];
		    int k=0;
		    Stack<Pair> st=new Stack<>();
		    for(int i=0;i<n;i++){
		        if(st.isEmpty()){
		            ans[k]=-1;
		            k++;
		        }else if(!st.isEmpty() && st.peek().val>arr[i]){
		            ans[k]=st.peek().idx;
		            k++;
		        }else if(!st.isEmpty() && st.peek().val<=arr[i]){
		            while(!st.isEmpty() && st.peek().val<=arr[i]){
		                st.pop();
		            }
		            if(st.isEmpty()){
		                ans[k]=-1;
		            }else{
		                ans[k]=st.peek().idx;
		            }
		            k++;
		        }
		        st.push(new Pair(i,arr[i]));
		    }
		    for(int i=0;i<n;i++){
		        ans[i]=i-ans[i];
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(ans[i]+" ");
		    }
		    System.out.println("END");
		}
	}
}
class Pair{
    int idx,val;
    Pair(int idx,int val){
        this.idx=idx;
        this.val=val;
    }
}
