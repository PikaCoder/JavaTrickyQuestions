public class LinkedListInsertNodeAtStart {
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
	
	public void insertNodeAtStart(int new_data){
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		head = new_Node;
	}
	
	public static void main(String[] args) {
	LinkedListInsertNodeAtStart lList = new LinkedListInsertNodeAtStart();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		lList.head.next = second;
		second.next = third;
		
		lList.insertNodeAtStart(10);
		lList.printList();

	}
}
