
//ALMUDENA GÓMEZ-CARREÑO

public class Perro extends Animal{
	
		//ATRIBUTOS
		private String raza;
		private double tamaño;
		private boolean ppp;
		private boolean leishmaniosis;
		
		
		//MÉTODO CONSTRUCTOR
		public Perro(String nombre, char sexo, int edad, boolean sociables, boolean apadrinados, String raza, double tamaño, boolean ppp, boolean leishmaniosis) {
			
			super(nombre, sexo, edad, sociables, apadrinados);
			this.raza = raza;
			this.tamaño = tamaño;
			this.ppp = ppp;
			this.leishmaniosis = leishmaniosis;
			
		}//fin - constructor
		
		
		//MÉTODOS GET Y SET
		public String getRaza() {
			return raza;
		}
		
		public double getTamaño() {
			return tamaño;
		}
		
		public void setTamaño(double tamaño) {
			this.tamaño = tamaño;
		}
		
		public boolean getPpp() {
			return ppp;
		}
		
		public void setPpp (boolean ppp) {
			this.ppp = ppp;
		}
		
		public boolean getLeishmaniosis() {
			return leishmaniosis;
		}
		
		public void setLeishmaniosis(boolean leishmaniosis) {
			this.leishmaniosis = leishmaniosis;
		}
		
		
//		MÉTODO PARA CALCULAR LOS GASTOS VETERINARIOS ANUALES
		public double calcularGastosVeterinariosAnuales() {
							
			double costeAnimal = 0;
			
			if (!apadrinados) {
			
					if (leishmaniosis) {
							costeAnimal = EUROS_LEIS * 12;
					}
					
					costeAnimal = costeAnimal + EUROS_VACUNA_RABIA;
					
					if (ppp && !sociables) {
							costeAnimal = costeAnimal + EUROS_SEDACION_ANIMAL;
					}
					return costeAnimal;
					
			} else {
				return costeAnimal;
			}
		}//FIN 
		
		
//		MÉTODO PARA CALCULAR LA CANTIDAD DE PIENSO
		public double calcularCantidadPienso() {
			
			double cantidadPienso = 0;
			
			if (edad >= 2) {
			
				if (tamaño <= TAMAÑO_PERRO_PEQUEÑO) {
					
					cantidadPienso = COMEN_PERROS_PEQUEÑOS;
					
				}else if (tamaño > TAMAÑO_PERRO_PEQUEÑO && tamaño <= TAMAÑO_PERRO_MEDIANO) {
						
						cantidadPienso = cantidadPienso + COMEN_PERROS_MEDIANOS;
						
				}else {
						cantidadPienso = cantidadPienso + ((COMEN_PERROS_GRANDES*tamaño)/100);
				}//fin-else
				
			}//fin-if
			
			return cantidadPienso;	
		}
		
		
//		MÉTODO PARA CALCULAR GASTOS DE LA CAMPAÑA DE ESTERILIZACIÓN DE LAS GATAS
		public double calcularCosteEsterilizacion() {
			int result = 0;
			return result;
		}
		
		//MÉTODO TOSTRING
		public String toString() {
			
			String result;
			String perropp = "";
			
			if (ppp) {
				perropp = ", es un perro potencialmente peligroso";
			} else {
				perropp = ", NO es un perro potencialmente peligroso";
			}
				
			String leis = "";
			
			if (leishmaniosis) {
				leis = " y tiene leishmaniosis.";
			} else {
				leis = " y NO tiene leishmaniosis.";
			}
				
			result = ", es de raza "+raza+", tiene un tañamo de "+tamaño+" kilogramos"+perropp+leis+"\n";
				
			return super.toString() + result;
		}
		
		
}//fin-class


