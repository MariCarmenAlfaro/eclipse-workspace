package teoria;

public class Ejemplo8 {

	public static void main(String[] args) {
            String empleados [][]= {
            		{"Vázquez","Elier","1300"},
            		{"Buendia","Fernando","1500"},
            		{"Aguiló","Jaume","800"},
            		{"González","Guillermo","2000"},
            		{"Alfaro","Maria del Carmen","1700"},
            		{"Losada","Iván","1900"}
            };
            
            
            //Buscar el minimo y el maximo sueldo
            int posMin=0;
            int posMax=0;
            for (int fila = 1; fila < empleados.length; fila++) {
				if(Float.parseFloat(empleados[fila][2]) < Float.parseFloat(empleados[posMin][2])) {
					posMin=fila;
				}	
				if(Float.parseFloat(empleados[fila][2]) > Float.parseFloat(empleados[posMax][2])) {
					posMax=fila;
				}	
			}
            System.out.println("El empleado que menos gana es: "+empleados[posMin][1]+" "+empleados[posMin][0]+" ("+empleados[posMin][2]+" euros)");
            System.out.println("El empleado que más gana es: "+empleados[posMax][1]+" "+empleados[posMax][0]+" ("+empleados[posMax][2]+" euros)");
            
            
            
            
            
            
            
            
            
            
	}

}
