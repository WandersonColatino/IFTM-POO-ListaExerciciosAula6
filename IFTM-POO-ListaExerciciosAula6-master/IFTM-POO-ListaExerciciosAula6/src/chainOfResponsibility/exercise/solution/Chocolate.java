package chainOfResponsibility.exercise.solution;

public class Chocolate implements Produto {

	@Override
	public double getValor() {
		return 8.00;
	}

	@Override
	public String getName() {		
		return "Chocolate";
	}

}
