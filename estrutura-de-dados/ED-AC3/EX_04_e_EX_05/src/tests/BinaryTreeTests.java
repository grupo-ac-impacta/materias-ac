package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import source.BTPosition;
import source.LinkedBinaryTree;

public class BinaryTreeTests {
	@Test
	void test() {
		assertEquals("Deve ser 12, 25, 31, 36, 42, 58, 62, 75, 90", makerBTSearch(), "12, 25, 31, 36, 42, 58, 62, 75, 90");
	}
	// f) makerBTSearch e exiba o seu caminhamento inorder conforme slide 45.
	public String makerBTSearch() {
		LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<Integer>();
		BTPosition<Integer> root58 = (BTPosition<Integer>) tree.addRoot(58);
		BTPosition<Integer> root31 = (BTPosition<Integer>) tree.insertLeft(root58, 31);
		BTPosition<Integer> root25 = (BTPosition<Integer>) tree.insertLeft(root31, 25);
		BTPosition<Integer> root12 = (BTPosition<Integer>) tree.insertLeft(root25, 12);
		BTPosition<Integer> leftSonRoot12 = (BTPosition<Integer>) tree.insertLeft(root12, null);
		BTPosition<Integer> rightSonRoot12 = (BTPosition<Integer>) tree.insertRight(root12, null);
		BTPosition<Integer> rightSonRoot25 = (BTPosition<Integer>) tree.insertRight(root25, null);
		BTPosition<Integer> root42 = (BTPosition<Integer>) tree.insertRight(root31, 42);
		BTPosition<Integer> root36 = (BTPosition<Integer>) tree.insertLeft(root42, 36);
		BTPosition<Integer> leftSonRoot36 = (BTPosition<Integer>) tree.insertLeft(root36, null);
		BTPosition<Integer> rightSonRoot36 = (BTPosition<Integer>) tree.insertRight(root36, null);
		BTPosition<Integer> rightSonRoot42 = (BTPosition<Integer>) tree.insertRight(root42, null);
		BTPosition<Integer> root90 = (BTPosition<Integer>) tree.insertRight(root58, 90);
		BTPosition<Integer> root62 = (BTPosition<Integer>) tree.insertLeft(root90, 62);
		BTPosition<Integer> leftSonRoot62 = (BTPosition<Integer>) tree.insertLeft(root62, null);
		BTPosition<Integer> root75 = (BTPosition<Integer>) tree.insertRight(root62, 75);
		BTPosition<Integer> leftSonRoot75 = (BTPosition<Integer>) tree.insertLeft(root75, null);
		BTPosition<Integer> RightSonRoot75 = (BTPosition<Integer>) tree.insertRight(root75, null);
		BTPosition<Integer> RightSonRoot90 = (BTPosition<Integer>) tree.insertRight(root90, null);
		String rs = tree.inorder("", (BTPosition<Integer>) tree.root());
		rs = rs.substring(0, rs.length() - 2);
		System.out.println(rs);
		return rs;
	}
}
