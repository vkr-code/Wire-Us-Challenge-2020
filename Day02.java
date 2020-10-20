import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String[] arr=str.split("(?=[A-Z])");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
