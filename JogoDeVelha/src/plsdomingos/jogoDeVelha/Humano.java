package plsdomingos.jogoDeVelha;

import java.util.Scanner;

public class Humano extends Jogador {

	public Scanner entrada = new Scanner(System.in);

	public Humano(int jogador) {
		super(jogador);
		System.out.println("Jogador Humano criado!");
	}

	@Override
	public void jogar(Tabuleiro tabuleiro) {
		tentar(tabuleiro);
		tabuleiro.setPosicao(tentativa, jogador);
	}

	@Override
	public void tentar(Tabuleiro tabuleiro) {
		do {
			do {
				System.out.println("Linha: ");
				tentativa[0] = entrada.nextInt();

				if (tentativa[0] > 3 || tentativa[0] < 1)
					System.out.println("Linha invalida.(linhas validas [1,2,3])");

			} while (tentativa[0] > 3 || tentativa[0] < 1);

			do {

				System.out.println("Coluna: ");
				tentativa[1] = entrada.nextInt();

				if (tentativa[1] > 3 || tentativa[1] < 1)
					System.out.println("Coluna invalida.(colunas validas [1,2,3])");

			} while (tentativa[1] > 3 || tentativa[1] < 1);

			tentativa[0]--;
			tentativa[1]--;

			if (!verificarCelula(tentativa, tabuleiro))
				System.out.println("Essa celula ja foi marcada. Tente outro.");

		} while (!verificarCelula(tentativa, tabuleiro));

	}

}
