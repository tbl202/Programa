package applcation;

import java.util.ArrayList;

public class Personagem {

	private String name;
	private ArrayList<String> habilidades;
	// false ñ escolhido
	// true escolhido
	private boolean status;
	private int tempoDeVida;

	public Personagem(String name, ArrayList<String> habilidades) {
		this.name = name;
		this.habilidades = habilidades;
		this.status = false;
		this.tempoDeVida = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getTempoDeVida() {
		return tempoDeVida;
	}

	public void setTempoDeVida(int tempoDeVida) {
		this.tempoDeVida = tempoDeVida;
	}

}
