package com.generention.genjobs.model;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cadastro implements Desenvolvedorr, Gestor, Dataa, DevOpss {
		
		
		int op;
		boolean error = true;//telefone cpf=aceita até 11 números
		boolean loop = true;//cep
		Scanner leia = new Scanner(System.in);
		public String nome;
		public String email;
		private float telefone;
		private String cpf;
		private int cep;
		private String cidade;
		private String endereco;
		{
			
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.cpf = cpf;
			this.cep = cep;
			this.cidade = cidade;
			this.endereco = endereco;
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getTelefone() {
			return telefone;
		}
		public void setTelefone(float telefone) {
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void visualizar() throws InterruptedException  {
			
			/*System.out.println("\t\tBem vindo a GenJobs, a plataforma de maior empregabilidade de tecnologia da turma 57.\n\n");
			System.out.println("\t\t\t\tGENJOBS");
			System.out.println("\n\n\nInforme seus dados cadastrais:");
			System.out.println("Nome:");
			this.nome = leia.nextLine();
			System.out.println("CPF: ");
			this.cpf = leia.nextLine();
			
			if(this.cpf.length()!=11)
			{
				do {	
					System.out.println("CPF inválido. Preencha apenas 11 números.");
						System.out.println("CPF: ");
							this.cpf = leia.nextLine();
								}while(this.cpf.length()!=11); }
				
			System.out.println("Insira seu endereço de email: ");
			this.email = leia.nextLine();
						
				
				do {	
					try {
						System.out.println("Telefone: ");
							this.telefone = leia.nextFloat();
								loop = false;
									
					}catch(java.util.InputMismatchException e) {
						System.err.println("Exceção: "+e);
						leia.nextLine();
						System.out.println("Digite apenas números. ");
					
					
					}
				}while(loop); 
						
				
				
				do {	
					try {
						System.out.println("CEP: ");
							this.cep = leia.nextInt();
								error = false;
										
					}catch(java.util.InputMismatchException e) {
						System.err.println("Exceção: "+e);
						leia.nextLine();
						System.out.println("Digite apenas números. ");
						
						
					}
				}while(error); 
								
				*/
				System.out.println("Endereço: ");
				this.endereco = leia.next();
				System.out.println("Cidade: ");
				this.cidade = leia.next();//não da a opção de escrita
				System.out.println(this.nome+", você será redirecionado....");
				TimeUnit.SECONDS.sleep(4);
			 }
		
		public void paginaInicial() {
			
		
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGEN JOBS, TRABALHANDO PARA VOCÊ TRABALHAR\n\n");
				System.out.println("A nossa plataforma é feita através do match entre você e os nossos colaboradores.\nResponda as perguntas abaixo.");
			
		}
		public void profissao() {
			do {
			System.out.println("\n Áreas de atuação");
		    System.out.println("\n1- Desenvolvimento (Full Stack, Front-end, Back-end)");
		    System.out.println("\n2- DevOps");
		    System.out.println("\n3- Data Science");
		    System.out.println("\n4- Gestão de projetos");
		    System.out.println("\nDigite a sua opção: ");

		           op = leia.nextInt();  
		            switch(op) {
		            
		            case 1: 
		            	System.out.println("\n Desenvolvimento (Full Stack, Front-end, Back-end)");
		                break; // finalizar cada case
		            
		         
		            case 2: 
		                System.out.println("\n DevOps");
		                break; 
		            		           
		            case 3: 
		                System.out.println("\n Data Science");
		                break; 
		      
		            case 4: 
		                System.out.println("\n Gestão de projetos");
		                break; 
		            		            
		            case 5: 
		                System.out.println("\n Outros");
		                break; 

		            // exceção: se meu usuário não retornar o que espero, retorno isso.
		            default:
		                System.out.println("\n Opção inválida");
		              
		            }
		            }while(op<1 || op>5);
		        }
		@Override
		public void dv() {
			
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("Atribuições DevOps:");
				System.out.println("\n ------------------------------------");
				System.out.println("Você preenche alguns dos atributos para o cargo?\n");
				System.out.println("Obs: mesmo se você não conhecer ainda esse tópico, não desanime! Continue estudando e se aprimorando continuamente.");
				System.out.println("\n\nConhecimento de metodologias ágeis, gerenciamento de conflitos, linguagem de programação e automação de processos.");
				System.out.println("\n1 - sim");
				System.out.println("\n2 - não\n");
				System.out.println("Digite sua opção: ");

				op = leia.nextInt();	
				switch (op) {
				
				case 1:
					System.out.println("sim");
					
					break;
				case 2:
					System.out.println("não");
					break;
				
				default:
		            System.out.println("\n Opção inválida");
		        
				}
				}while(op < 1 || op >2);
			}
			
				
				
				
			
		
		@Override
		public void datinha() { 
			
		do {
		System.out.println("\n ------------------------------------");
		System.out.println("Atribuições Data Science:");
		System.out.println("\n ------------------------------------");
		System.out.println("Você tem conhecimento da linguagem Python?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - não");
		System.out.println("Digite sua opção: ");
		
		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("não");
			break;
		
		default:
            System.out.println("\n Opção inválida");
		}
		}while(op < 1 || op >2);
	
		do {
		
		System.out.println("\nVocê tem habilidade de analisar dados matemáticos e estatísticas ?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - não");
		System.out.println("Digite sua opção: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("não");
			break;
		
		default:
            System.out.println("\n Opção inválida");
		}
		
		}while(op < 1 || op >2);
		
		do {
		
		System.out.println("\nVocê tem habilidade com banco de dados ?");
		System.out.println("\n1 - sim");
		System.out.println("\n2 - não");
		System.out.println("Digite sua opção: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("sim");
			
			break;
		case 2:
			System.out.println("não");
			break;
		
		default:
            System.out.println("\n Opção inválida");
		}
		}while(op < 1 || op >2);
}

		
		
		@Override 
		public void gp() {
		
			do {
			System.out.println("\n ------------------------------------");
			System.out.println("Nível de Inglês: ");
			System.out.println("\n ------------------------------------");
			System.out.println("\n1- Básico");
			System.out.println("\n2- Intermédiario");
			System.out.println("\n3- Avançado");
			System.out.println("\n4- Fluente");
			System.out.println("Digite sua opção: ");
			
			op = leia.nextInt();	
			switch (op) {
			
			case 1:
				System.out.println("Básico");
				
				break;
			case 2:
				System.out.println("Intermédiario");
				break;
			case 3:
				System.out.println("Avançado");
				break;
			case 4:
				System.out.println("Fluente\n");
				break;
			
				
			default:
	            System.out.println("\n Opção inválida");		
			
		}
			}while(op < 1 || op >4);
		}
		public void experienciaGp() {
		
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("Experiência profissional: ");
				System.out.println("\n ------------------------------------");
				System.out.println("\n1- 1 ano - 3 anos");
				System.out.println("\n2- 3 anos - 5 anos");
				System.out.println("\n3- 5 ano - 7 anos");
				System.out.println("\n4- 7 ano - 10 anos");
				System.out.println("\n5- Mais que 10 anos");
				System.out.println("\nDigite a sua opção: ");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println();
			
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println();
			break;
		case 5:
			System.out.println();
			break;
					
		default:
	        System.out.println("\n Opção inválida");
	}
			}while(op < 1 || op >2);
			}
		
		
		@Override
		public void desenvolver() {
		
			String Java;
			String JavaScript;
			String Phyton;
			String SQL;
			String PHP;
			String DataScience;
			

		}

		

		public void escolher() {
			do {
				System.out.println("\n ------------------------------------");
				System.out.println("VAGAS");
				System.out.println("\n ------------------------------------");
				System.out.println("Escolha a Linguagem de ProgramaÃ§Ã£o:");
				System.out.println("\n1- Java");
				System.out.println("\n2- JavaScript");
				System.out.println("\n3- Python");
				System.out.println("\n4- RUBY");
				System.out.println("\n5- PHP");
				System.out.println("\nDigite a sua opção: "); 

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("Java");
			
			break;
		case 2:
			System.out.println("JavaScript");
			break;
		case 3:
			System.out.println("Python");
			break;
		case 4:
			System.out.println("RUBY");
			break;
		case 5:
			System.out.println("PHP");
			break;
			
		
		default:
            System.out.println("\n Opção inválida");

		}
			}while(op < 1 || op >5);
		}	
		
		public void nivel() {
			do {
			System.out.println("\n ------------------------------------");
			System.out.println("Experiência profissional: ");
			System.out.println("\n ------------------------------------");
			System.out.println("\n1- Trainee");
			System.out.println("\n2- Júnior");
			System.out.println("\n3- Pleno");
			System.out.println("\n4- Sênior");
			System.out.println("\n5- Especialista");
			System.out.println("\nDigite a sua opção: ");

	op = leia.nextInt();	
	switch (op) {
	
	case 1:
		System.out.println("Trainee");
		
		break;
	case 2:
		System.out.println("Júnior");
		break;
	case 3:
		System.out.println("Pleno");
		break;
	case 4:
		System.out.println("Sênior");
		break;
	case 5:
		System.out.println("Especialista");
		break;
				
	default:
        System.out.println("\nOpção inválida");
}
			}while(op < 1 || op >5);
		}
		
		public void fim() {
			
			System.out.println("\n\nParabéns "+this.nome+", você foi cadastrado no nosso banco de dados. Boa sorte!!");
		}
		
}		

		

		
		
	

