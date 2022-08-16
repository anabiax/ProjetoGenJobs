package com.generention.genjobs.model;

public class Desenvolvedor extends Cadastro {
	int op;

	
	public int getOp() {
		return op;
	}


	public void setOp(int op) {
		this.op = op;
	}


	public Desenvolvedor(int op) {
		super();
		this.op = op;
	}


	public void vozesDaAna() {
		System.out.println("Desenvolvedor Java, faremos algumas perguntas para saber qual vaga se encaixa em seu perfil.");
		System.out.println("-----Opções-----");
		System.out.println("\n1- Front end");
		System.out.println("\n2- Back end");
		System.out.println("\n3- Full Stack");
		
		 op = leia.nextInt();  // o tipo de dados é Int(eiro)
         switch(op) {
         case 1: 
             System.out.println("\nFull Stack");
             break; // finalizar cada case
         

      
         case 2: 
             System.out.println("\nFront-end");
             break; 
         
        
         case 3: 
             System.out.println("\nBack-end");
             break; 
   
         
         default:
             System.out.println("\n Opção inválida");
		
         }
	
	}
	
}
