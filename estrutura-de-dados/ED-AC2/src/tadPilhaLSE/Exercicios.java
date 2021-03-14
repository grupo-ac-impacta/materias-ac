package tadPilhaLSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicios {
	public int checkOccurrences(char toFind, String str) {
		String p = String.format("[^\\%s]*\\%s", toFind, toFind);
		
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
		    count++;
		}
		
		return count;
	}
	
	public String checkDelimitersMathExpression(String expressao) {
		final NodeStack<Character> del = new NodeStack<Character>();
		Character[] possibilities = {'[', '{', '(', ')', '}', ']'};
		int[] possibilitiesQtd = {0, 0, 0, 0, 0, 0}; // quantidade de cada delimitador na string
		List<Character> allDelimetersRegistered = new ArrayList<Character>(); // todos delimitadores registrados 
		int qtdDelimiters = 0;
		
		// verifico a quantidade de cada delimitador
		for (int i = 0; i < possibilities.length; i++) {
			int qtd = checkOccurrences(possibilities[i], expressao);
			possibilitiesQtd[i] = qtd;
			qtdDelimiters += qtd;
		}
		
		// se não for par, a quantidade está errada...
		if(
			qtdDelimiters % 2 != 0 ||
			possibilitiesQtd[0] != possibilitiesQtd[5] || // []
			possibilitiesQtd[1] != possibilitiesQtd[4] || // {}
			possibilitiesQtd[2] != possibilitiesQtd[3] // ()
		) throw new QuantityDelimitersException("The number of delimiters is incorrect");
		
		for (int i = 0; i < expressao.length(); i++) {
			Character ch = expressao.charAt(i);
			 
			if(Arrays.asList(possibilities).contains(ch)) {
				del.push(ch);
				allDelimetersRegistered.add(ch);
			}
        }
		
		Map<Character, Character> combinations = Map.of(
			    '[', ']',
			    ']', '[',
			    '{', '}',
			    '}', '{',
			    '(', ')',
			    ')', '('
		);
		
		for (int i = 0; i < (allDelimetersRegistered.size() / 2); i++) {
			
			if(combinations.get(allDelimetersRegistered.get(i)) != 
			allDelimetersRegistered.get(allDelimetersRegistered.size() - (i + 1)))
				throw new WrongOrderDelimitersException("The order of delimiters is incorrect");
		}
		
		del.reverseStack();
		String result = del.toString();
		
		return result;
	}
}
