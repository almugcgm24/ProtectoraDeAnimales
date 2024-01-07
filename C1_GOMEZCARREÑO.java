
//ALMUDENA G�MEZ-CARRE�O

	import java.io.File;
	import java.io.IOException;
	import java.util.*;

	public class C1_GOMEZCARRE�O {
		
		public static Scanner teclado = new Scanner (System.in);

		public static void main (String []args) throws IOException {
			boolean ret = true;
			Protectora p = new Protectora("Latina");
			ClinicaVeterinaria cv = new ClinicaVeterinaria("Veterinaria", 925120824, 10);
			Ayuntamiento ayun = new Ayuntamiento(925123456, 150);
			
			leerAnimales("animales.txt", p);
		
			while(ret) {
				try {
					ret = menu(p, cv, ayun);
				}catch (NumeroFueraRangoException e) {
					
					System.out.println("Opci�n incorrecta");
					System.out.println("Debe ser un n�mero entre 1 y 8, ambos incluidos.");
				} catch (InputMismatchException a) {
					System.out.println("Por favor, introduzca un dato num�rico.");
						
				}
			}
			
		
		}//fin-main
		
		
//			M�TODO MEN�
		public static boolean menu (Protectora p, ClinicaVeterinaria clinicaVeterinaria, Ayuntamiento ayun) throws NumeroFueraRangoException, InputMismatchException {
			
			int menuOpcion = 0;
		
			System.out.println("Escoja la opci�n que quiera: "
								+ "\n1. Mostrar toda la informaci�n de los animales de la protectora."
								+ "\n2. Solicitud o Acogida de un animal."
								+ "\n3. Consultar el listado de solicitudes de adopci�n de un animal."
								+ "\n4. Calcular el coste de los gastos veterinarios previstos anuales."
								+ "\n5. Calcular el coste de una campa�a de esterilizaci�n de gatas."
								+ "\n6. Calcular la estimaci�n de la cantidad de pienso de perro adulto para una semana."
								+ "\n7. Calcular la subvenci�n."
								+ "\n8. Salir del programa \n");
					
					
					
			if (teclado.hasNextInt()) {
				menuOpcion = teclado.nextInt();
				teclado.nextLine();
				switch (menuOpcion) {
					case 1:
						
						System.out.println(p.mostrarAnimales());
						break;
							
					case 2:
					
						try {
							realizarSolicitudes(p);
						} catch (MasSolicitudException e) {
							System.out.println(e.getMessage());
						}				
						break;
						
					case 3:
						
						System.out.println(consultarSolicitudes(p));
						break;
						
					case 4:
						
						System.out.println("El coste de los gastos veterinarios previstos anuales es de " + p.calcularGastosVeterinariosAnuales() + " euros.");
						System.out.println("");
						break;
						
					case 5:
						
						System.out.println("El coste de la campa�a de esterilizaci�n de gatas es de " + p.calcularCosteCampEsteGatas(clinicaVeterinaria) + " euros.");
						System.out.println("");
						break;
						
					case 6:
						
						System.out.println("La estimaci�n de la cantidad de pienso de perro adulto para una semana es de " + p.calcularCantidadPienso() + " kg.");
						System.out.println("");
						break;
						
					case 7:
						
						System.out.println("La subvenci�n que conceder� el Ayuntamiento es de " + p.calcularPresupuesto(ayun) + " euros.");
						System.out.println("");
						break;
						
					case 8:
						return false;
						
					default:
						System.out.println("Vuelva a intentarlo.");
						throw new NumeroFueraRangoException();
				
				}
			} else {
				teclado.nextLine();
				throw new InputMismatchException();
			}
			return true;
		}
		
		
//			M�TODO LEER ANIMALES
		public static void leerAnimales (String cadena, Protectora p)throws IOException{
		    
			  File f = new File(cadena);
			  Scanner entrada = new Scanner (f);
		    
			  Animal x;
		    
			  while (entrada.hasNext()){
		    	
					String tipo = entrada.next();
			    	String nombre = entrada.next();
			    	char sexo = entrada.next().charAt(0);
			    	int edad = entrada.nextInt();
			    	boolean sociables = entrada.nextBoolean(); 
			    	boolean apadrinados = entrada.nextBoolean();
//			 	   	System.out.println(nombre+" "+sexo+" "+edad+" "+" "+sociables+" "+apadrinados);
		    	
			    	if (tipo.equals("p")){
		    		
			    		String raza = entrada.next();
			    		int tama�o = entrada.nextInt();
			    		boolean ppp = entrada.nextBoolean();
			    		boolean leishmaniosis = entrada.nextBoolean();
			    		
			    		x = new Perro(nombre, sexo, edad, sociables, apadrinados, raza, tama�o, ppp,leishmaniosis); 
//			    			System.out.println(raza+" "+tama�o+" "+potencialPeligroso+" "+" "+leishmaniosis);
		    		
			    	}else{
		    		
			    		boolean esterilizado = entrada.nextBoolean();
		    		
			    		x = new Gato(nombre, sexo, edad, sociables, apadrinados, esterilizado); 
		    		
			    	}//fin - if
		    	
			    	p.a�adirAnimales(x);
		    	
			  }//fin - while
		    
			  entrada.close();
		    
		}//fin - m�todo	
		
		
		//M�TODO PARA REALIZAR UNA SOLICITUD
		public static void realizarSolicitudes (Protectora p) throws MasSolicitudException {
			
			int tipoSolicitud;
			int telefonoPint;
			String nombre;
			
			System.out.println("�Como es el tipo de solicitud que va a realizar?");
			tipoSolicitud = teclado.nextInt();
			
			System.out.println("�Cu�l es el tel�fono de la persona interesada?");
			telefonoPint = teclado.nextInt();
			
			System.out.println("�Cu�l es el nombre del animal?");
			nombre = teclado.next();
			
			p.realizarSolicitud(tipoSolicitud, telefonoPint, nombre);
			
		}
	
		
		//M�TODO PARA CONSULTAR EL LISTADO DE SOLICITUDES
		public static String consultarSolicitudes(Protectora p) {
			
			String nombre;
			int tipoSolicitud;
			String result = "";
			int indice;
			
			System.out.println("�Cu�l es el nombre del animal?");
			nombre = teclado.next();	
			System.out.println("�Cu�l es el tipo de Solicitud?");
			tipoSolicitud = teclado.nextInt();
			
			indice = p.buscarAnimales(nombre);
			
			result = p.buscarTipoSolicitud(nombre, tipoSolicitud);
			
			return result;
		}
		
		
		
}//fin-class
