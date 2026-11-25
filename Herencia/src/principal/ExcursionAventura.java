package principal;

public class ExcursionAventura extends Excursion {

    private Dificultad aventura;

   
    public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, Dificultad aventura) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.aventura = aventura;
	}

	public Dificultad getAventura() {
		return aventura;
	}


	public void setAventura(Dificultad aventura) {
		this.aventura = aventura;
	}


	@Override
    public String toString() {
        return "ExcursionAventura [aventura=" + aventura + "]";
    }

    public double calcularPrecio() {
    	 double precio;
    	 precio = super.calcularPrecio();

        if (aventura == Dificultad.MEDIO) {
            precio = precio + 150;
        } else if (aventura == Dificultad.ALTO) {
            precio = precio + 300;
        }

        return precio;
    }
}
