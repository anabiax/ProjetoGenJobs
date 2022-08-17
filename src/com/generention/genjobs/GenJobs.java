package com.generention.genjobs;

import java.util.concurrent.TimeUnit;

import com.generention.genjobs.model.Cadastro;


public class GenJobs extends Cadastro  {

	public static void main(String[] args)   {
		
		Cadastro c1 = new Cadastro(); 
		
		//c1.visualizar();
		//c1.paginaInicial();
        c1.profissao();

       // desenvolvedor temporizador colocar nas mensagens
        //c1.escolher();
        //c1.nivel();
        //c1.fim();

        //devops
       // c1.dv();
       // c1.nivel();
       // c1.fim();
        
        //datinha
        //c1.datinha();
        //c1.nivel();
       // c1.fim();
        
        // gp
        c1.gp();
        c1.experienciaGp();
        c1.fim();
		 
		
		
		
	}

}