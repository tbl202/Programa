package applcation;

import java.util.List;

public class Jogador {

	private String nome;
	private Personagem personagem;	
	
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

	public void setPersonagem(int opcao, List<Personagem> list) {
		
		List<Personagem> listTemporaria;
		listTemporaria = list;
		opcao--;		
		this.personagem = listTemporaria.get(opcao); // mesma coisa que this.personagem = Personagem[opcao], caso fosse um Array do tipo Personagem
		
	}

	public String toString() {
		return "Nome" + nome + "\nPersonagem: " + personagem;
	}

}
