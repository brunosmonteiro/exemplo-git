package contas;

public class Conta {

	private String titulo;
	private int numero;
	private String agencia;
	private double saldo;

	public Conta(String titulo, int numero, String agencia, double saldo) {
		setTitulo(titulo);
		setNumero(numero);
		setAgencia(agencia);
		setSaldo(saldo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacarDinheiro(double dinheiroRequisitado) throws SaldoInsuficienteException {
		if (this.saldo < dinheiroRequisitado) 
			throw new SaldoInsuficienteException("Saldo requisitado inválido! Digite um valor menor");
			
		this.saldo -= dinheiroRequisitado;
		return dinheiroRequisitado;

	}

	public void depositarDinheiro(double dinheiroRequisitado) {
		this.saldo += dinheiroRequisitado;
	}

}
