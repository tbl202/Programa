package applcation;

import java.util.List;

public class Jogador {

	// STATUS SERVE PRA DECIDIR A VEZ DE QUEM VAI JOGAR NA PARTIDA
	// TRUE SIGNIFICA QUE E SEU TURNO
	private String nome;
	private Personagem personagem;
	private boolean status = false;

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

	public void setPersonagem(int opcao, List<Personagem> list) {

		// NO METODO ESCOLHERPERSONAGEM NA PARTIDA E CRIADO UMA LISTA PERSONAGEM
		// O METODO SETPERSONAGEM PEGA E SETA O ELEMENTO QUE ESTA NA POSICAO opcao
		// E DEFINI QUE O JOGADOR DA LISTJ TENHA ESSE PERSONAGEM COMO SEU
		this.personagem = list.get(opcao);

	}
	
	public String toStringWinner() {
		
		return "Jogador - \"" + getNome();
		
	}

	public String toString() {

		// toString PRA QUANDO JOGADOR N TIVER ESCOLHIDO PERSONAGEM OU TIVER
		if (personagem == null) {
			return "Nome - " + getNome();
		} else {
			return "Jogador - \"" + getNome() + "\", Personagem - " + personagem.toString();
		}
	}
	
	public String toStringV() {
		
		//PRINTAR O JOGADOR E SUA VIDA
		return "Jogador - \"" + getNome() + "\", Vida - " + personagem.getVida();
		
	}

}
