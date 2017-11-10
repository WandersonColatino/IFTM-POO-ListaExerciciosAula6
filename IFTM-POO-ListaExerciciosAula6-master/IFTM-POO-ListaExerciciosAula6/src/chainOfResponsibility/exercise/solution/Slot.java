package chainOfResponsibility.exercise.solution;

public abstract class Slot {

	private Slot sucessor;

	public Slot() {
		sucessor = null;
	}

	public abstract double processaRequisicao(Double valor) throws Exception;

	public void setSucessor(Slot sucessor) {
		if (this.sucessor == null) {
			this.sucessor = sucessor;
		} else {
			this.sucessor.setSucessor(sucessor);
		}
	}

	public Slot getSucessor() throws Exception {
		if (this.sucessor == null) {
			throw new Exception("A maquina não aceita o valor informado!");
		} else {
			return this.sucessor;
		}
	}
}
