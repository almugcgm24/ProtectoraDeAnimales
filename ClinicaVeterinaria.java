
//ALMUDENA G�MEZ-CARRE�O

public class ClinicaVeterinaria {

		//ATRIBUTOS
		private String nombreClinica;
		private int telefonoClinica;
		private int precioEsterilizacion_G;
		
		//M�TODO CONSTRUCTOR
		public ClinicaVeterinaria (String nombreClinica, int telefonoClinica, int precioEsterilizacion_G) {
			
			this.nombreClinica = nombreClinica;
			this.telefonoClinica = telefonoClinica;
			this.precioEsterilizacion_G = precioEsterilizacion_G;
			
		}//fin-m�todo constructor

		
		//M�TODOS GET Y SET
		public String getNombreClinica() {
			return nombreClinica;
		}

		public void setNombreClinica(String nombreClinica) {
			this.nombreClinica = nombreClinica;
		}

		public int getTelefonoClinica() {
			return telefonoClinica;
		}

		public void setTelefonoClinica(int telefonoClinica) {
			this.telefonoClinica = telefonoClinica;
		}

		public int getPrecioEsterilizacion_G() {
			return precioEsterilizacion_G;
		}

		public void setPrecioEsterilizacion_G(int precioEsterilizacion_G) {
			this.precioEsterilizacion_G = precioEsterilizacion_G;
		}
		
		
}//fin-class 
