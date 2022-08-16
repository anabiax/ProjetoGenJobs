package com.generention.genjobs.model;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cadastro implements Desenvolvedorr, Gestor, Dataa, DevOpss {
		
		private static String Java = null;
		private static String JavaScript = null;
		private static  String Phyton = null;
		private static  String SQL = null;
		private static  String PHP = null;
		private static String DataScience = null;
		int op;
		boolean loop = true;
		Scanner leia = new Scanner(System.in);
		public String nome;
		public String email;
		private float telefone;
		private String cpf;
		private int cep;
		private String cidade;
		private String endereco;
		private double teste;
		private String emailTeste;
		public Cadastro() {
			
			this.teste = teste;
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
		
		public void visualizar()  {
			
			/*System.out.println("\t\tBem vindo a GenJobs, a plataforma de maior empregabilidade de tecnologia da turma 57.\n\n");
			System.out.println("\t\t\t\tGENJOBS");
			System.out.println("\n\n\nInforme seus dados cadastrais:");
			System.out.println("Nome:");
			this.nome = leia.nextLine();
			System.out.println("CPF: ");
			this.cpf = leia.nextLine();
			
			
				
			
			if(this.cpf.length()!=2) {
				System.out.println("CPF inválido. Digite novamente");
				System.out.println("CPF: ");
			
			}	else{ 
				System.out.println("Insira seu endereço de email: ");
				this.email = leia.nextLine();
				this.cpf = leia.nextLine();//exceção do pq não aceitar o erro na digitação de letra e números maiores que 12.
				loop = true;
			}
					
				
				
				
				System.out.println("Telefone:");
				this.telefone = leia.nextFloat();
				System.out.println("CEP: ");
				this.cep = leia.nextInt();
				System.out.println("Endereço: ");
				this.endereco = leia.next();*/
				System.out.println("Cidade: ");
				this.cidade = leia.nextLine();//não da a opção de escrita
				System.out.println(this.nome+", você será redirecionado....");
				
				
			
			
				
			 }
		
		
		public void paginaInicial() {
			
		
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nGEN JOBS, TRABALHANDO PARA VOCÊ TRABALHAR\n\n");
			System.out.println("A nossa plataforma é feita através do match entre você e os nossos colaboradores.\nResponda as perguntas abaixo.");
			
		}
		public void profissao() {
			System.out.println("\n Áreas de atuação");
		    System.out.println("\n1- Desenvolvimento (Full Stack, Front-end, Back-end");
		    System.out.println("\n2- DevOps");
		    System.out.println("\n3- Data Science");
		    System.out.println("\n4- Gestão de projetos");
		    System.out.println("\n5- Outros");
		    System.out.println("\n Digite a sua opção: ");

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
		        }
		@Override
		public void dv() {
			
			
		}
		@Override
		public void datinha() {
		
			
		}
		@Override
		public void gp() {
			
			
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

		public String getJava() {
			return Java;
		}


		public void setJava(String java) {
			Java = java;
		}

		public String getJavaScript() {
			return JavaScript;
		}


		public void setJavaScript(String javaScript) {
			JavaScript = javaScript;
		}


		public String getPhyton() {
			return Phyton;
		}

		public void setPhyton(String phyton) {
			Phyton = phyton;
		}


		public String getSQL() {
			return SQL;
		}


		public void setSQL(String sQL) {
			SQL = sQL;
		}


		public String getPHP() {
			return PHP;
		}


		public void setPHP(String pHP) {
			PHP = pHP;
		}


		public String getDataScience() {
			return DataScience;
		}


		public void setDataScience(String dataScience) {
			DataScience = dataScience;
		}

		public void escolher() {
				System.out.println("\n ------------------------------------");
				System.out.println("VAGAS");
				System.out.println("\n ------------------------------------");
				System.out.println("Escolha a Linguagem de ProgramaÃ§Ã£o:");
				System.out.println("\n1- Java");
				System.out.println("\n2- JavaScript");
				System.out.println("\n3- Python");
				System.out.println("\n4- SQL");
				System.out.println("\n5- PHP");
				System.out.println("\n6 -DataScience");

		op = leia.nextInt();	
		switch (op) {
		
		case 1:
			System.out.println("Java");
			
			break;
		case 2:
			System.out.println("JavaScript");
			break;
		case 3:
			System.out.println("Phyton");
			break;
		case 4:
			System.out.println("SQL");
			break;
		case 5:
			System.out.println("PHP");
			break;
			
		case 6:
			System.out.println("DataScience");
			break;
			
		default:
            System.out.println("\n Opção inválida");

		}
		}	
		
		public void nivel() {
			System.out.println("\n ------------------------------------");
			System.out.println("Experiência profissional: ");
			System.out.println("\n ------------------------------------");
			System.out.println("\n1- Trainee");
			System.out.println("\n2- Júnior");
			System.out.println("\n3- Pleno");
			System.out.println("\n4- Sênior");
			System.out.println("\n5- Especialista");
			

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
        System.out.println("\n Opção inválida");
}
		}
		
}		

		
		
		
		
	

