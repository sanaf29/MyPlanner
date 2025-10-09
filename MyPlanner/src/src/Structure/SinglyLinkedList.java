package Structure;
import EXP.*; 

public class SinglyLinkedList<T> {
	
	private Node<T> head; 
	
	public SinglyLinkedList() { 
		head = null; 
	}
	public void add(T element) { 
		Node<T> newNode = new Node<>(element); 
		if ( head == null) { 
			head = newNode; 
		} else { 
			Node<T> current = head; 
			while( current.next != null) { 
				current = current.next; 
			}
			current.next = newNode; 
			
		}
	}
	
	public void remove(T fNode) throws NodeNotFoundException{ 
		// should have node before and next to remove the current one and attach the before to the last 
		if (head == null) { 
			// Node did not found
			throw new NodeNotFoundException("Can find assigned node to remove"); 
		} 
		
		// if the assigned node is the first one 
		if (head.element.equals(fNode)) { 
			// move the head to the next
			if (head.next == null) {
				head = null; 
			} else { 
				head = head.next; 
			}
		}
		
		// search for the node
		Node<T> current = head;
		Node<T> previous = null;
		while (current != null && !current.element.equals(fNode)) {
			previous = current; 
			current = current.next; 
			
		}
		
		if (current == null) {  // not found
			throw new NodeNotFoundException("Can find assigned node to remove"); 

		}
		
		// remove it from the link
		previous.next = current.next; 
		
		//done
	}
	
}
