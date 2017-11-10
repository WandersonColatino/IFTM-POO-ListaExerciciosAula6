package chainOfResponsibility.exercise.solution;

public class Slot5 extends Slot {
	private double valor = 5.00;

	@Override
	public double processaRequisicao(Double valor) throws Exception {
		if (this.valor == valor) {
			return this.valor;
		} else {
			return this.getSucessor().processaRequisicao(valor);
		}

	}

}
