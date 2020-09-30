
import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		TOH(1,2,3,n);
	}

	private static void TOH(int src,int helper,int destn,int n) {
		// TODO Auto-generated method stub
		if(n==1){
			  System.out.println("Move disk 1 from rod " +  src + " to rod " + destn); 
	          return; 
		}
		TOH(src,destn,helper,n-1); 
        System.out.println("Move disk " + n + " from rod " +  src + " to rod " + destn); 
        TOH(helper,src,destn,n-1);  
	}

}
