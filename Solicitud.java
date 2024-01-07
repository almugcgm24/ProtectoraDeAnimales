
//ALMUDENA G�MEZ-CARRE�O

public class Solicitud {

		//ATRIBUTOS
		private int tipoSolicitud;
		private int telefonoPint;
		
		
		//M�TODO CONSTUCTOR
		public Solicitud (int tipoSolicitud, int telefonoPint) {
			
			this.tipoSolicitud = tipoSolicitud;
			this.telefonoPint = telefonoPint;
			
		}//fin-m�todo constructor
		
		
		//M�TODOS GET Y SET
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
		
		
		//M�TODO ToString
		public String toString() {
			
			String result;
			
			if (tipoSolicitud == 0) {
				
				result = "El tipo de la solicitud es acogida y el tel�fono de la persona interesada es: "+telefonoPint+"\n";
				
			} else {
				
				result = "El tipo de la solicitud es adopci�n y el tel�fono de la persona interesada es: "+telefonoPint+"\n";	
			}
			
			return result;
		}
		
		
}//fin-class
