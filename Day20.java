
import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str1="0";
		String str2="1";
		printNos(n,str1,1);
		printNos(n,str2,1);
	}

	private static void printNos(int n, String str, int idx) {
		if(idx==n){
			int v=Integer.parseInt(str, 2);
			if(v!=0)System.out.println(v);
			return;
		}
		char prev=str.charAt(idx-1);
		if(prev=='1') printNos(n, str+"0", idx+1);
		else{
			printNos(n, str+"0", idx+1);
			printNos(n, str+"1", idx+1);
		}
	}

}
