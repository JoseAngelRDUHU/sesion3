package pkg;

public class Movimiento {
	
	static enum signo {I,R};
	
	private Double importe;
	private String detalle;
	private String accion;
	
	public Movimiento(Double imp,signo sig ,String det) { 
		importe = imp;
		detalle = det;
		if(sig == signo.I)
			accion = "Ingreso";
		else
			accion = "Retiro";
	}

	public Double getImporte() {
		return importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public String getAccion() {
		return accion;
	}
}
