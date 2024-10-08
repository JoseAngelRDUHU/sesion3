package pkg;

public class Cuenta {
	
	private Double saldo;

	public Cuenta(Double saldo) {
		this.saldo = saldo;
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

	public void retirar(double d) {
		
		this.saldo -= d;
	}
	
	
	
}
