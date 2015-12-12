package deber3;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   radio_circulo cir=new radio_circulo(01);
   cir.setradio(10);
   double result =cir.getradio();
   System.out.println("Area del circulo es :["+cir.getarea()+"]");
	}

}
