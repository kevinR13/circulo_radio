package deber3;

public class radio_circulo {
// los atributos siempre van en privado
	private double radio;
	public radio_circulo(){//constructor sin entrada sirve para inicializar la variable
		
	}
	public void setradio(double radioparam){//constructor con entrada
		this.radio=radioparam;
	}
	public radio_circulo (double radio_param){
		this.radio=radio_param;
	}
	public double getradio(){
		return this.radio;
	}
	public double getarea(){
		return Math.PI*radio*radio;
	}
}
