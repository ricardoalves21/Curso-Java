package db;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Estudos {	
	
	// 1 - SOBRE INTERFACE PREDICATE EM JAVA
	
	// CRIANDO O METODO FILTRO
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		
		for (String s: lista) { // para cada elemento 's' dentro da lista
			if (condicao.test(s)) { // se a condi��o for atendida
				System.out.println(s); // imprima o elemento 's'
			}
		}
		
	}
	
	//METODO PRINCIPAL (MAIN)
	public static void main(String[] args) {
	
		// CRIANDO A VARIAVEL 'lista1' DO TIPO ARRAYLIST
		List<String> lista1 = Arrays.asList(
				"Ricardo", "Juliana", "Elias",
				"Lia", "Gleici", "Alex", "Rafael");
		
		System.out.println("Nomes que iniciam com a letra R");
		
		// CHAMANDO O METODO FILTRO ENVIANDO DOIS PARAMETROS
		//filtro(lista1, (s)->s.startsWith("R"));
		//filtro(lista1, (s)->s.length() > 3);
		filtro(lista1, (s)->s.endsWith("i"));
		
	}
	
	
	// 2 - TRANSFORMANDO STRING EM CHAR[] DE ARRAY
		
//        String str = "elias";
//        
//        char[] strArray = str.toCharArray();		
//        char ini = ' ';
//        char fim = ' ';
//        
//        for (int i = 0; i < strArray.length; i++) {        	
//        	if (i == 0) {		
//        		ini = strArray[0];
//        	} else if (i == strArray.length-1) {            		
//        		fim = strArray[i];	
//        		strArray[i] = ini;
//        		strArray[0] = fim;
//        	}
//        }        
//        
//    	for (int j = 0; j < strArray.length; j++) {
//    		System.out.print(strArray[j]);
//    	}

}

