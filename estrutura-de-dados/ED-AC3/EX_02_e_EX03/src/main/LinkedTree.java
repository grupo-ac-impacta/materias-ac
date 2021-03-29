package main;

import java.util.Iterator;

import exceptions.BoundaryViolationException;

import exceptions.EmptyTreeException;

import exceptions.InvalidPositionException;

import exceptions.NonEmptyTreeException;
import interfaces.Tree;
import interfaces.TreePosition;
import interfaces.Position;
import interfaces.PositionList;
import tad_lista_de_nodos.NodePositionList;

//Um classe para a árvore ligada onde os nodos têm um número arbitrário de filhos.
public class LinkedTree<E> implements Tree<E> {

	protected TreePosition<E> root; // Referência para a raíz
	protected int size; // Número de Nodos

	// Cria uma árvore vazia
	public LinkedTree() {
		root = null; // Inicia uma árvore vazia
		size = 0;
	}

	// Retorna um número de nodos da árvore
	public int size() {
		return size;
	}

	// Retorna se a árvore está vazia
	public boolean isEmpty() {
		return (size == 0);
	}

	// Retorna se um nodo é interno
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		return !isExternal(v);
	}

	// Retorna se um nodo é externo
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		return (vv.getChildren() == null) || vv.getChildren().isEmpty();
	}

	// Retorna se um nodo é a raíz
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		checkPosition(v);
		return (v == root());
	}

	// Retorna a raíz da árvore
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

	// Retorna uma coleção iterável dos filhos de um nodo
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		TreePosition<E> vv = checkPosition(v);
		return vv.getChildren();
	}

	// Retorna uma coleção iterável dos nodos da árvore.
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

	// Métodos de atualização adicionais
	// Adiciona um nodo raíz para uma árvore vazia
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

	// Métodos auxiliares
	// Se v é um bom nodo da árvore, cast para TreePosition, caso contrário, lança
	// exceção
	protected TreePosition<E> checkPosition(Position<E> v) throws InvalidPositionException {
		if (v == null || !(v instanceof TreePosition))
			throw new InvalidPositionException("The position is invalid");

		return (TreePosition<E>) v;
	}

	// Cria um novo nodo da árvore
	protected TreePosition<E> createNode(E element, TreePosition<E> parent, PositionList<Position<E>> children) {
		return new TreeNode<E>(element, parent, children);
	}

	// Cria uma lista armazenando os nodos das subárvore de um nodo
	// ordenado de acordo com a travessia das subárvores
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

	// ALTERAÇÃO DEVIDO AO MÉTODO APRESENTADO NO SLIDE ESTAR ERRADO
	public String parentheticRepresentation(Tree<E> T, Position<E> v, Integer n) {
		String s = v.element().toString(); // ação principal de visita
		n += 1;

		if (T.isInternal(v)) {
			Boolean firstTime = true;
			for (Position<E> w : T.children(v)) {
				if (firstTime) {
					// primeiro filho
					s += "(\n" + "\t".repeat(n) + parentheticRepresentation(T, w, n);
					firstTime = false;
				} else {
					// filhos seguintes
					s += ",\n" + "\t".repeat(n) + parentheticRepresentation(T, w, n);
				}
			}
			s += "\n" + "\t".repeat(n) + ")"; // fecha parênteses
		}

		return s;
	}

	public String toStringPostorder(LinkedTree<E> t, TreePosition<E> v, String str) {
		Iterable<Position<E>> childrens = children(v);

		for (Position<E> w : childrens)
			str += toStringPostorder(t, (TreePosition<E>) w, str + ", " + v.element());

		return (String) str;
	}

	// retorna o maior entre dois números
	public Integer Max(Integer v1, Integer v2) {
		if (v1 > v2)
			return v1;
		return v2;
	}

	public Integer height1(LinkedTree<E> t) {
		Integer h = 0;
		Iterable<Position<E>> allNodes = positions();

		for (Position<E> s : allNodes) {
			if (isExternal(s))
				h = Max(h, depth(t, s));
		}

		return h;
	}

	public Integer height2(LinkedTree<E> t, TreePosition<E> v) {
		if (isExternal(v)) {
			return 0;
		} else {
			Integer h = 0;
			Iterable<Position<E>> childrensV = children(v);

			for (Position<E> cV : childrensV) {
				h = Max(h, height2(t, (TreePosition<E>) cV));
			}

			return 1 + h;
		}
	}

	public Integer depth(LinkedTree<E> t, Position<E> element) {
		if (isRoot(element))
			return 0;

		return 1 + depth(t, parent(element));
	}

}

// EXERCÍCIO PARA OS ALUNOS
// Implementar:
// depth - ok
// height1
// height2
// parentheticRepresentation