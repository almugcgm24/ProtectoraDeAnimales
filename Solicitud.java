
//ALMUDENA GÓMEZ-CARREÑO

public class Solicitud {

		//ATRIBUTOS
		private int tipoSolicitud;
		private int telefonoPint;
		
		
		//MÉTODO CONSTUCTOR
		public Solicitud (int tipoSolicitud, int telefonoPint) {
			
			this.tipoSolicitud = tipoSolicitud;
			this.telefonoPint = telefonoPint;
			
		}//fin-método constructor
		
		
		//MÉTODOS GET Y SET
		public int getTipoSolicitud() {
			return tipoSolicitud;
		}

		public void setTipoSolicitud(int tipoSolicitud) {
			this.tipoSolicitud = tipoSolicitud;
		}

		public int getTelefonoPint() {
			return telefonoPint;
		}

		public void setTelefonoPint(int telefonoPint) {
			this.telefonoPint = telefonoPint;
		}
		
		
		//MÉTODO ToString
		public String toString() {
			
			String result;
			
			if (tipoSolicitud == 0) {
				
				result = "El tipo de la solicitud es acogida y el teléfono de la persona interesada es: "+telefonoPint+"\n";
				
			} else {
				
				result = "El tipo de la solicitud es adopción y el teléfono de la persona interesada es: "+telefonoPint+"\n";	
			}
			
			return result;
		}
		
		
}//fin-class
