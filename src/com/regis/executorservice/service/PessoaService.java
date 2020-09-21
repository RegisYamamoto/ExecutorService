package com.regis.executorservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PessoaService {

	public void criarListas() {
		try {
			System.out.println("---------- Iniciou o programa ----------");
			
			List<String> nomes1 = Arrays.asList("Pedro", "Douglas");
			List<String> nomes2 = Arrays.asList("Ana", "Gabriel");
			List<String> nomes3 = Arrays.asList("Valéria", "Paulo");
			
			
			// Montar e excutar as threads
			ExecutorService executor = Executors.newFixedThreadPool(3);
			
			Runnable r1 = () -> imprimirLista(nomes1);
			Runnable r2 = () -> imprimirLista(nomes2);
			Runnable r3 = () -> imprimirLista(nomes3);
			
			executor.execute(r1);
			executor.execute(r2);
			executor.execute(r3);
		
			executor.shutdown();
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);

			System.out.println("---------- Terminou o programa ----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void imprimirLista(List<String> nomes) {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(nomes);
		}
	}
	
}
