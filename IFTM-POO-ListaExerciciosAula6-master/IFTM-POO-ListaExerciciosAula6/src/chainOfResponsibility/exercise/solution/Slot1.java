package chainOfResponsibility.exercise.solution;

public class Slot1 extends Slot {
	private double valor = 1.00;

	@Override
	public double processaRequisicao(Double valor) throws Exception {
		if (this.valor == valor) {
			return this.valor;
		} else {
			return this.getSucessor().processaRequisicao(valor);
		}

	}

}
