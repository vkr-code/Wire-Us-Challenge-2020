
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			String str=s.next();
			String ans="";
			int i=0,j=0;
			for(i=0;i<str.length()-1;i++){
				char ch=str.charAt(i);
				ans+=ch;
				j=i+1;
				if(str.charAt(j)==ch){
					while(j<str.length() && str.charAt(j)==ch){
						j++;
					}
					ans+="*";
					if(j>=str.length()){
						i=j;
						break;
					}
					else i=j-1;
				}
			}
			if(i<str.length()){
				ans+=str.charAt(str.length()-1);
				i++;
			}
			System.out.println(ans);
		}
	}

}
