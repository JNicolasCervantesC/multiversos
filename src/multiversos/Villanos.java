package multiversos;

public class Villanos extends Persona {

	String evilName;
	String powers[] = {"Vision","Teletrnsportación","Sanación"};
    String franquicia;
    Persona persona;
    
	public Villanos(String evilName, String[] powers, String franquicia, Persona persona) {
		super();
		this.evilName = evilName;
		this.powers = powers;
		this.franquicia = franquicia;
		this.persona = persona;
	}
}
