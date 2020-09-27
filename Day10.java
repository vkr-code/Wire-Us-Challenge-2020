
import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<d;i++){
			int first=arr[0];
			for(int j=0;j<n-1;j++){
				arr[j]=arr[j+1];
			}
			arr[n-1]=first;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
