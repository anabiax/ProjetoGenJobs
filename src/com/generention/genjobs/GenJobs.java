package com.generention.genjobs;

import java.util.concurrent.TimeUnit;

import com.generention.genjobs.model.Cadastro;
import com.generention.genjobs.model.Desenvolvedor;

public class GenJobs {

	public static void main(String[] args) throws InterruptedException {
		
		Cadastro c1 = new Cadastro(); 
		c1.visualizar();
		//TimeUnit.SECONDS.sleep(5);
		c1.paginaInicial();
		c1.profissao();
		
		
	}
	
}
