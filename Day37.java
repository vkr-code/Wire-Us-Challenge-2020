
import java.text.DecimalFormat;
import java.util.Scanner;

public class Day37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			float x=s.nextFloat();
			float y=s.nextFloat();
			DecimalFormat df = new DecimalFormat("#.00");
			if(x>=y){
				System.out.println(df.format(y));
			}else if(x%5!=0){
				System.out.println(df.format(y));
			}else{
				System.out.println(df.format(y-(x+0.50)));
			}
		}
	}

}
