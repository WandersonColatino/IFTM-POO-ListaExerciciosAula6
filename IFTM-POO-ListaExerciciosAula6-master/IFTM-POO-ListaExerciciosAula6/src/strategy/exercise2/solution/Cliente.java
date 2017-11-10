package strategy.exercise2.solution;

public class Cliente {
	public static void main(String[] args) {
		DiaSemana dia = new DiaSemana();
		dia.ExibeMensagem(new Domingo());
		dia.ExibeMensagem(new Segunda());
		dia.ExibeMensagem(new Terca());
		dia.ExibeMensagem(new Quarta());
		dia.ExibeMensagem(new Quinta());
		dia.ExibeMensagem(new Sexta());
		dia.ExibeMensagem(new Sabado());
	}
}
