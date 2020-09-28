
import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String h=str.substring(0, 2);
		String min=str.substring(3,5);
		String sec=str.substring(6,8);
		String zone=str.substring(8,10);
		String ans="";
		int val=Integer.parseInt(h);
		if(val==12 && zone.equals("PM")){
			ans+=h+":"+min+":"+sec;
		}else if(val==12 && zone.equals("AM")){
			ans+="00"+":"+min+":"+sec;
		}else if(zone.equals("AM")){
			ans+=h+":"+min+":"+sec;
		}else{
			int v=12+Integer.parseInt(h);
			ans+=v+":"+min+":"+sec;
		}
		System.out.println(ans);
	}

}
