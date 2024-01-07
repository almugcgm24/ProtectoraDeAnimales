
//ALMUDENA G�MEZ-CARRE�O

public class Perro extends Animal{
	
		//ATRIBUTOS
		private String raza;
		private double tama�o;
		private boolean ppp;
		private boolean leishmaniosis;
		
		
		//M�TODO CONSTRUCTOR
		public Perro(String nombre, char sexo, int edad, boolean sociables, boolean apadrinados, String raza, double tama�o, boolean ppp, boolean leishmaniosis) {
			
			super(nombre, sexo, edad, sociables, apadrinados);
			this.raza = raza;
			this.tama�o = tama�o;
			this.ppp = ppp;
			this.leishmaniosis = leishmaniosis;
			
		}//fin - constructor
		
		
		//M�TODOS GET Y SET
		public String getRaza() {
			return raza;
		}
		
		public double getTama�o() {
			return tama�o;
		}
		
		public void setTama�o(double tama�o) {
			this.tama�o = tama�o;
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
		
		
//		M�TODO PARA CALCULAR LOS GASTOS VETERINARIOS ANUALES
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
		
		
//		M�TODO PARA CALCULAR LA CANTIDAD DE PIENSO
		public double calcularCantidadPienso() {
			
			double cantidadPienso = 0;
			
			if (edad >= 2) {
			
				if (tama�o <= TAMA�O_PERRO_PEQUE�O) {
					
					cantidadPienso = COMEN_PERROS_PEQUE�OS;
					
				}else if (tama�o > TAMA�O_PERRO_PEQUE�O && tama�o <= TAMA�O_PERRO_MEDIANO) {
						
						cantidadPienso = cantidadPienso + COMEN_PERROS_MEDIANOS;
						
				}else {
						cantidadPienso = cantidadPienso + ((COMEN_PERROS_GRANDES*tama�o)/100);
				}//fin-else
				
			}//fin-if
			
			return cantidadPienso;	
		}
		
		
//		M�TODO PARA CALCULAR GASTOS DE LA CAMPA�A DE ESTERILIZACI�N DE LAS GATAS
		public double calcularCosteEsterilizacion() {
			int result = 0;
			return result;
		}
		
		//M�TODO TOSTRING
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
				
			result = ", es de raza "+raza+", tiene un ta�amo de "+tama�o+" kilogramos"+perropp+leis+"\n";
				
			return super.toString() + result;
		}
		
		
}//fin-class


