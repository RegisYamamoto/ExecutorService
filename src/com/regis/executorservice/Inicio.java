package com.regis.executorservice;

import com.regis.executorservice.service.PessoaService;

public class Inicio {

	public static void main(String[] args) {
		
		PessoaService pessoaService = new PessoaService();
		pessoaService.criarListas();
		
	}

}
