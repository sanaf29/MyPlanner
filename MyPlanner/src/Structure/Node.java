package Structure;

public class Node <T> {
	T element; 
	Node<T> next; 

	Node(T element) {
		this.element = element; 
		this.next = null; 
	}


	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public boolean hasNext() {
		return next != null;
	}

	@Override
	public String toString() {
		return String.valueOf(element);
	}

	public boolean equals(Node<T> other) {
		if (other == null) return false;
		return this.element.equals(other.element);
	}

}
