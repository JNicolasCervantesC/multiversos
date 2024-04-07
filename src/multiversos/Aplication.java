package multiversos;

public class Aplication {
    public static void main(String[] args) {

        Persona tony_stark = new Persona();
        tony_stark.setName("Tony Stark");
        tony_stark.setEdad(35);
        tony_stark.setCity("New York");
        
        SuperHero iron_man = new SuperHero("Iron Man", tony_stark, "Marvel");
        System.out.println("Nombre: "+ iron_man.persona.name);
        System.out.println("Edad: "+ iron_man.persona.edad);
        System.out.println("Ciudad: "+ iron_man.persona.city);
        System.out.println("Héroe: "+ iron_man.heroName);
        System.out.println("Pertenece a: "+ iron_man.franquicia);
        System.out.println("Superpoder: "+ iron_man.powers[0]+ "\n");
        
        Persona Peter_Parquer = new Persona();
        Peter_Parquer.setName("Peter Parquer");
        Peter_Parquer.setEdad(19);
        Peter_Parquer.setCity("New York");
        
        SuperHero spider_men = new SuperHero("Spider Men", Peter_Parquer, "Sony Pictures");
        System.out.println("Nombre: "+ spider_men.persona.name);
        System.out.println("Edad: "+ spider_men.persona.edad);
        System.out.println("Ciudad: "+ spider_men.persona.city);
        System.out.println("Héroe: "+ spider_men.heroName);
        System.out.println("Pertenece a: "+ spider_men.franquicia);
        System.out.println("Superpoder: "+ spider_men.powers[1]+ "\n");
        
        Persona Bruce_Banner = new Persona();
        Bruce_Banner.setName("Bruce Bannerr");
        Bruce_Banner.setEdad(56);
        Bruce_Banner.setCity("Ohio");
        
        SuperHero Hulk = new SuperHero("Hulk", Bruce_Banner, "Marvel");
        System.out.println("Nombre: "+ Hulk.persona.name);
        System.out.println("Edad: "+ Hulk.persona.edad);
        System.out.println("Ciudad: "+ Hulk.persona.city);
        System.out.println("Héroe: "+ Hulk.heroName);
        System.out.println("Pertenece a: "+ Hulk.franquicia);
        System.out.println("Superpoder: "+ Hulk.powers[2]);
    }
}
