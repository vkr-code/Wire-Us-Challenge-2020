import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] arr=str.split(" ");
        System.out.println(arr[arr.length-1].length());
	}

}
