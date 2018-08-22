package contas;

public class TesteConta{
	
	public static void main(String[] args) {
		Conta c1 = new Conta("B", 1, "AA", 2.0);
		
		try {
			c1.sacarDinheiro(2.5);
		}
		catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
