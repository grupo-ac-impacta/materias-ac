package ex08;

public class Node<E>{
	private E element;
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	private Node<E> next;
}
