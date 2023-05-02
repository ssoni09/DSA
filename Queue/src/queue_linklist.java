
import java.util.Scanner;


class queue1 {
	 static class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				this.next=null;
			}
		}
		Node f=null;
		Node r=null;
		
	 public void enqueue(Scanner sc) {
		
			System.out.println("Enter data");
			int data=sc.nextInt(); 
			Node new_node=new Node(data);
			 if(f==null) {
				f=new_node;
				r=new_node;
			 }else {
				 r.next=new_node;
				 r=new_node;
			 }
	 
			 System.out.println("Data inserted");
			 
	 }
	 
	 public void dequeue() {
		 if(f==null) {
			 System.out.println("Underflow");
		 }
		 else {
			f=f.next;
			System.out.println("Data deleted");
		 }
	 }
	 
	 public void display() {
		 System.out.println("Data are :");
		 for(Node j=f;j!=null;j=j.next) {
			 System.out.print(j.data+" ");
		 }
	 }
}

public class queue_linklist {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		queue1 s=new queue1();
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
