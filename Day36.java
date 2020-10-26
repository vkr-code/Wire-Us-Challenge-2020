
import java.util.Scanner;

public class Day36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
		int a=s.nextInt();
		int b=s.nextInt();
		if(a<b){
			int temp=a;
			a=b;
			b=temp;
		}
		int gcd=gcd(a,b);
		int lcm=a*b/gcd;
		System.out.println(gcd+" "+lcm);
	}}
	public static int gcd(int a,int b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
