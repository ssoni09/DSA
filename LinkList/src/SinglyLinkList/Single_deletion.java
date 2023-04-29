package SinglyLinkList;

import java.util.Scanner;

public class Single_deletion {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
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
					break;
				case 2:
					Node temp=head;
					while(temp.next!=null) {
						temp=temp.next;
					}
					temp.next=new_node;
					break;
				case 3:
					System.out.println("Enter position of node to be inserted");
					p=sc.nextInt();
					Node tempo=head;
					for(int i=0;i<p-1;i++) {
						tempo=tempo.next;
					}
					new_node.next=tempo.next;
					tempo.next=new_node;
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
					head=temp;
					break;
				case 2:
					Node tem=head;
					Node ptr=tem.next;
					while(ptr.next!=null) {
						temp=ptr;
						ptr=ptr.next;
					}
					tem.next=null;
					break;
				case 3:
					System.out.println("Enter position of node to be deleted");
					p=sc.nextInt();
					Node tempo=head;
					Node pntr=tempo.next;
					for(int i=0;i<p-2;i++) {
						tempo=pntr;
						pntr=pntr.next;
					}
					tempo.next=pntr.next;
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
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		Single_deletion ll=new Single_deletion();
		ll.creation();
		
		ll.delete();
		ll.transversal();
	}

}
