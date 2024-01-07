
//ALMUDENA GÓMEZ-CARREÑO

	import java.io.File;
	import java.io.IOException;
	import java.util.*;

	public class C1_GOMEZCARREÑO {
		
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
					
					System.out.println("Opción incorrecta");
					System.out.println("Debe ser un número entre 1 y 8, ambos incluidos.");
				} catch (InputMismatchException a) {
					System.out.println("Por favor, introduzca un dato numérico.");
						
				}
			}
			
		
		}//fin-main
		
		
//			MÉTODO MENÚ
		public static boolean menu (Protectora p, ClinicaVeterinaria clinicaVeterinaria, Ayuntamiento ayun) throws NumeroFueraRangoException, InputMismatchException {
			
			int menuOpcion = 0;
		
			System.out.println("Escoja la opción que quiera: "
								+ "\n1. Mostrar toda la información de los animales de la protectora."
								+ "\n2. Solicitud o Acogida de un animal."
								+ "\n3. Consultar el listado de solicitudes de adopción de un animal."
								+ "\n4. Calcular el coste de los gastos veterinarios previstos anuales."
								+ "\n5. Calcular el coste de una campaña de esterilización de gatas."
								+ "\n6. Calcular la estimación de la cantidad de pienso de perro adulto para una semana."
								+ "\n7. Calcular la subvención."
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
						
						System.out.println("El coste de la campaña de esterilización de gatas es de " + p.calcularCosteCampEsteGatas(clinicaVeterinaria) + " euros.");
						System.out.println("");
						break;
						
					case 6:
						
						System.out.println("La estimación de la cantidad de pienso de perro adulto para una semana es de " + p.calcularCantidadPienso() + " kg.");
						System.out.println("");
						break;
						
					case 7:
						
						System.out.println("La subvención que concederá el Ayuntamiento es de " + p.calcularPresupuesto(ayun) + " euros.");
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
		
		
//			MÉTODO LEER ANIMALES
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
			    		int tamaño = entrada.nextInt();
			    		boolean ppp = entrada.nextBoolean();
			    		boolean leishmaniosis = entrada.nextBoolean();
			    		
			    		x = new Perro(nombre, sexo, edad, sociables, apadrinados, raza, tamaño, ppp,leishmaniosis); 
//			    			System.out.println(raza+" "+tamaño+" "+potencialPeligroso+" "+" "+leishmaniosis);
		    		
			    	}else{
		    		
			    		boolean esterilizado = entrada.nextBoolean();
		    		
			    		x = new Gato(nombre, sexo, edad, sociables, apadrinados, esterilizado); 
		    		
			    	}//fin - if
		    	
			    	p.añadirAnimales(x);
		    	
			  }//fin - while
		    
			  entrada.close();
		    
		}//fin - método	
		
		
		//MÉTODO PARA REALIZAR UNA SOLICITUD
		public static void realizarSolicitudes (Protectora p) throws MasSolicitudException {
			
			int tipoSolicitud;
			int telefonoPint;
			String nombre;
			
			System.out.println("¿Como es el tipo de solicitud que va a realizar?");
			tipoSolicitud = teclado.nextInt();
			
			System.out.println("¿Cuál es el teléfono de la persona interesada?");
			telefonoPint = teclado.nextInt();
			
			System.out.println("¿Cuál es el nombre del animal?");
			nombre = teclado.next();
			
			p.realizarSolicitud(tipoSolicitud, telefonoPint, nombre);
			
		}
	
		
		//MÉTODO PARA CONSULTAR EL LISTADO DE SOLICITUDES
		public static String consultarSolicitudes(Protectora p) {
			
			String nombre;
			int tipoSolicitud;
			String result = "";
			int indice;
			
			System.out.println("¿Cuál es el nombre del animal?");
			nombre = teclado.next();	
			System.out.println("¿Cuál es el tipo de Solicitud?");
			tipoSolicitud = teclado.nextInt();
			
			indice = p.buscarAnimales(nombre);
			
			result = p.buscarTipoSolicitud(nombre, tipoSolicitud);
			
			return result;
		}
		
		
		
}//fin-class
