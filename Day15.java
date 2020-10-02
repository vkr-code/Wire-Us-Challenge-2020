
import java.util.Scanner;

public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			String str=s.next();
			System.out.println(createNum(str,0,str.length()-1,1));
		}
	}

	private static int createNum(String str, int ans,int idx,int tenpow) {
		// TODO Auto-generated method stub
		if(idx==-1) return ans;
		char ch=str.charAt(idx);
		ans+=Character.digit(ch,10)*tenpow;
		return createNum(str, ans, idx-1, tenpow*10);
	}
  
}
