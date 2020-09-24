
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			String str=s.next();
			String ans="";
			for(int i=0;i<str.length();){
				char ch=str.charAt(i);
				ans+=ch;
				int j=i+1;
				int c=1;
				while(j<str.length() && str.charAt(j)==ch){
					c+=1;
					j+=1;
				}
				if(c>1) ans+=c;
				i=j;
			}
			System.out.println(ans);
		}
	}

}
