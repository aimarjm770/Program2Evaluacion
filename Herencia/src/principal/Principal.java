package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcursionCultural excurCulturalEstudiantes= new ExcursionCultural("1", Destino.CIUDAD, 25, 150,
				10, true);
	System.out.println(excurCulturalEstudiantes.toString());
	System.out.println(excurCulturalEstudiantes.calcularPrecio());
	
	ExcursionCultural excurCultural= new ExcursionCultural("1", Destino.CIUDAD, 25, 150, 10 , false);
	
	System.out.println(excurCulturalEstudiantes.toString());
	System.out.println(excurCulturalEstudiantes.calcularPrecio());
	
	ExcursionBuceo excurBuceoSinCertiSinEquipo= new ExcursionBuceo ("2", Destino.PLAYA, 10, 100,
			1, false, 6, false);
	System.out.println(excurBuceoSinCertiSinEquipo.toString());
	}
	}


