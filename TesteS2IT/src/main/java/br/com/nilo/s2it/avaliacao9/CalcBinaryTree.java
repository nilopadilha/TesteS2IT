package br.com.nilo.s2it.avaliacao9;

import java.util.Objects;

public class CalcBinaryTree {

	private BinaryTree binaryTree;

	public CalcBinaryTree(BinaryTree binaryTree) {
		Objects.requireNonNull(binaryTree, "A árvore binária não pode ser nula");
		this.binaryTree = binaryTree;
	}

	public int Soma() {
		return Soma(binaryTree);
	}

	private int Soma(BinaryTree binaryTree) {

		if (binaryTree == null) {
			return 0;
		}

		return binaryTree.getValor() + Soma(binaryTree.getLeft()) + Soma(binaryTree.getRight());
	}

}
