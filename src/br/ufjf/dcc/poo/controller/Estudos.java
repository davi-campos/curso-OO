package br.ufjf.dcc.poo.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Estudos {
	
	public static void main(String[] args) {
		// cria uma nova instancia de HashMap		
		HashMap<String, Integer> cidadesHabitantes = new HashMap();
		
		//vamos adicionar algumas cidades e seus valores
		cidadesHabitantes.put("Goiânia", 4334598);
		cidadesHabitantes.put("São Paulo", 49282768);
		cidadesHabitantes.put("Brasilia", 96736887);
		
		//vamos obter uma view dos mapeamentos
		Set set = cidadesHabitantes.entrySet();
		
		//obtemos um iterador
		Iterator i = set.iterator();
		
		//e finalmente exibimos todas as chaves e seus valores
		while(i.hasNext()) {
			Map.Entry entrada = (Map.Entry)i.next();
			System.out.println("Chave: "+ entrada.getKey()
			+" - Valor: "+ entrada.getValue());
		}
		
		

	}

}
