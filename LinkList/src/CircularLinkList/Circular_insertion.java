package CircularLinkList;

import java.util.Scanner;

import CircularLinkList.Circular_creation.Node;

public class Circular_insertion {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
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
				new_node.next=head;
			}
			else 
			{
				System.out.println("Enter 1 to insert the item at beginning , 2 to insert the item at the end or 3 to insert the item at specific location");
				m=sc.nextInt();
				switch(m)
				{
				case 1:
					new_node.next=head;
					head=new_node;
					tail.next=head;
					break;
				case 2:
					tail.next=new_node;
					tail=new_node;
					new_node.next=head;
					break;
				case 3:
					System.out.println("Enter position of node to be inserted");
					p=sc.nextInt();
					Node temp=head;
					for(int i=0;i<p-1;i++) {
						temp=temp.next;
					}
					new_node.next=temp.next;
					temp.next=new_node;
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
			do {
				System.out.println(temp.data);
				temp=temp.next;
			}
			while(temp!=head);
		}
		
	}
	public static void main(String[] args) {
		Circular_insertion ll=new Circular_insertion();
		ll.creation();
		ll.transversal();
	}

}
