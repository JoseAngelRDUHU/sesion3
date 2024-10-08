package pkg;

public class Cuenta {
	
	private Double saldo;
	private String nTitular, numero;
	

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(double saldo, String num, String tit) {
		this.saldo = saldo;
		this.nTitular = tit;
		this.numero = num;
	}

	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public void ingresar(Double i) {
		
		this.saldo = this.saldo + i;
	}

	public void retirar(Double d) {
		
		this.saldo -= d;
	}
	
	
	
}
