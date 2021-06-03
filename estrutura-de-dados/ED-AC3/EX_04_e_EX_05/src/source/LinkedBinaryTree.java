package source;

import java.util.Iterator;


import exceptions.BoundaryViolationException;
import exceptions.EmptyTreeException;
import exceptions.InvalidPositionException;
import exceptions.NonEmptyTreeException;
import interfaces.Position;
import tad_lista_de_nodos.NodePositionList;
import stack.ArrayStack;
import interfaces.PositionList;
import interfaces.Tree;

// * Implementa��o da interface BinaryTree usando uma estrutura encadeada.
public class LinkedBinaryTree<E> implements BinaryTree<E> {
	protected BTPosition<E> root; // refer�ncia para a raiz
	protected int size; // n�mero de nodos

// Cria uma �rvore bin�ria vazia.
	public LinkedBinaryTree() {
		root = null; // inicia com uma �rvore vazia
		size = 0;
	}

// Retorna o n�mero de nodos da �rvore.
	public int size() {
		return size;
	}

// Retorna se um nodo � interno.
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		checkPosition(v); // m�todo auxiliar
		return (hasLeft(v) || hasRight(v));
	}

// Retorna se um nodo � a raiz.
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		checkPosition(v);
		return (v == root());
	}

//Retorna se um nodo tem o filho da esquerda.
	public boolean hasLeft(Position<E> v) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		return (vv.getLeft() != null);
	}

//Retorna a raiz da �rvore.
	public Position<E> root() throws EmptyTreeException {
		if (root == null)
			throw new EmptyTreeException("The tree is empty");
		return root;
	}

//Retorna o filho da esquerda de um nodo.
	public Position<E> left(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		BTPosition<E> vv = checkPosition(v);
		Position<E> leftPos = (Position<E>) vv.getLeft();
		if (leftPos == null)
			throw new BoundaryViolationException("No left child");
		return leftPos;
	}

//Retorna o pai de um nodo.
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		BTPosition<E> vv = checkPosition(v);
		Position<E> parentPos = (Position<E>) vv.getParent();
		if (parentPos == null)
			throw new BoundaryViolationException("No parent");
		return parentPos;
	}

//Retorna uma cole��o iter�vel contendo os filhos de um nodo.
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		PositionList<Position<E>> children = new NodePositionList<Position<E>>();
		if (hasLeft(v))
			children.addLast(left(v));
		if (hasRight(v))
			children.addLast(right(v));
		return children;
	}

//Retorna uma cole��o iter�vel (inorder) contendo os nodos da �rvore.
	public Iterable<Position<E>> positionsInorder() {
		PositionList<Position<E>> positions = new NodePositionList<Position<E>>();
		if (size != 0)
			inorderPositions(root(), positions); // atribui as posi��es usando caminhamento prefixado
		return positions;
	}

public void inorderPositions(Position<E> root2, PositionList<Position<E>> positions) {
	// TODO Auto-generated method stub
	
}

//Retorna uma cole��o iter�vel contendo os nodos da �rvore.
	public Iterable<Position<E>> positions() {
		PositionList<Position<E>> positions = new NodePositionList<Position<E>>();
		if (size != 0)
			preorderPositions(root(), positions); // atribui as posi��es usando caminhamento prefixado
		return positions;
	}

//Retorna um iterador sobre os elementos armazenados nos nodos
	public Iterator<E> iterator() {
		Iterable<Position<E>> positions = positions();
		PositionList<E> elements = new NodePositionList<E>();
		for (Position<E> pos : positions)
			elements.addLast(pos.element());
		return elements.iterator(); // Um iterador sobre os elementos
	}

//Substitui o elemento armazenado no nodo.
	public E replace(Position<E> v, E o) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		E temp = v.element();
		vv.setElement(o);
		return temp;
	}

//M�todo de acesso adicional
//Retorna o irm�o de um nodo
	public Position<E> sibling(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		BTPosition<E> vv = checkPosition(v);
		BTPosition<E> parentPos = vv.getParent();
		if (parentPos != null) {
			BTPosition<E> sibPos;
			BTPosition<E> leftPos = parentPos.getLeft();
			if (leftPos == vv)
				sibPos = parentPos.getRight();
			else
				sibPos = parentPos.getLeft();
			if (sibPos != null)
				return sibPos;
		}
		throw new BoundaryViolationException("No sibling");
	}

//M�todos de acesso adicionais
//Insere a raiz em uma �rvore vazia
	public Position<E> addRoot(E e) throws NonEmptyTreeException {
		if (!isEmpty())
			throw new NonEmptyTreeException("Tree already has a root");
		size = 1;
		root = createNode(e, null, null, null);
		return root;
	}

//Insere o filho da esquerda em um nodo.
	public Position<E> insertLeft(Position<E> v, E e) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		Position<E> leftPos = (Position<E>) vv.getLeft();
		if (leftPos != null)
			throw new InvalidPositionException("Node already has a left child");
		BTPosition<E> ww = createNode(e, vv, null, null);
		vv.setLeft(ww);
		size++;
		return ww;
	}

	//Insere o filho da direita em um nodo.
	public Position<E> insertRight(Position<E> v, E e) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		Position<E> RightPos = (Position<E>) vv.getRight();
		if (RightPos != null)
			throw new InvalidPositionException("Node already has a left child");
		BTPosition<E> ww = createNode(e, vv, null, null);
		vv.setRight(ww);
		size++;
		return ww;
	}
	
//Remove um nodo com zero ou um filho.
	public E remove(Position<E> v) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		BTPosition<E> leftPos = vv.getLeft();
		BTPosition<E> rightPos = vv.getRight();
		if (leftPos != null && rightPos != null)
			throw new InvalidPositionException("Cannot remove node with two children");
		BTPosition<E> ww; // o �nico filho de v, se houver
		if (leftPos != null)
			ww = leftPos;
		else if (rightPos != null)
			ww = rightPos;
		else // v � folha
			ww = null;
		if (vv == root) { // v � a raiz
			if (ww != null)
				ww.setParent(null);
			root = ww;
		} else { // v n�o � a raiz
			BTPosition<E> uu = vv.getParent();
			if (vv == uu.getLeft())
				uu.setLeft(ww);
			else
				uu.setRight(ww);
			if (ww != null)
				ww.setParent(uu);
		}
		size--;
		return v.element();
	}

//Conecta duas �rvores para serem sub�rvores de um nodo externo.
	public void attach(Position<E> v, BinaryTree<E> T1, BinaryTree<E> T2) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		if (isInternal(v))
			throw new InvalidPositionException("Cannot attach from internal node");
		if (!T1.isEmpty()) {
			BTPosition<E> r1 = checkPosition(T1.root());
			vv.setLeft(r1);
			r1.setParent(vv); // T1 deve ser invalidada
		}
		if (!T2.isEmpty()) {
			BTPosition<E> r2 = checkPosition(T2.root());
			vv.setRight(r2);
			r2.setParent(vv); // T2 deve ser invalidada
		}
	}

//Se v � um nodo de �rvore bin�ria, converte para BTPosition, caso contr�rio lan�a exce��o
	protected BTPosition<E> checkPosition(Position<E> v) throws InvalidPositionException {
		if (v == null || !(v instanceof BTPosition))
			throw new InvalidPositionException("The position is invalid");
		return (BTPosition<E>) v;
	}

//Cria um novo nodo de �rvore bin�ria
	protected BTPosition<E> createNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
		return new BTNode<E>(element, parent, left, right);
	}

//Cria uma lista que armazena os nodos da sub�rvore de um nodo ordenados de acordo com o 
//caminhamento prefixado da sub�rvore.
	protected void preorderPositions(Position<E> v, PositionList<Position<E>> pos) throws InvalidPositionException {
		pos.addLast(v);
		if (hasLeft(v))
			preorderPositions(left(v), pos); // recurs�o sobre o filho da esquerda
		if (hasRight(v))
			preorderPositions(right(v), pos); // recurs�o sobre o filho da direita
	}
	
	protected void buildExpression(String E) {
		ArrayStack<BTPosition> S = new ArrayStack<BTPosition>();
		int n = E.length();
		for(int i = 0; i == n-1; i++) {
			if(E[i] != "(" || E[i] !=  ")" ) {
				LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();
				tree.addRoot(E[i]);
				S.push(tree);
				
			}
			else if(E[i] == "(") {
				;
				
			}
			else {
				LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();
				BTPosition<String> primeiro = S.pop();
				BTPosition<String> segundo = S.pop();
				BTPosition<String> terceiro = S.pop();
				
				root = tree.addRoot(segundo);
				tree.attach(root, terceiro, primeiro);
				S.push(tree);

			}
		
		}
		return S.pop();
		
	}
	
// b) binaryPreorder conforme slide 31.
	public String binaryPreorder(Tree<E> T, Position<E> v) {
		T += v.element();
		if(hasLeft(v)) {
			T += binaryPreorder(T,v.left());}
		if(hasRight(v)) {
			T += binaryPreorder(T,v.right());}
		return T;
	}
	
// c) binaryPostorder conforme slide 32.
	public String binaryPostorder(Tree<E> T, Position<E> v) {
		if(hasLeft(v)) {
			T += binaryPreorder(T,v.left());}
		if(hasRight(v)) {
			T += binaryPreorder(T,v.right());}
		T += v.element();
		return T;
	}
	
// d) evaluateExpression conforme slide 34 a 42.
	public String evaluateExpression(Tree<E> T, Position<E> v) {
		if (isInternal(v)){
			String o = v.element();
			String x = evaluateExpression(T,T.left(v));
			String y = evaluateExpression(T,T.right(v));
			return x, o, y;
			}
		else {
			return v.element();
		}
	}
	
	
	//  e) inorder conforme slide 43.
	public String inorder(String T, BTPosition<E> v) {
		if (hasLeft(v) && v.getLeft().element() != null) {
			T = inorder(T,v.getLeft());
		}
		T +=  v.element() + ", ";
		if (hasRight(v) && v.getRight().element() != null) {
			T = inorder(T,v.getRight());
		}
		return T;
	}
	
	// g) M�todo que desenhe a �rvore bin�ria de express�o conforme slide 47.
	
	// h) eulerTour conforme slide 51.
	public void eulerTour(String T, BTPosition<E> v) {
		
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		return !isInternal(v);
	}

	public Position<E> right(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		BTPosition<E> vv = checkPosition(v);
		Position<E> rightPos = (Position<E>) vv.getRight();
		if (rightPos == null)
			throw new BoundaryViolationException("No right child");
		return rightPos;
	}

	public boolean hasRight(Position<E> v) throws InvalidPositionException {
		BTPosition<E> vv = checkPosition(v);
		return (vv.getRight() != null);
	}
}