
import java.util.Scanner;

public class Day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0){
			int a=s.nextInt();
			int b=s.nextInt();
			String str1=String.valueOf(a);
			String str2=String.valueOf(b);
			int max=Math.max(str1.length(), str2.length());
			int[] arr1=new int[max];
			int[] arr2=new int[max];
			if(str1.length()==str2.length()){
				for(int i=max-1;i>=0;i--){
					arr1[i]=Character.getNumericValue(str1.charAt(i));
				}
				for(int i=max-1;i>=0;i--){
					arr2[i]=Character.getNumericValue(str2.charAt(i));
				}
			}else if(max==str1.length()){
				for(int i=max-1;i>=0;i--){
					arr1[i]=Character.getNumericValue(str1.charAt(i));
				}
				int j=str2.length()-1;
				for(int i=max-1;i>=str2.length();i--){
					arr2[i]=Character.getNumericValue(str2.charAt(j));
					j--;
				}
				int diff=max-str2.length();
				for(int i=0;i<diff;i++){
					arr2[i]=0;
				}
			}else{
				for(int i=max-1;i>=0;i--){
					arr2[i]=Character.getNumericValue(str2.charAt(i));
				}
				int j=str1.length()-1;
				for(int i=max-1;i>=str1.length();i--){
					arr1[i]=Character.getNumericValue(str1.charAt(j));
					j--;
				}
				int diff=max-str1.length();
				for(int i=0;i<diff;i++){
					arr1[i]=0;
				}
			}
			/*for(int i=0;i<max;i++){
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			for(int i=0;i<max;i++){
				System.out.print(arr2[i]+" ");
			}
			System.out.println();*/
			for(int i=0;i<max;i++){
				System.out.print((arr1[i]+arr2[i])%10);
			}
			System.out.println();
		}
	}

}
