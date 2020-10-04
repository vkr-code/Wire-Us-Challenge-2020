
import java.util.Arrays;
import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			String str=s.next();
			sort(str);
			System.out.println();
		}
	}
	public static void sort(String str){
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		str=new String(arr);
		//System.out.println(str);
		print(str,-1,"");
	}
	public static void print(String str,int idx,String ans){
		if(idx==str.length()) return;
		System.out.print(ans+" ");
		for(int i=idx+1;i<str.length();i++){
			ans+=str.charAt(i);
			print(str,i,ans);
			ans=ans.substring(0,ans.length()-1);
		}
	}

}
