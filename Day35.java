
import java.util.Scanner;

public class Day35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int x=s.nextInt();
			if(x%10==0){
				System.out.println(0);
			}else if(x%10==5){
				System.out.println(1);
			}else{
				System.out.println(-1);
			}
		}
	}

}
