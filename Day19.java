
import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			System.out.println(BtoG(n));
		}
	}
    public static String BtoG(int n) {  
       String str=""+n;
       String ans="";
       ans+=str.charAt(0);
       for(int i=1;i<str.length();i++){
    	   int v=Integer.parseInt(""+str.charAt(i))^Integer.parseInt(""+str.charAt(i-1));
    	   ans+=v;
       }
       return ans;
    }

}
