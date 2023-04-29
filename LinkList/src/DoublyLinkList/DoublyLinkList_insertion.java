package DoublyLinkList;

import java.util.Scanner;

public class DoublyLinkList_insertion {

	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void creation(){
		int data,n,m,p;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter data");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null) 
			{
				head=new_node;
				tail=new_node;
			}
			else 
			{
				System.out.println("Enter 1 to insert the item at beginning , 2 to insert the item at the end or 3 to insert the item at specific location");
				m=sc.nextInt();
				switch(m)
				{
				case 1:
					head.prev=new_node;
					new_node.next=head;
					head=new_node;
					break;
				case 2:
					tail.next=new_node;
					new_node.prev=tail;
					tail=new_node;
					break;
				case 3:
					System.out.println("Enter position of node to be inserted");
					p=sc.nextInt();
					Node temp=head;
					Node ptr=temp.next;
					for(int i=1;i<p-1;i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					new_node.prev=temp;
					new_node.next=ptr;
					temp.next=new_node;
					ptr.prev=new_node;
					break;
				}
			}
			System.out.println("Do you want to add more data.If Yes, press 1");
			n=sc.nextInt();
		}
		while(n==1);
	}
	
	public void transversal(){
		Node temp=head;
		if(head==null) {
			System.out.println("LinkList does not exist");
		}else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		DoublyLinkList_insertion ll=new DoublyLinkList_insertion();
		ll.creation();
		ll.transversal();
	}
}
