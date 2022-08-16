package com.generention.genjobs.model;

public class Desenvolvedor extends Cadastro  {
	
	private String Java;
	private String JavaScript;
	private String Python;
	private String SQL;
	private String PHP;
	private String DataScience;

public Desenvolvedor(String java, String javaScript, String python, String sQL, String pHP, String dataScience) {
	
		Java = java;
		JavaScript = javaScript;
		Python = python;
		SQL = sQL;
		PHP = pHP;
		DataScience = dataScience;
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
	return Python;
}

public void setPhyton(String python) {
	Python = python;
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

public void conferir() {
		System.out.println("\n ------------------------------------");
		System.out.println("VAGAS");
		System.out.println("\n ------------------------------------");
		System.out.println("Escolha a Linguagem de Programação:");
		System.out.println(""+this.Java);
		System.out.println(""+this.JavaScript);
		System.out.println(""+this.Python);
		System.out.println(""+this.SQL);
		System.out.println("" + this.PHP);
		System.out.println(""+this.DataScience);

	}

}