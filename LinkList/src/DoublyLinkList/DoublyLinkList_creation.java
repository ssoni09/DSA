package DoublyLinkList;

import java.util.Scanner;

import SinglyLinkList.Single_creation;


public class DoublyLinkList_creation {

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
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter data");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null) {
				head=new_node;
				tail=new_node;
			}
			else {
				head.prev=new_node;
				new_node.next=head;
				head=new_node;
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
		DoublyLinkList_creation ll=new DoublyLinkList_creation();
		ll.creation();
		ll.transversal();
	}
}
