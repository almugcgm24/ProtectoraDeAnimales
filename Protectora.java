
//ALMUDENA G�MEZ-CARRE�O

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Protectora implements IConstantes{
	
	//ATRIBUTOS
	private Animal [] vectorAnimales;
	private String nombreProtectora;
	private int indice;
	
	
	//M�TODO CONSTRUCTOR
	public Protectora(String nombreProtectora){
		
		vectorAnimales = new Animal[20];
		this.nombreProtectora = nombreProtectora;
		this.indice = 0;
		
	}//fin-constructor
	
	
	//M�TODOS GET Y SET
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
//	M�TODO PARA A�ADIR ANIMALES
	public void a�adirAnimales(Animal animales) {
	  
		vectorAnimales[indice]=animales;
		indice ++;	
	}
	
	
//	MOSTRAR TODA LA INFORMACI�N DE LOS ANIMALES DE LA PROTECTORA
	public  String mostrarAnimales() {
		
		String result = "";
		
		for(int i = 0; i < indice; i++ ) {
			
			if (vectorAnimales[i] != null) {
				
				result = result + vectorAnimales[i].toString();
			}
		}
		return result;	
	}
	
	
//	M�TODO PARA BUSCAR ANIMALES
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
//	M�TODO PARA CALCULAR LA SUBVENCI�N QUE CONCEDER�A EL AYUNTAMIENTO
	public double calcularPresupuesto(Ayuntamiento ayuntamiento) {
		
		double total = 0;
		return total = SUBVENCION_CANTIDAD_FIJA + (ayuntamiento.getCantidadSubvencionAniReg() * indice);	
	}
	
	
//	3.-
//	M�TODO PARA CALCULAR EL COSTE DE UNA CAMPA�A DE ESTERILIZACI�N DE GATAS
	public double calcularCosteCampEsteGatas(ClinicaVeterinaria clinicaVeterinaria) {
		
		double total = 0; 
		
		for (int i = 0; i < indice; i++) {
			
			total += vectorAnimales[i].calcularCosteEsterilizacion();
		}
		return total * clinicaVeterinaria.getPrecioEsterilizacion_G();
	}
	
	
//	 4.-
//	 M�TODO PARA CALCULAR EL COSTE DE LOS GASTOS VETERINARIOS PREVISTOS ANUALES
	 public double calcularGastosVeterinariosAnuales() {
	
		 double total = 0;
		 
		 for (int i = 0;  i < indice; i ++) {
			 
			total += vectorAnimales[i].calcularGastosVeterinariosAnuales();
		 }
		 return total;		
	}
	
	
//	5.-
//	M�TODO PARA CALCULAR LA CANTIDAD DE PIENSO DE PERRO ADULTO (EN KG) PARA UNA SEMANA
	public double calcularCantidadPienso() {
		
		double total = 0;
		
		for (int i = 0; i < indice; i++) {
			
			total += vectorAnimales[i].calcularCantidadPienso();
		}
		return total * 7;
	}
	
	
//	6.-
//	M�TODO PARA REALIZAR UNA SOLICITUD DE ADOPCI�N O ACOGIDA DE UN ANIMAL
	public void realizarSolicitud (int tipoSolicitud, int telefonoPint, String nombre) throws MasSolicitudException {
		
		for (int i = 0; i < indice; i++) {
			
			if (vectorAnimales[i].getNombre().equalsIgnoreCase(nombre)) {
				
				vectorAnimales[i].a�adirSolicitud(new Solicitud (tipoSolicitud, telefonoPint));
			}
		}
	}
	
	
//	7.-
//	M�TODO PARA CONSULTAR LAS SOLICITUDES DE ADOPCI�N DE UN ANIMAL
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