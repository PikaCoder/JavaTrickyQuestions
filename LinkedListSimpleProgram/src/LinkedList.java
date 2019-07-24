
public class LinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		//Traversing a Linked List 
		
		}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		lList.head.next = second;
		second.next = third;
		lList.printList();
		
	}
}
