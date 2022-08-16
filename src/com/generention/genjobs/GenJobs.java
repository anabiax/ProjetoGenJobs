package com.generention.genjobs;

import com.generention.genjobs.model.Cadastro;


public class GenJobs extends Cadastro  {

	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro(); 
		c1.visualizar();
		c1.paginaInicial();
		c1.profissao();
		c1.escolher();
		c1.nivel();
		
		
	}

}