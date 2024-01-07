
//ALMUDENA GÓMEZ-CARREÑO

public class Ayuntamiento {

		//ATRIBUTOS
		private int telefonoProtectora;
		private double cantidadSubvencionAniReg;
		
		
		//MÉTODO CONSTRUCTOR
		public Ayuntamiento (int telefonoProtectora, double cantidadSubvencionAniReg) {
			
			this.telefonoProtectora = telefonoProtectora;
			this.cantidadSubvencionAniReg = cantidadSubvencionAniReg;
			
		}//fin-método constructor

		
		//MÉTODOS GET Y SET
		public int getTelefonoProtectora() {
			return telefonoProtectora;
		}

		public void setTelefonoProtectora(int telefonoProtectora) {
			this.telefonoProtectora = telefonoProtectora;
		}

		public double getCantidadSubvencionAniReg() {
			return cantidadSubvencionAniReg;
		}

		public void setCantidadSubvencionAniReg(double cantidadSubvencionAniReg) {
			this.cantidadSubvencionAniReg = cantidadSubvencionAniReg;
		}
		
		
}//fin-class Ayuntamiento
