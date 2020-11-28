package servicos;

import java.util.List;

public class CalcularServico {

	public static <Tipo extends Comparable<? super Tipo>> Tipo max(List<Tipo> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista est� vazia");
		}
		Tipo max =list.get(0);
		for(Tipo item:list) {
			if(item.compareTo(max)>0) {//A compara��o vai retornar um n�mero inteiro maior que zero se for verdadeira
				max=item;
			}
		}
		
		return max;
	}
	

}
