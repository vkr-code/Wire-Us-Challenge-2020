
import java.util.Scanner;

public class Day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String pat=s.next();
		if(pat.equals(" "))System.out.println(0);
		else System.out.println(str.indexOf(pat));
	}
}
