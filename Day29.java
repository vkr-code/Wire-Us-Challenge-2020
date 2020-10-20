import java.util.Scanner;

public class Day29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long sum=0;
		while(n--!=0){
			sum+=s.nextLong();
		}
		System.out.println(sum);
	}

}
