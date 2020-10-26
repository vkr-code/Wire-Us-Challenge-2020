
import java.util.Scanner;

public class Day38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
			int v=s.nextInt();
			if(v%k==0) c+=1;
		}
		System.out.println(c);
	}

}
