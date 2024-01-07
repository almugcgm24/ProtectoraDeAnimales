
//ALMUDENA GÓMEZ-CARREÑO

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Protectora implements IConstantes{
	
	//ATRIBUTOS
	private Animal [] vectorAnimales;
	private String nombreProtectora;
	private int indice;
	
	
	//MÉTODO CONSTRUCTOR
	public Protectora(String nombreProtectora){
		
		vectorAnimales = new Animal[20];
		this.nombreProtectora = nombreProtectora;
		this.indice = 0;
		
	}//fin-constructor
	
	
	//MÉTODOS GET Y SET
	public Animal[] getVectorAnimales() {
		return vectorAnimales;
	}
	
	public void setVectoranimales(Animal[] vectorAnimales) {
		this.vectorAnimales = vectorAnimales;
	}
	
	public String getNombreProtectora() {
		return nombreProtectora;
	}

	public void setNombreProtectora(String nombreProtectora) {
		this.nombreProtectora = nombreProtectora;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
//	1.-
//	MÉTODO PARA AÑADIR ANIMALES
	public void añadirAnimales(Animal animales) {
	  
		vectorAnimales[indice]=animales;
		indice ++;	
	}
	
	
//	MOSTRAR TODA LA INFORMACIÓN DE LOS ANIMALES DE LA PROTECTORA
	public  String mostrarAnimales() {
		
		String result = "";
		
		for(int i = 0; i < indice; i++ ) {
			
			if (vectorAnimales[i] != null) {
				
				result = result + vectorAnimales[i].toString();
			}
		}
		return result;	
	}
	
	
//	MÉTODO PARA BUSCAR ANIMALES
	public int buscarAnimales (String nombre) {
		
		int result = 0;
		
		for (int i = 0; i < indice; i++) {
			
			if (vectorAnimales[i].getNombre().equalsIgnoreCase(nombre)) {
				
				result =  i;
			}
		}
		return result;
	}
	
	
//	2.-
//	MÉTODO PARA CALCULAR LA SUBVENCIÓN QUE CONCEDERÍA EL AYUNTAMIENTO
	public double calcularPresupuesto(Ayuntamiento ayuntamiento) {
		
		double total = 0;
		return total = SUBVENCION_CANTIDAD_FIJA + (ayuntamiento.getCantidadSubvencionAniReg() * indice);	
	}
	
	
//	3.-
//	MÉTODO PARA CALCULAR EL COSTE DE UNA CAMPAÑA DE ESTERILIZACIÓN DE GATAS
	public double calcularCosteCampEsteGatas(ClinicaVeterinaria clinicaVeterinaria) {
		
		double total = 0; 
		
		for (int i = 0; i < indice; i++) {
			
			total += vectorAnimales[i].calcularCosteEsterilizacion();
		}
		return total * clinicaVeterinaria.getPrecioEsterilizacion_G();
	}
	
	
//	 4.-
//	 MÉTODO PARA CALCULAR EL COSTE DE LOS GASTOS VETERINARIOS PREVISTOS ANUALES
	 public double calcularGastosVeterinariosAnuales() {
	
		 double total = 0;
		 
		 for (int i = 0;  i < indice; i ++) {
			 
			total += vectorAnimales[i].calcularGastosVeterinariosAnuales();
		 }
		 return total;		
	}
	
	
//	5.-
//	MÉTODO PARA CALCULAR LA CANTIDAD DE PIENSO DE PERRO ADULTO (EN KG) PARA UNA SEMANA
	public double calcularCantidadPienso() {
		
		double total = 0;
		
		for (int i = 0; i < indice; i++) {
			
			total += vectorAnimales[i].calcularCantidadPienso();
		}
		return total * 7;
	}
	
	
//	6.-
//	MÉTODO PARA REALIZAR UNA SOLICITUD DE ADOPCIÓN O ACOGIDA DE UN ANIMAL
	public void realizarSolicitud (int tipoSolicitud, int telefonoPint, String nombre) throws MasSolicitudException {
		
		for (int i = 0; i < indice; i++) {
			
			if (vectorAnimales[i].getNombre().equalsIgnoreCase(nombre)) {
				
				vectorAnimales[i].añadirSolicitud(new Solicitud (tipoSolicitud, telefonoPint));
			}
		}
	}
	
	
//	7.-
//	MÉTODO PARA CONSULTAR LAS SOLICITUDES DE ADOPCIÓN DE UN ANIMAL
	public String buscarTipoSolicitud(String nombre, int tipoSolicitud) {
		
		String result = "";
		
		for (int i = 0; i < indice; i++) {
			
			if (vectorAnimales[i].getNombre().equalsIgnoreCase(nombre)) {
				
				result =  vectorAnimales[i].mostrarSolicitud(tipoSolicitud);
			}
		}
		return result;
	}
	
	
		
}//fin-class