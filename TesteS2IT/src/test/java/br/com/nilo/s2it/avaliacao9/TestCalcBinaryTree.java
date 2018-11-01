package br.com.nilo.s2it.avaliacao9;

import org.junit.Assert;
import org.junit.Test;

public class TestCalcBinaryTree {

	@SuppressWarnings("unused")
	@Test(expected = NullPointerException.class)

	public void ArvoreRetornaValorNulo() {

		/* Inicializando arvore binária como null */
		BinaryTree binaryTree = null;

		/* cria uma arvore */
		CalcBinaryTree calBinary = new CalcBinaryTree(binaryTree);

	}

	@Test
	public void retornoValorRaiz() {

		/* Inicializando um novo nó */
		int expected = 2;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(expected);

		CalcBinaryTree calBinary = new CalcBinaryTree(binaryTree);

		Assert.assertEquals(expected, calBinary.Soma());

	}

	@Test
	public void SomaArvoreEquilibrada() {

		/* Inicializando um novo nó */
		int expected = 6;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(2);

		BinaryTree binaryTree1 = new BinaryTree();
		binaryTree1.setValor(2);

		BinaryTree binaryTree2 = new BinaryTree();
		binaryTree2.setValor(2);

		binaryTree.setLeft(binaryTree1);
		binaryTree.setRight(binaryTree2);

		CalcBinaryTree calBinary = new CalcBinaryTree(binaryTree);

		Assert.assertEquals(expected, calBinary.Soma());

	}

	@Test
	public void SomaArvoreDesquilibrada() {

		/* Inicializando um novo nó */
		int expected = 34;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(15);

		BinaryTree binaryTree1 = new BinaryTree();
		binaryTree1.setValor(18);

		BinaryTree binaryTree2 = new BinaryTree();
		binaryTree2.setValor(1);

		binaryTree.setLeft(binaryTree1);
		binaryTree1.setLeft(binaryTree2);

		CalcBinaryTree calBinary = new CalcBinaryTree(binaryTree);

		Assert.assertEquals(expected, calBinary.Soma());

	}

}
