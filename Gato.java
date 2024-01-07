
//ALMUDENA G�MEZ-CARRE�O

public class Gato extends Animal{

		//ATRIBUTOS
		private boolean esterilizados;
		
		
		//M�TODO CONSTRUCTOR
		public Gato(String nombre, char sexo, int edad, boolean sociables, boolean apadrinados, boolean esterilizados) {
			
			super(nombre, sexo, edad, sociables, apadrinados);
			this.esterilizados = esterilizados;
			
		}//fin-metodo constructor
		
		
		//M�TODOS GET Y SET
		public boolean getEsterilizados() {
			return esterilizados;
		}
		
		public void setEsterilizados(boolean esterilizados) {
			this.esterilizados = esterilizados;
		}
		
		
//		M�TODO PARA CALCULAR GASTOS DE LA CAMPA�A DE ESTERILIZACI�N DE LAS GATAS			
		public double calcularCosteEsterilizacion() {
			
			double costeEsterilizacion = 0;
			
			if (!esterilizados && (getSexo() == 'h')) {
						
				costeEsterilizacion = 1;
			}
			return costeEsterilizacion;
		}
		
		
//		M�TODO PARA CALCULAR LA CANTIDAD DE PIENSO		
		public double calcularCantidadPienso() {
			int result = 0;
			return result;
		}
		
		
//		M�TODO PARA CALCULAR LOS GASTOS VETERINARIOS ANUALES		
		public double calcularGastosVeterinariosAnuales() {
			
			double costeGastosVeterinarios = 0;
			
			if (!apadrinados) {
			
					if (!esterilizados && (getSexo() == 'h')) {
						
						costeGastosVeterinarios = EUROS_CONTROL_CELO_GATAS * 12;
					}	
			} 
			return costeGastosVeterinarios;
		}
		
		
		//M�TODO TOSTRING
		public String toString() {
			
			String este = "";
			
			if (esterilizados) {
				este = " y est� esterilizado.\n";
			} else {
				este = " y NO est� esterilizado.\n";
			}
			
			return super.toString() + este;
		}
		
}//fin-class







