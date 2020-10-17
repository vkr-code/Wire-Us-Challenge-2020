
import java.util.Scanner;

public class Day21 {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		    String str=s.next();
		    int ans=0;
		    for(int i=0;i<str.length();i++){
		        int v1=decimal(str.charAt(i));
		        if(i+1<str.length()){
		            int v2=decimal(str.charAt(i+1));
		            if(v1>=v2) ans+=v1;
		            else{
		                ans+=v2-v1;
		                i++;
		            }
		        }else{
		            ans+=v1;
		        }
		    }
		    System.out.println(ans);
		}
	}
	public static int decimal(char ch){
	    if(ch=='I') return 1;
	    else if(ch=='V') return 5;
	    else if(ch=='X') return 10;
	    else if(ch=='L') return 50;
	    else if(ch=='C') return 100;
	    else if(ch=='D') return 500;
	    else if(ch=='M') return 1000;
	    else return -1;
	}
}
