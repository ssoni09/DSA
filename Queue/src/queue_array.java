import java.util.Scanner;


class queue {
	 int f=-1,r=-1;
	 int n=10;
	 int a[]=new int[n];
	 void enqueue(Scanner sc) {
		 if(r==(n-1)) {
			 System.out.println("Overflow");
		 }
		 else {
			 System.out.println("Enter data");
			 int i=sc.nextInt(); 

			 if(f==-1 && r==-1) {
				 f++;
				 r++;
			 }else {
				 r++;
			 }
	 
			 a[r]=i;
			 System.out.println("Data inserted");
			 }
	 }
	 
	 void dequeue() {
		 if(f==-1 && r==-1) {
			 System.out.println("Underflow");
		 }
		 else {
			f++;
			System.out.println("Data deleted");
		 }
	 }
	 
	 void display() {
		 System.out.println("Data are :");
		 for(int j=f;j<=r;j++) {
			 System.out.print(a[j]+" ");
		 }
	 }
}

public class queue_array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		queue s=new queue();
		int d,l;
		do {
			System.out.println("Press 1 : Enqueue\nPress 2 : Dequeue\nPress 3: Display\nEnter your choice");
			d=sc.nextInt();
			switch(d) {
			case 1:
				s.enqueue(sc);
				break;
			case 2:
				s.dequeue();
				break;
			case 3:
				s.display();
				break;
			}
			System.out.println("Enter 0 to go back to the main menu\nEnter any key to Exit");
			l=sc.nextInt();
		}while(l==0);
		System.out.println("Exit successfully");
	}

}
