package applcation;

import java.util.List;
import java.util.Objects;

public class Jogador {

	private String nome;
	private Personagem personagem;
	private boolean status = false; // true é sua vez de jogar

	public Jogador() {
	}

	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Personagem getPersonagem() {
		return personagem;
	}	

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(nome, other.nome);
	}

	public void setPersonagem(int opcao, List<Personagem> list) {

		this.personagem = list.get(opcao);

	}

	public String toString() {

		if (personagem == null) {
			return "Nome - " + getNome();
		} else {
			return "Jogador - \"" + getNome() + "\", Personagem - " + getPersonagem();
		}

	}

}
