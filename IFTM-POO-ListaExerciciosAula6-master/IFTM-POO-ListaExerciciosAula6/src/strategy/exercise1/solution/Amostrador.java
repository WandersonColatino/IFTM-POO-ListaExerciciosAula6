package strategy.exercise1.solution;

public class Amostrador {
	private int[] populacao;

	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(SubConjunto subConjunto, int tamanhoAmostra) {
		return subConjunto.retornaSubconjunto(populacao, tamanhoAmostra);
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}
}