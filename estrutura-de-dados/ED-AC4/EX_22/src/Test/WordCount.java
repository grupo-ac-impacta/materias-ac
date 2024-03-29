package Test;

import java.io.IOException;

import java.util.Scanner;

import Interface.Entry;

import HashTableMap.HashTableMap;

// Um programa que conta palavras em um documento, imprimindo a mais frequente.

public class WordCount {

	public static void main(String[] args) throws IOException {

		String texto = "O Brasil, um vasto pais sul-americano, estende-se da Bacia Amazonica, no norte, ate os vinhedos "

				+ "e as gigantescas Cataratas do Iguacu, no sul. O Rio de Janeiro, simbolizado pela sua estatua de 38 metros de altura "

				+ "do Cristo Redentor, situada no topo do Corcovado, e famoso pelas movimentadas praias de Copacabana e Ipanema, "

				+ "bem como pelo imenso e animado Carnaval, com desfiles de carros alegoricos, fantasias extravagantes e samba.\r\n"

				+ "O Brasil e um pais localizado no subcontinente da America do Sul. O territorio brasileiro e banhado pelo oceano "

				+ "Atlantico, limitando-se ao norte, com a Guiana Francesa, Suriname, Guiana, Venezuela e Colombia; a noroeste, "

				+ "com o Peru; a oeste, com a Bolivia, Paraguai e Argentina; e ao sul, com o Uruguai. O Brasil � lindo";

		Scanner doc = new Scanner(texto);

		doc.useDelimiter("[^a-zA-Z]"); // ignora caracteres que n�o s�o letras

		HashTableMap<String, Integer> h = new HashTableMap<String, Integer>();

		String word;

		Integer count;

		while (doc.hasNext()) {

			word = doc.next();

			if (word.equals(""))
				continue; // ignora strings nulas entre delimitadores

			if (word.length() <= 3)
				continue; // ignora letras com 3 ou menos caracteres

			word = word.toLowerCase(); // ignora mai�scula e min�scula

			count = h.get(word); // pega o contador anterior e conta com esta palavra

			if (count == null)
				h.put(word, 1); // autoboxing permite isso

			else
				h.put(word, ++count); // autoboxing/unboxing permite isso

		}

	}

}