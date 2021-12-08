package applcation;

import java.util.List;
import java.util.Objects;

public class Jogador {

	private String nome;
	private Personagem personagem;

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

		List<Personagem> listTemporaria;
		listTemporaria = list;
		Personagem p = listTemporaria.get(opcao);
		this.personagem = p; // mesma coisa que this.personagem = Personagem[opcao], caso fosse
														// um Array do tipo Personagem

	}

	public String toString() {

		if (personagem == null) {
			return "Nome - " + getNome();
		} else {
			return "Nome - " + getNome() + ", Personagem - " + getPersonagem();
		}

	}

}
