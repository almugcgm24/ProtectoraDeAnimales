
//ALMUDENA GÓMEZ-CARREÑO

public class Gato extends Animal{

		//ATRIBUTOS
		private boolean esterilizados;
		
		
		//MÉTODO CONSTRUCTOR
		public Gato(String nombre, char sexo, int edad, boolean sociables, boolean apadrinados, boolean esterilizados) {
			
			super(nombre, sexo, edad, sociables, apadrinados);
			this.esterilizados = esterilizados;
			
		}//fin-metodo constructor
		
		
		//MÉTODOS GET Y SET
		public boolean getEsterilizados() {
			return esterilizados;
		}
		
		public void setEsterilizados(boolean esterilizados) {
			this.esterilizados = esterilizados;
		}
		
		
//		MÉTODO PARA CALCULAR GASTOS DE LA CAMPAÑA DE ESTERILIZACIÓN DE LAS GATAS			
		public double calcularCosteEsterilizacion() {
			
			double costeEsterilizacion = 0;
			
			if (!esterilizados && (getSexo() == 'h')) {
						
				costeEsterilizacion = 1;
			}
			return costeEsterilizacion;
		}
		
		
//		MÉTODO PARA CALCULAR LA CANTIDAD DE PIENSO		
		public double calcularCantidadPienso() {
			int result = 0;
			return result;
		}
		
		
//		MÉTODO PARA CALCULAR LOS GASTOS VETERINARIOS ANUALES		
		public double calcularGastosVeterinariosAnuales() {
			
			double costeGastosVeterinarios = 0;
			
			if (!apadrinados) {
			
					if (!esterilizados && (getSexo() == 'h')) {
						
						costeGastosVeterinarios = EUROS_CONTROL_CELO_GATAS * 12;
					}	
			} 
			return costeGastosVeterinarios;
		}
		
		
		//MÉTODO TOSTRING
		public String toString() {
			
			String este = "";
			
			if (esterilizados) {
				este = " y está esterilizado.\n";
			} else {
				este = " y NO está esterilizado.\n";
			}
			
			return super.toString() + este;
		}
		
}//fin-class







