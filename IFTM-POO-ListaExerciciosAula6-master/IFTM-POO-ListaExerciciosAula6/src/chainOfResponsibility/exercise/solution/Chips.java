package chainOfResponsibility.exercise.solution;

public class Chips implements Produto {

	@Override
	public double getValor() {
		return 3.00;
	}

	@Override
	public String getName() {		
		return "Chips";
	}

}
