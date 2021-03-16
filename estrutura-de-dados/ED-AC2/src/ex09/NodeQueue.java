package ex09;

import ex09.EmptyQueueException;

public class NodeQueue<E> {
	private Node<E> head; // mais recente
	private Node<E> tail; // mais antigo
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public Node<E> front() {
		return head.getNext();
	}

	public void enqueue(E elem) {
		Node<E> node = new Node<E>();
		node.setElement(elem);
		node.setNext(null); // nodo será o novo nodo do final
		if (size == 0)
			head = node; // caso especial de uma lista previamente vazia
		else
			tail.setNext(node); // adiciona nodo no final da lista
		tail = node; // atualiza referência ao nodo do final
		size++;
	}

	@SuppressWarnings("unchecked")
	public E dequeue() throws EmptyQueueException {
		if (size == 0)
			throw new EmptyQueueException();
		E tmp = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;// a fila está vazia agora
		return tmp;
	}
	
	@SuppressWarnings("unchecked")
	public String toString() {
		String s;
		Node<E> p = head; 
		
		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1) s = s.substring(0, s.length() - 2);
		return s + "]";
	}
}

