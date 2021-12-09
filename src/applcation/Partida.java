package applcation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Partida {

	// Necessário implementar uns try catch nos metódos em que o Scanner é
	// utilizado, evitando a entrada de dados incorretamente
	Scanner sc = new Scanner(System.in);

	List<Jogador> listJ = null;
	List<Pergunta> perguntas = null;
	Pergunta p = null;

	public Partida() {
		this.perguntas = new ArrayList<>();
		this.listJ = new ArrayList<>();
		this.p = new Pergunta();
		perguntas = p.loadPerguntas();
	}

	/*
	 * metodo - inicializar jogo chama os metodos em * cadastrar Jogador mostrar
	 * MenuPersonagem escolher Personagem definirJogador escolherPergunta mostrar
	 * pergunta e alternativas verificar acerto/erro
	 * 
	 * 
	 * metodo - mostrarMenuInicial (inicializar jogo, desenvolvedores, sair)
	 * 
	 * metodo - cadastrar jogador (pedir para usuario informar dados - nickname)
	 * 
	 * metodo - mostrar MenuPersonagem
	 * 
	 * metodo - escolher Personagem (setar no Jogador o Personagem dele)
	 * 
	 * metodo - definirJogador (Random para escolher quem começa o jogo)
	 * 
	 * metodo - escolherPergunta (Random escolher uma pergunta na lista pergunta)
	 * 
	 * metodo - mostrarPergunta e alternativas
	 * 
	 * metodo - verificar Acerto ou Erro da questão (se errar chamar o metodo
	 * reduzir vida), passar a vez e verificar a vida pra saber se já acabou
	 * 
	 * metodo - reduzir vida
	 * 
	 * metodo - verificar vida (se n tem vida acaba o jogo e chama metodo
	 * definirVencedor)
	 * 
	 * metodo - alternarJogador
	 * 
	 * metodo - definirVencedor
	 * 
	 */

	// Falta a linha final
	public void mostrarMenuInicial() {

		clearConsole();

		System.out.println("[1] Inicializar Jogo");
		System.out.println("[2] Desenvolvedor");
		System.out.println("[3] Explicação do Jogo");
		System.out.println("[4] Sair");
		System.out.print("Informe sua escolha: ");
		int opcao = sc.nextInt();

		while (opcao > 4 || opcao < 1) {
			System.out.println("Dados invalidos. Tente outra vez.");
			System.out.print("Informe sua escolha: ");
			opcao = sc.nextInt();
		}

		if (opcao == 3) {
			explicacaoJogo();
		} else if (opcao == 2) {
			mostrarDesenvolvedores();
		} else if (opcao == 4) {
			System.exit(0);
		} else {
			start();
		}

	}

	private void explicacaoJogo() {

		int x = 0;
		while (x != 1) {
			clearConsole();
			System.out.println(
					"O Jogo é um quiz, no qual 2 jogadores jogarão alternando seu turno, acertando ou errando as perguntas");
			System.out.println(
					"Você possuiu habilidades, no entanto, só pode escolher 1 pra usar durante a partida.\nApós isso, não terá mais nenhuma habilidade pro resto do jogo ");
			System.out.println("Perde quem Zerar (0) a vida primeiro");
			System.out.println("[1] Voltar");
			System.out.print("Escolha: ");

			x = sc.nextInt();
		}

		mostrarMenuInicial();
	}

	public void mostrarDesenvolvedores() {

		int x = 0;
		while (x != 1) {
			clearConsole();

			System.out.println("Desenvolvedores: ");
			System.out.println(". Arthur Gabriel Fernandes de Oliveira");
			System.out.println(". Arthur Latini");
			System.out.println(". Danilo Jorge da Silva");
			System.out.println(". Renato Henrique Lopes da Silva");
			System.out.println("[1] Voltar");
			System.out.print("Escolha: ");

			x = sc.nextInt();
		}

		mostrarMenuInicial();
	}

	public void start() {
		// Metódo que inicia a partida
		// OBS : ler os comentários acima para mais detalhes

		// 1 - Cadastrar Jogadores
		cadastroJogador();
		// 2/3 - Mostrar menu Personagem Escolher Personagem
		escolherPersonagem(); // dps implementar a seleção do poder aqui
		// 4 - DefinirJogador (quem começa a partida)
		definirJogador(); // seta o status de um elemento do ListJ pra true
		// 5/6 - escolherPergunta, Mostrar Pergunta e alternativas
		p = mostrarPergunta();
		// 7 - Verificar Acerto e Erro

		// o 5/6 e o 7 vao ficar num while que vai ter como verificação olhar se algum
		// dos Jogadores em listJ tem a vida == 0
	}

	public Pergunta mostrarPergunta() {

		Random random = new Random();
		Pergunta p = this.perguntas.get(random.nextInt(perguntas.size()));
		p.toString();
		return p;

	}

	public void definirJogador() {

		// RANDOZIMA UM JOGADOR NA LISTJ, E TORNA SEU STATUS = TRUE
		// PERSONAGENS COM STATUS = TRUE ESTAO NA VEZ DE JOGAR
		Random random = new Random();

		listJ.get(random.nextInt(listJ.size())).setStatus(true);

	}

	public void cadastroJogador() {

		if (listJ.size() != 0) {
			listJ.clear();
		}

		// clearConsole();

		sc.nextLine(); // Limpar buffer

		for (int i = 1; i < 3; i++) {

			System.out.print(i + "°" + " Jogador escolha seu nome: ");
			String nome = sc.nextLine();

			// METODO PRA VERIFICAR SE O NOME ESCOLHIDO JA ESTÁ EM USO
			while (isExist(listJ, nome)) {
				System.out.printf("\nNome já em uso. Tente outro: ");
				nome = sc.nextLine();
			}

			// ADICIONA UM JOGADOR NA LISTAJ COM O NOME ESCOLHIDO
			listJ.add(new Jogador(nome));

		}

		System.out.println("-------------------");

		for (Jogador jgd : listJ) {
			System.out.printf("\nJogadores cadastrados: " + jgd);
		}

	}

	public static boolean isExist(List<Jogador> list, String nome) {

		boolean result = false;

		for (Jogador jogador : list) {

			// COMPARA O NOME NA LISTA COM O NOME PASSADO, FUNCIONA PQ TA EM UM FOREACH
			if (jogador.getNome().equals(nome)) {
				result = true;
			}

		}

		// TRUE - NOME EM USO, FALSE - NOME DISPONIVEL
		return result;

	}

	// ESSE METÓDO SÓ FUNCIONA SE EXECUTADO DEPOIS DO CADASTRO JOGADOR FOR
	// COMPLETADO
	public void escolherPersonagem() {

		// CRIA UMA LISTA PERSONAGEM QUE VAI SER USADA SOMENTE NESSE METÓDO
		List<Personagem> listTemporaria = Arrays.asList(

				new Personagem("Guerreiro"), new Personagem("Arqueiro"), new Personagem("Caçador"),
				new Personagem("Mago"), new Personagem("Silvio Santos")

		);

		Integer opcao;

		sc.nextLine(); // LIMPAR BUFFER

		for (int i = 0; i < listJ.size(); i++) {

			System.out.println("\nJogador \"" + listJ.get(i).getNome() + "\" escolha seu Personagem: ");

			int cont = 1;
			for (Personagem pers : listTemporaria) {

				// PERSONAGEM COM STATUS = TRUE FORAM SELECIONADOS, ESSE IF SÓ MOSTRA
				// PERSONAGENS NA LISTA
				// COM STATUS = FALSE (DISPONIVEL)
				if (!pers.getStatus()) {
					System.out.println("[" + cont + "] " + "Nome: " + pers.toString());

				}

				cont++;

			}

			// COMO Ñ CONSEGUI REMOVER O PERSONAGEM DA LISTA PERSONAGEM ESSE DO/WHILE
			// GARANTE QUE UM PERSONAGEM QUE TEM O STATUS TRUE NÃO APAREÇA
			// E IMPEDE O USUÁRIO DE SELECIONALO COM A 3 CONDICAO
			do {

				System.out.print("\nPersonagens já escolhidos não podem ser escolhido de novo.");
				System.out.print("\nEscolha (1 - 5): ");
				opcao = sc.nextInt();
				opcao--;

			} while (opcao < 0 || opcao > 6 || listTemporaria.get(opcao).getStatus());

			listTemporaria.get(opcao).setStatus(true);
			listJ.get(i).setPersonagem(opcao, listTemporaria);

		}

		// APRESENTA NO CONSOLE OS JOGADORES CADASTRADOS COM SEU PERSONAGEM
		// OBS: (ADD SELEÇÃO DE PODER)
		for (Jogador j : listJ) {

			System.out.println();
			System.out.println(j.toString());

		}

	}

	// Metodo pra deixar o console Clear
	public final static void clearConsole() {

		for (int i = 0; i < 15; ++i) {

			System.out.println();
		}
	}

}
