package pkg;

import java.util.ArrayList;
import java.util.List;
import pkg.Movimiento;

public class Cuenta {
	
	private Double saldo;
	private String nTitular, numero;
	private List <Movimiento> mMovimientos = new ArrayList();
	

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(Double saldo, String num, String tit) {
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
		Movimiento mov = new Movimiento(i, Movimiento.signo.I,"ingresando");
		mMovimientos.add(mov);
	}

	public void retirar(Double d) {
		
		if(this.saldo-d >= -500) {
			this.saldo = this.saldo -d;
			Movimiento mov = new Movimiento(d, Movimiento.signo.R,"retirando");
		}else
			System.out.println("No se ha permitido retirar "+d+" ya que el saldo("+this.saldo+ ") seria inferior a -500");
	}
	
	
	
}
