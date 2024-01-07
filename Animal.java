
//ALMUDENA GÓMEZ-CARREÑO

public abstract class Animal implements IConstantes{

		//ATRIBUTOS
		protected String nombre;
		protected char sexo;
		protected int edad;
		protected boolean sociables;
		protected boolean apadrinados;
		protected Solicitud [] vectorSolicitudes;
		protected int indice;
		
		
		//MÉTODO COSNTRUCTOR
		public Animal(String nombre, char sexo, int edad, boolean sociables, boolean apadrinados) {
			this.nombre = nombre;
			this.sexo = sexo;
			this.edad = edad;
			this.sociables = sociables;
			this.apadrinados = apadrinados;
			vectorSolicitudes = new Solicitud[10];
			this.indice = 0;
		}
		
		
		//MÉTODOS ABSTRACTOS
		abstract public double calcularGastosVeterinariosAnuales();
				
		abstract public double calcularCantidadPienso();
		
		abstract public double calcularCosteEsterilizacion();				
				
		
		//MÉTODO PARA AÑADIR SOLICITUDES
		public void añadirSolicitud(Solicitud solicitud) throws MasSolicitudException {
			
			if (indice >= 10) {
				
				throw new MasSolicitudException("No se pueden añadir más Solicitudes");
			}else {
				this.vectorSolicitudes[indice] = solicitud;
				indice ++;
			}
		}
				
				
		//MÉTODO PARA MOSTRAR LA INFORMACIÓN DE LAS SOLICITUDES
		public String mostrarSolicitud (int tipo) {
			
			String result = "";
				
			for (int i = 0; i < indice; i++) {
						
				if (vectorSolicitudes[i].getTipoSolicitud() == tipo) {
						
					result += vectorSolicitudes[i].toString() + '\n';
				}
			}
			return result;
		}		
		
		
		//MÉTODOS GET Y SET
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public boolean getSociables() {
			return sociables;
		}

		public void setSociables(boolean sociables) {
			this.sociables = sociables;
		}

		public boolean getApadrinados() {
			return apadrinados;
		}

		public void setApadrinados(boolean apadrinados) {
			this.apadrinados = apadrinados;
		}
		
		public Solicitud [] getVectorSolicitudes() {
			return vectorSolicitudes;
		}
		
		public int getIndice() {
			return indice;
		}
		
		public void setIndice(int indice) {
			this.indice = indice;
		}
		
		
		//MÉTODO TO STRING				
		public String toString() {

			String result;
			String soci;
			String apadri;
			
			if (sociables) {
				soci = ", es sociable";
			} else {
				soci = ", NO es sociable";
			}//fin-if
			
			
			if (apadrinados) {
				apadri = ", está apadrinado";
			} else {
				apadri = ", NO está apradrinado";
			}//fin-if
			
			
			result = "El animal de nombre "+nombre+", es de sexo "+sexo+" (siendo m para machos y h para hembras), su edad es de "+edad+" años"+soci+apadri;
			
			return result;
			
		}//fin-toString
		
		
}//fin class
