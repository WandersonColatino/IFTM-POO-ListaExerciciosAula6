package chainOfResponsibility.exercise.solution;

public class Slot2 extends Slot {
	private double valor = 2.00;

	@Override
	public double processaRequisicao(Double valor) throws Exception {
		if (this.valor == valor) {
			return this.valor;
		} else {
			return this.getSucessor().processaRequisicao(valor);
		}

	}

}
