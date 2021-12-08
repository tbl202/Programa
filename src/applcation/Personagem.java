package applcation;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

	private String name;
	private List<String> habilidades;
	// false ñ escolhido
	// true escolhido
	private boolean status;
	private Integer tempoDeVida;

	public Personagem(String name) {
		this.name = name;
		loadHabilidades();
		this.status = false;
		this.tempoDeVida = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Metódo que vai me dar a ação da habilidades com if
	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getTempoDeVida() {
		return tempoDeVida;
	}

	public void setTempoDeVida(Integer tempoDeVida) {
		this.tempoDeVida = tempoDeVida;
	}

	public void loadHabilidades() {

		List<String> hab = new ArrayList<>();

		hab.add("Força");
		hab.add("Velocidade");
		hab.add("Cura");
		hab.add("Poison");
		hab.add("Tempo");

		this.habilidades = hab;
	}

	public String toString() {
		return "Nome: " + name + ", Habilidades: " + this.habilidades.toString();
	}

}
