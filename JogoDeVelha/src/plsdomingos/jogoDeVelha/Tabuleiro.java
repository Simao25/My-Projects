package plsdomingos.jogoDeVelha;

public class Tabuleiro {

	private final int TAMANHO = 3;
	private int[][] tabuleiro = new int[TAMANHO][TAMANHO];

	public Tabuleiro() {
		this.reniciarTabuleiro();
	}

	public Tabuleiro(int[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	// Tic Toc
	public void reniciarTabuleiro() {
		for (int linha = 0; linha < TAMANHO; linha++) {
			for (int coluna = 0; coluna < TAMANHO; coluna++) {
				tabuleiro[linha][coluna] = 0;
			}
		}
	}

	// X = -1, O = 1, " " = 0
	public void mostrarTabela() {
		System.out.println();
		for (int linha = 0; linha < TAMANHO; linha++) {
			for (int coluna = 0; coluna < TAMANHO; coluna++) {
				if (tabuleiro[linha][coluna] == -1) {
					System.out.print(" X ");
				}
				if (tabuleiro[linha][coluna] == 1) {
					System.out.print(" O ");
				}
				if (tabuleiro[linha][coluna] == 0) {
					System.out.print("   ");
				}
				if (coluna == 0 || coluna == 1) {
					System.out.print("|");
				}

			}
			System.out.println();
		}
	}

	public int getPosicao(int[] tentativa) {
		return tabuleiro[tentativa[0]][tentativa[1]];
	}

	// t = [0,2] j = 1
	public void setPosicao(int[] tentativa, int jogador) {
		if (jogador == 1)
			tabuleiro[tentativa[0]][tentativa[1]] = -1; //-1 representa X,
		else
			tabuleiro[tentativa[0]][tentativa[1]] = 1; //1 representa O

		this.mostrarTabela();
	}

	public int verficarLinhas() {
		for (int linha = 0; linha < 3; linha++) {
			if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
				return -1;
			if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
				return 1;
		}
		return 0;
	}

	public int verficarColunas() {
		for (int coluna = 0; coluna < 3; coluna++) {
			if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
				return -1;
			if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
				return 1;
		}
		return 0;
	}

	public int verficatDiagonais() {
		if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
			return -1;
		if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
			return 1;

		if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
			return -1;
		if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
			return 1;

		return 0;
	}

	public boolean isTabuleiroCheio() {
		for (int linha = 0; linha < 3; linha++)
			for (int coluna = 0; coluna < 3; coluna++)
				if (tabuleiro[linha][coluna] == 0)
					return false;
		return true;
	}

}
