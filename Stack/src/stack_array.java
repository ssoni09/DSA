
import java.util.Scanner;

class stack {
	 int top=-1;
	 int n=10;
	 int a[]=new int[n];
	 void push(Scanner sc) {
		 if(top==(n-1)) {
			 System.out.println("Overflow");
		 }
		 else {
			 System.out.println("Enter data");
			 int i=sc.nextInt(); 
			 top=top+1;
			 a[top]=i;
			 System.out.println("Data inserted");
			 }
	 }
	 
	 void pop() {
		 if(top==-1) {
			 System.out.println("Underflow");
		 }
		 else {
			top=top-1;
			System.out.println("Data deleted");
		 }
	 }
	 
	 void display() {
		 System.out.println("Data are :");
		 for(int j=top;j<-1;j--) {
			 System.out.print(a[j]+" ");
		 }
	 }
}

public class stack_array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
		int d,l;
		do {
			System.out.println("Press 1 : Push\nPress 2 : Pop\nPress 3: Display\nEnter your choice");
			d=sc.nextInt();
			switch(d) {
			case 1:
				s.push(sc);
				break;
			case 2:
				s.pop();
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
