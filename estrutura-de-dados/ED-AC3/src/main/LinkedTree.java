package main;

import java.util.Iterator;

import exceptions.BoundaryViolationException;

import exceptions.EmptyTreeException;

import exceptions.InvalidPositionException;

import exceptions.NonEmptyTreeException;
import interfaces.Tree;
import interfaces.TreePosition;
import interfaces.Position;

import tad_lista_de_nodos.NodePositionList;

import tad_lista_de_nodos.PositionList;

//Um classe para a �rvore ligada onde os nodos t�m um n�mero arbitr�rio de filhos.
public class LinkedTree<E> implements Tree<E> {

	protected TreePosition<E> root; // Refer�ncia para a ra�z
	protected int size; // N�mero de Nodos

	// Cria uma �rvore vazia
	public LinkedTree() {
		root = null; // Inicia uma �rvore vazia
		size = 0;
	}

	// Retorna um n�mero de nodos da �rvore
	public int size() {
		return size;
	}

	// Retorna se a �rvore est� vazia
	public boolean isEmpty() {
		return (size == 0);
	}

	// Retorna se um nodo � interno
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		return !isExternal(v);
	}

	// Retorna se um nodo � externo
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		return (vv.getChildren() == null) || vv.getChildren().isEmpty();
	}

	// Retorna se um nodo � a ra�z
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		checkPosition(v);
		return (v == root());
	}

	// Retorna a ra�z da �rvore
	public TreePosition<E> root() throws EmptyTreeException {
		if (root == null)
			throw new EmptyTreeException("The tree is empty");
		return root;
	}

	// Retorna o pai de um nodo
	public TreePosition<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		TreePosition<E> vv = checkPosition(v);
		TreePosition<E> parentPos = vv.getParent();
		if (parentPos == null)
			throw new BoundaryViolationException("No parent");
		return parentPos;
	}

	// Retorna uma cole��o iter�vel dos filhos de um nodo
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		return vv.getChildren();
	}

	// Retorna uma cole��o iter�vel dos nodos da �rvore.
	public Iterable<Position<E>> positions() {
		PositionList<Position<E>> positions = new NodePositionList<Position<E>>();
		if (size != 0)
			preorderPositions(root(), positions);
		return positions;
	}

	// Retorna um iterator dos elementos armazenados nos nodos
	public Iterator<E> iterator() {
		Iterable<Position<E>> positions = positions();
		PositionList<E> elements = new NodePositionList<E>();
		for (Position<E> pos : positions)
			elements.addLast(pos.element());
		return elements.iterator();
	}

	// Troca o elemento de um nodo
	public E replace(Position<E> v, E o) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		E temp = v.element();
		vv.setElement(o);
		return temp;
	}

	// M�todos de atualiza��o adicionais
	// Adiciona um nodo ra�z para uma �rvore vazia
	public TreePosition<E> addRoot(E e) throws NonEmptyTreeException {
		if (!isEmpty())
			throw new NonEmptyTreeException("Tree already has a root");
		size = 1;
		root = createNode(e, null, null);
		return root;
	}

	// Troca os elementos de dos nodos
	public void swapElements(Position<E> v, Position<E> w) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		TreePosition<E> ww = checkPosition(w);
		E temp = w.element();
		ww.setElement(v.element());
		vv.setElement(temp);
	}

	// M�todos auxiliares
	// Se v � um bom nodo da �rvore, cast para TreePosition, caso contr�rio, lan�a
	// exce��o
	protected TreePosition<E> checkPosition(Position<E> v) throws InvalidPositionException {
		if (v == null || !(v instanceof TreePosition))
			throw new InvalidPositionException("The position is invalid");

		return (TreePosition<E>) v;
	}

	// Cria um novo nodo da �rvore
	protected TreePosition<E> createNode(E element, TreePosition<E> parent, PositionList<Position<E>> children) {
		return new TreeNode<E>(element, parent, children);
	}

	// Cria uma lista armazenando os nodos das sub�rvore de um nodo
	// ordenado de acordo com a travessia das sub�rvores
	protected void preorderPositions(Position<E> v, PositionList<Position<E>> pos) throws InvalidPositionException {
		pos.addLast(v);
		for (Position<E> w : children(v))
			preorderPositions(w, pos);
	}

	public String toString() {
		return toString(this);
	}

	public static <E> String toString(LinkedTree<E> T) {
		String s = "";
		
		for (E i : T) {
			s += ", " + i;
		}

		s = (s.length() == 0 ? s : s.substring(2));
		return "[" + s + "]";
	}

	public char[] parentheticRepresentation(LinkedTree<String> t, TreePosition<String> root2) {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] toStringPostorder(LinkedTree<String> t, TreePosition<String> root2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer height1(LinkedTree<String> t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer height2(LinkedTree<String> t, TreePosition<String> root2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer depth(LinkedTree<String> t, Position<String> element) {
		// TODO Auto-generated method stub
		return null;
	}
}

// EXERC�CIO PARA OS ALUNOS
// Implementar:
// depth
// height1
// height2
// parentheticRepresentation