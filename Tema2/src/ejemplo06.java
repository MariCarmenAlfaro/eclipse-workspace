import java.util.Scanner;

public class ejemplo06 {

	public static void main(String[] args) {
		
			 Scanner entrada = new Scanner (System.in);
			 System.out.println("Que temperatura hace?");
			 float temperatura = entrada.nextFloat();
			  if (temperatura <20 ) {
				  
				  System.out.println("Hace fresquitoooooo");
			  } else if(temperatura > 40) {
				System.out.println("Nos asamos");  
			  } else {
				  System.out.println("se esta bien");
			  }
			  
			 
					
		
					
	}

}
