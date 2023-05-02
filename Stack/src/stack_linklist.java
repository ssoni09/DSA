
import java.util.Scanner;

class stack1 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	 
	void push(Scanner sc) {
		System.out.println("Enter data");
		int data=sc.nextInt();
		Node new_node=new Node(data);
		if(top==null) {
			top=new_node;
		}
		else {
			new_node.next=top;
			top=new_node;
		}
	}
	
	void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}else {
			top=top.next;
		}
		
	}
	
	void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}


public class stack_linklist {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack1 s=new stack1();
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
