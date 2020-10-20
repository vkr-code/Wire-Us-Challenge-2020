import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		PriorityQueue<Book> pq=new PriorityQueue<>(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				if(o1.left<o2.left) return -1;
				else if(o1.left>o2.left) return 1;
				else if(o1.depth<o2.depth) return -1;
				else return 1;
			}
			
		});
		for(int i=0;i<n;i++){
			int v=s.nextInt();
			if(v!=-1){
				String str=s.next();
				Book b=new Book(str, v, r);
				r+=1;
				pq.add(b);
			}else{
				Book b=pq.poll();
				System.out.println(b.depth+" "+b.name);
				r=0;
			}
		}
	}

}
class Book{
	String name;
	int left,depth;
	Book(String name,int left,int depth){
		this.name=name;
		this.left=left;
		this.depth=depth;
	}
}
