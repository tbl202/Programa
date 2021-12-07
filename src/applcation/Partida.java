package applcation;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

	Scanner sc = new Scanner(System.in);

	ArrayList<Pergunta> perguntas;
	Pergunta p;

	public Partida() {
		this.perguntas = new ArrayList<>();
		this.p = new Pergunta();
		p.loadPerguntas(perguntas);
	}

	public void mostrarPerguntas() {

		System.out.println("Pergunta: ");

	}

	public void setStatusPersonagem(Personagem p) {
		p.setStatus(true);
	}

	/* 
	metodo - inicializar jogo	chama os metodos em *
		* cadastrar Jogador 
		* mostrar MenuPersonagem
		* escolher Personagem
		* definirJogador
		* escolherPergunta
		* mostrar pergunta e alternativas
		* verificar acerto/erro
		* 
	
	metodo -  mostrarMenuInicial (inicializar jogo, desenvolvedores, sair)
		
	metodo - cadastrar jogador (pedir para usuario informar dados - nickname)

	metodo - mostrar MenuPersonagem

 	metodo - escolher Personagem (setar no Jogador o Personagem dele)

	metodo - definirJogador (Random para escolher quem começa o jogo)

	metodo - escolherPergunta (Random escolher uma pergunta na lista pergunta)

	metodo - mostrarPergunta e alternativas

	metodo - verificar Acerto ou Erro da questão (se errar chamar o metodo reduzir vida), passar a vez e verificar a vida pra saber se já acabou

	metodo - reduzir vida

	metodo - verificar vida (se n tem vida acaba o jogo e chama metodo definirVencedor)
	
	metodo - alternarJogador 
	
	metodo - definirVencedor
	 
	 */
	public void escolherPersonagem() { // colocar um try catch pra evitar escolha fora dos Personagem

		ArrayList<Personagem> pers = new ArrayList<>();
		ArrayList<String> hab = new ArrayList<>();

		hab.add("Força");
		hab.add("Velocidade");

		pers.add(new Personagem("Guerreiro", hab));
		pers.add(new Personagem("Arqueiro", hab));
		pers.add(new Personagem("Caçador", hab));
		pers.add(new Personagem("Mago", hab));

		System.out.println("Personagens: ");
		int cont = 1;
		for (Personagem pe : pers) {

			if (!pe.getStatus()) {
				System.out.println("[" + cont + "] " + pe.getName()); // Substituir por toString Personagem
			}
			cont++;
		}

		System.out.println("Escolha o Personagem 1:");
		int opcao = sc.nextInt();
		pers.get(opcao - 1).setStatus(true);

		System.out.println("Personagens: ");
		cont = 1;
		for (Personagem pe : pers) {

			if (!pe.getStatus()) {
				System.out.println("[" + cont + "] " + pe.getName()); // Substituir por toString Personagem
			}
			cont++;
		}

		System.out.println("Escolha o Personagem 2:");
		int opcao2 = sc.nextInt();
		pers.get(opcao2 - 1).setStatus(true);
	}

}
