package applcation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pergunta {

	private String enunciado;
	private List<Alternativa> alternativas;

	public Pergunta() {
		this.alternativas = new ArrayList<>();
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<Alternativa> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}

	public void setAlternativas(String a) {

		Alternativa b = new Alternativa(a);
		alternativas.add(b);

	}

	private void setAlternativas(String a, boolean x) {

		Alternativa b = new Alternativa(a, x);
		alternativas.add(b);

	}

	public void loadPerguntas(List<Pergunta> perguntas) {

		perguntas = Arrays.asList(

				// 1 -
				criarObjPrgt(
						"Um modelo ________ descreve um banco de dados em termos de tabelas, colunas e junções entre tabelas.",
						"Relacional", "Orientado a Objetos", "De rede", "Hierárquico", "Relacional"),

				// 2 -
				criarObjPrgt("Um(a) ______ é uma coleção de registro", "tabela", "campo", "tabela", "coluna", "linha"),

				// 3 -
				criarObjPrgt("Que símbolo é usado para mostrar que um determinado atributo é obrigatório?", "*", "o",
						"*", "&", "#"),

				// 4 -
				criarObjPrgt(
						"Na notação UML, uma técnica que utiliza uma ferramenta que identifica o tipo de interação, \nrepresentado por elipses e os agentes envolvidos, representados por bonecos é conhecida por:",
						"Diagrama de Casos de Uso", "Diagrama de Contexto", "Diagrama de Entidades",
						"Diagrama de Casos de Uso", "Diagrama de Fluxo de Dados"),

				// 5 -
				criarObjPrgt(
						"Os(as) ___ são usadas para enteder os processos de negócios, bem como a natureza, a função,\ne o escopo de dados.",
						"regras de negócios", "regras de negócios", "metas", "processos", "declarações de missão"),

				// 6 -
				criarObjPrgt(
						"Qual é o princípio pelo qual duas ou mais classes \nderivadas da mesma superclasse podem invocar métodos \nque têm a mesma assinatura, mas comportamentos distintos.",
						"Polimorfismo", "Herança", "Agregação", "Composição", "Polimorfismo"),

				// 7 -
				criarObjPrgt("Um Construtor para uma classe chamada Player em Java seria", "Player()", "Jogador()",
						"Pessoa()", "Jogador1()", "Player()"),

				// 8 -
				criarObjPrgt(
						"Para que os atributos de uma classe Pai possam ser acessados somente por ela mesma \ne as classes que a Herdarem, o modificador de acesso que deve ser usado é:",
						"Private", "Private", "Public", "Protected", "Static"),

				// 9 -
				criarObjPrgt(
						"Uma classe que não é instanciada e apenas fornece um modelo para geração\nde outras classes é denominada",
						"Classe Abstrata", "Subclasse", "Classe Construtora", "Classe Sobrescritas", "Classe Abstrata"),

				// 10 -
				criarObjPrgt("Os quatro pilares do paradigma de Orientação a Objetos são:",
						"Abstração, Encapsulamento, Herança\ne Polimorfismo.",
						"Sequenciamento, Procedimentos, Bibliotes e Heranças.",
						"Herança, Polimorfismo, Classes e Objetos.", "Classes, Atributos, Métodos e Abstração.",
						"Abstração, Encapsulamento, Herança e Polimorfismo.")

		);

	}

	public Pergunta criarObjPrgt(String questao, String resp_C, String a, String b, String c, String d) {

		Pergunta p = new Pergunta();

		p.setEnunciado(questao);

		String[] str = { a, b, c, d };

		for (String s : str) {

			if (resp_C.equals(s)) {
				p.setAlternativas(s, true);
			} else {
				p.setAlternativas(s);
			}
			
		}

		return p;

	}

	public String toString() {

		return "Enunciado: " + getEnunciado() 
			+ "\n1) " + alternativas.get(0).toString() 
			+ "\n2) " + alternativas.get(1).toString() 
			+ "\n3) " + alternativas.get(2).toString()
			+ "\n4) " + alternativas.get(3).toString();

	}

}
