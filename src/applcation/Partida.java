package applcation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Partida {

	// OBS: NECESSARIO ADICIONAR TRY CATCHS PRA EVITAR ENTRADA DE DADOS INVALIDAS

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

	public void mostrarMenuInicial() {

		clearConsole();

		try {
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
		} catch (InputMismatchException ex) {

			System.out.println("\nVocê deve ter digitado uma letra. Tente outra");
			sc.nextLine();

			mostrarMenuInicial();

		}
	}

	public void explicacaoJogo() {

		int x = 0;

		clearConsole();

		System.out.print("O Jogo é um quiz, no qual 2 jogadores jogarão alternando seu turno a todo momento"
				+ "\nO acerto ou erro da resposta não mudará isso."
				+ "\nCada Jogador terá que escolher qual Personagem deseja jogar"
				+ "\nIndependente do Personagem escolhido, o Jogador não receberá nenhum bonus por isso"
				+ "\nAlém da escolha dos Personagens, o Jogador também escolherá com qual habilidade deseja jogar"
				+ "\nDependendo da habilidade escolhida você poderá aplicar suas respectivas ação" + "\n"
				+ "\nNesse jogo, o Jogador ganha quando a vida do adversário chegar a zero - 0" + "\n");

		try {
			do {
				System.out.print("\nPara voltar digite 1: ");
				x = sc.nextInt();
			} while (x != 1);

			mostrarMenuInicial();

		} catch (InputMismatchException ex) {

			System.out.println("\nVocê deve ter digitado uma letra. Tente outra");
			sc.nextLine();

			explicacaoJogo();

		}

	}

	public void mostrarDesenvolvedores() {
		try {

			int x;
			do {
				clearConsole();

				System.out.println("Desenvolvedores: ");
				System.out.println(". Arthur Gabriel Fernandes de Oliveira");
				System.out.println(". Arthur Latini");
				System.out.println(". Danilo Jorge da Silva");
				System.out.println(". Renato Henrique Lopes da Silva");
				System.out.print("Para voltar digite 1: ");

				x = sc.nextInt();

			} while (x != 1);

			mostrarMenuInicial();

		} catch (InputMismatchException ex) {

			System.out.println("\nVocê deve ter digitado uma letra. Tente outra");
			sc.nextLine();

			mostrarDesenvolvedores();

		}

	}

	public void start() {
		// Metódo que inicia a partida
		// OBS : ler os comentários acima para mais detalhes

		// 1 - Cadastrar Jogadores
		cadastroJogador();
		// 2/3 - ESCOLHER O PERSONAGEM E PODER
		escolherPersonagem();
		escolherHabilidade();
		// 4 - DEFINI QUAL JOGADOR NA LISTAJ VAI COMEÇAR (STATUS = TRUE)
		jogadorComecaPartida();
		// 5 - MOSTAR A PERGUNTA E COLOCAR A PERGUNTA P COMO SENDO ESSA PERGUNTA
		mostrarPergunta();
		// 6 - VERIFICA A RESPOSTA DO JOGADOR, E MUDA SUA VIDA, DEPENDENDO DA RESPOSTA
		respostaJogador();
		// 7 - MUDAR O TURNO (TROCAR OS STATUS DOS JOGADORES)
		trocarTurno();
		// trocarTurno();
		// 8 - VERIFICAR SE A PARTIDA ACABOU
		endPartida();

		// 5, 6 e 7 colocar dentro de do while
	}

	public void trocarTurno() {
		
		// TROCA OS STATUS DOS JOGADORES CONTIDOS NA LISTAJ
		
		for (int i = 0; i < listJ.size(); i++) {
			
			
			
		}
		
		
	}

	public void respostaJogador() {

		// SOMENTE O JOGADOR COM O STATUS TRUE SOFRERA COM A PERDA DE VIDA DE SEU
		// PERSONAGEM
		System.out.println();
		System.out.printf("Resposta: ");
		int opcao = sc.nextInt();
		opcao--;

		System.out.println();
		// VERIFICAR SE A ALTERNATIVA SELECIONA É A CORRETA (STATUS = TRUE)
		if (p.getAlternativas().get(opcao).getStatus() == true) {

			System.out.println("Você acertou!");

		}

		else {

			System.out.println("BUUU! Infelizmente você errou");

			for (int i = 0; i < listJ.size(); i++) {

				// VERIFICA SE O STATUS DO JOGADOR É TRUE
				if (listJ.get(i).getStatus() == true) {

					// SUBTRAI A VIDA DO PERSONAGEM POR 25
					listJ.get(i).getPersonagem().setVida(25);

				}

			}

		}

		//

	}

	public void endPartida() {

		// UMA PARTIDA ACABA QUANDO A VIDA DO PERSONAGEM DE UM JOGADOR CHEGAR A ZERO

	}

	public void mostrarPergunta() {

		// RANDOMIZA UMA PERGUNTA CONTIDA NA LISTA PERGUNTAS E SETA A PERGUNTA P (VAZIA
		// NO 1 MOMENTO)
		// PRA REFERENCIAR ESSA PERGUNTA DENTRO DO ARRAY
		// PRINTA ESSA PERGUNTA NO CONSOLE
		clearConsole();

		Random random = new Random();
		this.p = this.perguntas.get(random.nextInt(perguntas.size()));
		System.out.println();

		// INFORMA A QUAL JOGADOR A PERGUNTA SE DESTINA
		for (Jogador jogador : listJ) {

			if (jogador.getStatus() == true) {

				System.out.println("Jogador da vez: " + jogador.getNome());

			}

		}
		
		System.out.println();
		
		// PRINTA A PERGUNTA NA TELA
		System.out.println(this.p.toString());

	}

	public void jogadorComecaPartida() {

		// RANDOZIMA UM JOGADOR NA LISTJ, E TORNA SEU STATUS = TRUE
		// PERSONAGENS COM STATUS = TRUE ESTAO NA VEZ DE JOGAR
		Random random = new Random();

		listJ.get(random.nextInt(listJ.size())).setStatus(true);

	}

	public void cadastroJogador() {

		if (listJ.size() != 0) {
			listJ.clear();
		}

		clearConsole();

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

	// ESSE METÓDO SÓ FUNCIONA SE EXECUTADO DEPOIS DOS JOGADORES TEREM SIDO
	// CADASTRADOS (ADD) NA LISTAJ
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

		System.out.println();
		// APRESENTA NO CONSOLE OS JOGADORES CADASTRADOS COM SEU PERSONAGEM
		// OBS: (ADD SELEÇÃO DE PODER)
		for (Jogador j : listJ) {

			System.out.println(j.toString());

		}

	}

	public void escolherHabilidade() {

		// NO 1 MOMENTO O PERSONAGEM DO JOGADOR I TEM TODAS AS HABILIDADES
		for (int i = 0; i < listJ.size(); i++) {

			clearConsole();
			// MOSTRA AS OPCOES DISPONIVEIS
			System.out.println("Jogador \"" + listJ.get(i).getNome() + "\" escolha uma habilidade entre os seguintes:");
			System.out.println(listJ.get(i).getPersonagem().toStringH());
			System.out.println();
			System.out.printf("Escolha: ");

			// SELECIONA A HABILIDADE
			// OPCAO TRATADA (-1) DENTRO DO SETHABILIDADE
			// LIMPA A LISTA DE HABILIDADE QUE O PERSONAGEM TEM (não consegui)
			int opcao = sc.nextInt();

			System.out.println(listJ.get(i).getPersonagem().toString());

			listJ.get(i).getPersonagem().setHabilidade(opcao);

		}

	}

	// Metodo pra deixar o console Clear
	public final static void clearConsole() {

		System.out.println();
		System.out.println();

	}

}
