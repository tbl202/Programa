package applcation;

import java.util.Arrays;
import java.util.List;

public class Personagem {

	private String name;
	private List<String> habilidades;
	// false ñ escolhido
	// true escolhido
	private boolean status;
	private int vida;
	private String habilidade;

	public Personagem(String name) {
		this.name = name;
		loadHabilidades();
		this.status = false;
		this.vida = 100;
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

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		// USADO NO RESPOSTAJOGADOR() DENTRO DE PARTIDA
		// SUBTRAI A VIDA ATUAL PELA QUANTIDADE PASSADA (25)
		this.vida -= vida;
	}
	
	public String getHabilidade() {		
		return habilidade;		
	}
	

	public void setHabilidade(int opcao) {

		// METODO PRA ESCOLHER A HABILIDADE QUE VAI SER PERTINENTE AO PERSONAGEM
		// VAI DELETAR A LISTA HABILIDADES NO SEU FINAL PRA TER SOMENTE 1 HABILIDADE
		// PERTENCENTE AO PERSONAGEM
		opcao--;
		this.habilidade = habilidades.get(opcao);
		
	}
	
	public void loadHabilidades() {

		// ADICIONA AS HABILIDADES NA LISTA
		habilidades = Arrays.asList("Espelho", "Joker", "Cura", "Shield", "Time Skip");

	}

	public String toStringH() {

		return "---Habilidades---" + "\n[1]  " + habilidades.get(0) + "\n[2]  " + habilidades.get(1) + "\n[3]  "
				+ habilidades.get(2) + "\n[4]  " + habilidades.get(3) + "\n[5]  " + habilidades.get(4);

	}

	public String toString() {

		if (habilidade != null) {
			return name + " [ " + getHabilidade() + "]";
		}
		
		else {return name;}

	}



}
