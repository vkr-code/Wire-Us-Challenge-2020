import java.util.*;
import java.lang.*;
import java.io.*;

class Day02{
	public static void main (String[] args) throws java.lang.Exception {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    String[] in=br.readLine().split(" ");
		    Pair[] arr=new Pair[n];
		    for(int i=0;i<n;i++){
		        int v=Integer.parseInt(in[i]);
		        Pair p=new Pair(v,i);
		        arr[i]=p;
		    }
		    Pair[] smallerToLeft=new Pair[n];
		    Pair[] smallerToRight=new Pair[n];
		    //smaller to Left:
		    Stack<Pair> st=new Stack<>();
		    for(int i=0;i<n;i++){
		        if(st.isEmpty()){
		            smallerToLeft[i]=null;
		        }else if(!st.isEmpty() && st.peek().val<arr[i].val){
		            smallerToLeft[i]=st.peek();
		        }else if(!st.isEmpty() && st.peek().val>=arr[i].val){
		            while(!st.isEmpty() && st.peek().val>=arr[i].val) st.pop();
		            if(st.isEmpty()){
		                smallerToLeft[i]=null;
		            }else{
		                smallerToLeft[i]=st.peek();
		            }
		        }
		        st.push(arr[i]);
		    }
		    //smallerToRight
		    st=new Stack<>();
		    for(int i=n-1;i>=0;i--){
		        if(st.isEmpty()){
		            smallerToRight[i]=null;
		        }else if(!st.isEmpty() && st.peek().val<arr[i].val){
		            smallerToRight[i]=st.peek();
		        }else if(!st.isEmpty() && st.peek().val>=arr[i].val){
		            while(!st.isEmpty() && st.peek().val>=arr[i].val) st.pop();
		            if(st.isEmpty()){
		                smallerToRight[i]=null;
		            }else{
		                smallerToRight[i]=st.peek();
		            }
		        }
		        st.push(arr[i]);
		    }
		    int maxa=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        int a=1;
		        int l=0,b=0;
		        if(smallerToLeft[i]==null) b+=i;
		        else b+=(i-smallerToLeft[i].idx)-1;
		        if(smallerToRight[i]==null) b+=(n-i);
		        else b+=(smallerToRight[i].idx-i);
		        l=arr[i].val;
		        a=l*b;
		        if(a>maxa) maxa=a;
		    }
		    System.out.println(maxa);
		}
	}
}
class Pair{
    int val=0,idx=0;
    Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
