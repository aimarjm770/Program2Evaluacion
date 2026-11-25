package principal;

public class ExcursionBuceo extends Excursion {
	private boolean certificado;
	private double profundidad;
	private boolean alquiler;
	
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificado, double profundidad, boolean alquiler) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profundidad = profundidad;
		this.alquiler = alquiler;
	}

	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public boolean isAlquiler() {
		return alquiler;
	}

	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}

	@Override
	public String toString() {
		return super.toString() + "\nExcursionBuceo [certificado=" + certificado + ", profundidad=" + profundidad + ", alquiler=" + alquiler
				+ "]";
	}
	
	public double calcularPrecio() {
		
		double precio;
		if(alquiler==true) {
			
		precio= super.calcularPrecio() + 100* getNumeroParticipantes();
		
		}
		else {
			precio= super.calcularPrecio();
		}
	return precio;
		
	}	
}


