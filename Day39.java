
import java.util.Scanner;

public class Day39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			String str=s.next();
			int len=str.length();
			int i=0,j=len-1;
			boolean var=true;
			while(i<=j){
				if(str.charAt(i)!=str.charAt(j)){
					var=false;
					break;
				}
				i++;
				j--;
			}
			System.out.println(var==false?"loses":"wins");
		}
	}

}
