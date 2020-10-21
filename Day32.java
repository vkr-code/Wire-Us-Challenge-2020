
import java.util.Scanner;

public class Day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int p=s.nextInt();
		int w=s.nextInt();
		int[] arr=new int[m];
		int total=0;
		for(int i=0;i<m;i++){
			arr[i]=s.nextInt();
			total+=arr[i];
		}
		int v=w*(m+p);
		int diff=v-total;
		if(diff<0) System.out.println(-1);
		else System.out.println(diff/p);
	}

}
