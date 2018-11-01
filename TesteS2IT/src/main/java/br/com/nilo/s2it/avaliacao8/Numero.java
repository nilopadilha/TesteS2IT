package br.com.nilo.s2it.avaliacao8;

public class Numero {

	public Integer c(int a, int b) {

		StringBuilder armaz = new StringBuilder();

		char[] listarNumerosA = Integer.valueOf(a).toString().toCharArray();
		char[] listarNumerosB = Integer.valueOf(b).toString().toCharArray();

		int max = listarNumerosA.length >= listarNumerosB.length ? listarNumerosA.length : listarNumerosB.length;

		for (int i = 0; i < max; i++) {

			if (listarNumerosA.length > i) {
				armaz.append(listarNumerosA[i]);
			}

			if (listarNumerosB.length > i) {
				armaz.append(listarNumerosB[i]);
			}
		}

		Integer listaNumerosMesclados = Integer.valueOf(armaz.toString());

		if (listaNumerosMesclados > 1000000) {
			return -1;
		}

		return listaNumerosMesclados;
	}
}
