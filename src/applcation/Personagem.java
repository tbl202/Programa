package applcation;

import java.util.Arrays;
import java.util.List;

public class Personagem {

	private String name;
	private List<String> habilidades;
	// false ñ escolhido
	// true escolhido
	private boolean status;
	private Integer vida;

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
		this.vida = vida;
	}

	public void loadHabilidades() {

		List<String> hab = Arrays.asList(
				"Força", "Velocidade", "Cura", "Poison", "Tempo"
				);				

		this.habilidades = hab;
	}

	public String toString() {
		if (habilidades == null) {
			return name;
		} else {
			return name + ", Habilidades: " + habilidades.get(0) + ", " + habilidades.get(1) 
			+ ", " + habilidades.get(2) + ", " + habilidades.get(3) + ", " + habilidades.get(4) ;
			
			
			
			
			
		}
	}

}
