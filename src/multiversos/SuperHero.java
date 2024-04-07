package multiversos;

public class SuperHero extends Persona {

    String heroName;
    String powers[] = {"Volar","Lansar telarañas","Super Fuersa","Telepatia"};
    String franquicia;
    Persona persona;

	public SuperHero(String heroName, Persona persona, String franquicia) 
	{
		super();
		this.heroName = heroName;
		this.franquicia = franquicia;
		this.persona = persona;
		}
	
	public void power(int i) {
        for (i = 0; i < powers.length; i++) {
            System.out.println(powers[i]);
        }
    }
}
    