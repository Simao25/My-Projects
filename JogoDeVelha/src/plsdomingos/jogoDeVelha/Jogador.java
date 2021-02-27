package plsdomingos.jogoDeVelha;

public abstract class Jogador {
	protected int tentativa[] = new int[3];
	protected int jogador;

	public Jogador(int jogador) {
		this.jogador = jogador;
	}

	public abstract void jogar(Tabuleiro tabuleiro);

	public abstract void tentar(Tabuleiro tabuleiro);

	public boolean verificarCelula(int[] celulaEscolida, Tabuleiro tabuleiro) {
		return tabuleiro.getPosicao(celulaEscolida) == 0;
	}

}
