package multiversos;

public class Aplication {
    public static void main(String[] args) {

        Persona tony_stark = new Persona();
        tony_stark.setName("Tony Stark");
        tony_stark.setCity("New York");
        System.out.println(tony_stark.name+": "+tony_stark.edad);
        tony_stark.setEdad(35);
        System.out.println(tony_stark.name+": "+tony_stark.edad);

        SuperHero iron_man = new SuperHero("Iron Man", tony_stark);


        System.out.println(iron_man.persona.getCity());

    }
}
