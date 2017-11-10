package chainOfResponsibility.exercise.solution;

public class Refrigerante implements Produto {

	@Override
	public double getValor() {
		return 2.00;
	}

	@Override
	public String getName() {		
		return "Refrigerante";
	}

}
