package CircularLinkList;

import java.util.Scanner;

import CircularLinkList.Circular_insertion.Node;

public class Circular_deletion {
	
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
	
	
	public void delete() {
		int data,n,m,p;
		Scanner sc=new Scanner(System.in);
		do {
			if(head==null) 
			{
				System.out.println("LL is empty");;
			}
			else 
			{
				System.out.println("Enter 1 to delete the item at beginning , 2 to delete the item at the end or 3 to delete the item at specific location");
				m=sc.nextInt();
				switch(m)
				{
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp ;
					tail.next=head;
					break;
				case 2:
					Node temp1=head;
					Node ptr=temp1.next;
					while(ptr.next!=head) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp1.next=head;
					tail=temp1;
					break;
				case 3:
					System.out.println("Enter position of node to be deleted");
					p=sc.nextInt();
					Node temp2=head;
					Node ptr1=temp2.next;
					for(int i=0;i<p-2;i++) {
						temp2=ptr1;
						ptr1=ptr1.next;
					}
					temp2.next=ptr1.next;
					break;
				}
			}
			System.out.println("Do you want to delete more data.If Yes, press 1");
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
		Circular_deletion ll=new Circular_deletion();
		ll.creation();
		
		ll.delete();
		ll.transversal();
	}

}

