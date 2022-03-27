package geometria;

public class Cilindro {

	//Atributos
	private int altura;
	private int radio;
	private final double PI =3.141592;
	
	//Constructores
	public Cilindro(){
		
	}
	public Cilindro (int altura, int radio){
		this.altura=altura;
		this.radio=radio;
	}
	
	public double area() {
		//2*pi**r(r+a)
		
		return 2*PI*radio*altura+2*PI* Math.pow(radio, 2);
	}
	public double volumen() {
		
		return PI*Math.pow(radio, 2)*altura;
	}
	
	public String toString() {
		 
		return"altura= "+altura+"\nradio="+radio;
		
	}
	
	
	
	
	
	
	
	
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public int getRadio() {
	return radio;
	}
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
