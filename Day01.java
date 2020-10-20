
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] mat=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mat[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			if(i%2==0){
				for(int j=0;j<n;j++){
					System.out.print(mat[j][i]+",");
				}
			}else{
				for(int j=n-1;j>=0;j--){
					System.out.print(mat[j][i]+",");
				}
			}
		}
		System.out.println("END");
	}

}
