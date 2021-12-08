package applcation;

import java.util.ArrayList;
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

	public void setAlternativas(Alternativa a) {
		alternativas.add(a);
	}

	public String toString() {
		return "Pergunta: " + this.enunciado + this.alternativas;

	}

	public void loadPerguntas(List<Pergunta> perguntas) {
		
		//Completar com as perguntas
		
		int n = 10;

		Pergunta p = new Pergunta();

		p.setEnunciado("Na orientação a Objetos, o que significa usar private antes de um campo?");
		Alternativa a = new Alternativa("permite que uma calsse externa acesse diretamente o campo", false);
		Alternativa b = new Alternativa("permite que uma calsse acesse diretamente o campo", true);
		p.setAlternativas(a);
		p.setAlternativas(b);

		Pergunta p1 = new Pergunta();

		p1.setEnunciado("São os princípios da OO, exceto:");
		Alternativa a1 = new Alternativa("Classe", true);
		Alternativa b1 = new Alternativa("Abstração", false);
		Alternativa c1 = new Alternativa("Polimorfismo", false);
		Alternativa d1 = new Alternativa("Herança", false);
		p1.setAlternativas(a1);
		p1.setAlternativas(b1);
		p1.setAlternativas(c1);
		p1.setAlternativas(d1);

		for (int i = 0; i < n; i++) {
			perguntas.add(p);
		}

	}

}
