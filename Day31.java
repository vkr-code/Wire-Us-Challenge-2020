
import java.util.Scanner;

public class Day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					min=Math.min(min, Math.abs(arr[i]-arr[j]));
				}
			}
			System.out.println(min);
		}
	}

}
