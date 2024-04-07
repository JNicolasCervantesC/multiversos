package multiversos;

public class Villanos extends Persona {

	String evilName;
	String powersv[] = {"Controlar el magnetismo.","Creatividad","Milicia"};
    String franquicia;
    Persona persona;
    
	public Villanos(String evilName, Persona persona,String franquicia) {
		super();
		this.evilName = evilName;
		this.persona = persona;
		this.franquicia = franquicia;
		
	}
    
	public void power(int i) {
        for (i = 0; i < powersv.length; i++) {
            System.out.println(powersv[i]);
        }
    }
	
}
