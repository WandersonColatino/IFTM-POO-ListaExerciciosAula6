package chainOfResponsibility.exercise.solution;

public class Cliente {
	public static void main(String args[]) throws Exception {
		Maquina maquina = new Maquina();
		maquina.selecioneProduto(new Refrigerante());
		maquina.selecioneProduto(new Chips());
		maquina.efetuarPagamento(5.00);		
		maquina.selecioneProduto(new Chips());
		maquina.efetuarPagamento(2.00);
		maquina.efetuarPagamento(1.00);
		
		maquina.selecioneProduto(new Chocolate());
		maquina.efetuarPagamento(10.00);
		

		/*Slot slot = new Slot1();
		slot.setSucessor(new Slot2());
		slot.setSucessor(new Slot5());
		System.out.println(slot.processaRequisicao(2.00));
		System.out.println(slot.processaRequisicao(1.00));
		System.out.println(slot.processaRequisicao(5.00));*/
	}
}


