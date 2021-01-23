package Collections.LinkedListConcepts;

/*
 * https://letstalkalgorithms.com/linkedlist-implementation-java/
 * */


public class MyLinkedList {

	Node head = null, tail = null;

	class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void printMyLinkedList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void add(int data) {

		if (head == null) {
			Node node = new Node(data);
			head = node;
			tail = node;
		} else {

			tail.next=new Node(data);
			tail=tail.next;			
		}

	}
	
	public void addNodeAtStart(int data) {
		if(head==null) {
			Node temp=new Node(data);
			head=temp;
			tail=temp;
		}else {
			Node temp=new Node(data);
			temp.next=head;
			temp=head;
		}
	}
	
	public void addNodeAtCertainIndex(int data,int index) {
		Node temp=head;
		int count=0;
		while(temp!=null && ++count!=index) {
			temp=temp.next;
		}
		Node node=new Node(data);
		node.next=temp.next;
		temp.next=node;		
	}
	/*
	 * 
	 * Removes the last node
	 */
	public void removeNode() {
		Node temp=head;
		while(temp.next!=null && temp.next.next!=null)
			temp=temp.next;
		
		temp.next=null;
		tail=temp;
	}
	
	public void removeNodeAtStart() {
		head=head.next;
	}
	
	public void removeNodeAtCertainIndex(int index) {
		Node temp=head;
		int count=0;
		while(temp.next!=null && ++count!=index) {
			temp=temp.next;
		}
		//temp.data=temp.next.data;
		temp.next=temp.next.next;
	}
	
	public boolean search(int target) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==target)
				return true;
		}
		return false;
		
	}
	
	public int searchAndReturnIndex(int target) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			if(temp.data==target)
				return count;
		}
		return -1;
			
	}

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.printMyLinkedList();
		System.out.println("****************");
		ll.addNodeAtCertainIndex(25, 1);
		ll.printMyLinkedList();
		System.out.println("****************");
		ll.removeNodeAtCertainIndex(2);
		ll.printMyLinkedList();
		
	}

}
