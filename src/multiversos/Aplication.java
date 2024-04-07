package multiversos;

public class Aplication {
		public static void Heroes()
	{
		//Heros
    	
    	//Hero 1
		Persona tony_stark = new Persona();
	    tony_stark.setName("Tony StarK");
	    tony_stark.setEdad(35);
	    tony_stark.setCity("New York");
	        
	    SuperHero iron_man = new SuperHero("Iron Man", tony_stark, "Marvel");
	    System.out.println("Nombre: "+ iron_man.persona.name);
	    System.out.println("Edad: "+ iron_man.persona.edad);
	    System.out.println("Ciudad: "+ iron_man.persona.city);
	    System.out.println("Héroe: "+ iron_man.heroName);
	    System.out.println("Pertenece a: "+ iron_man.franquicia);
	    System.out.println("Superpoder: "+ iron_man.powers[0]+ "\n");
        
        //Hero2
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
        
        //Hero 3
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
        System.out.println("Superpoder: "+ Hulk.powers[2]+ "\n");
	}
	
	public static void Villanos()
	{
		//Evils
        
        //Evil 1
        Persona Erik_Lehnsherr = new Persona();
        Erik_Lehnsherr.setName("Erik Lehnsherr");
        Erik_Lehnsherr.setEdad(60);
        Erik_Lehnsherr.setCity("Krakoa");
        
        Villanos Magneto = new Villanos("Magneto", Erik_Lehnsherr, "Marvel");
        System.out.println("Nombre: "+ Magneto.persona.name);
        System.out.println("Edad: "+ Magneto.persona.edad);
        System.out.println("Ciudad: "+ Magneto.persona.city);
        System.out.println("Héroe: "+ Magneto.evilName);
        System.out.println("Pertenece a: "+ Magneto.franquicia);
        System.out.println("Superpoder: "+ Magneto.powersv[0]+ "\n");
        
        //Evil 2
        Persona Gru = new Persona();
        Gru.setName("Gru");
        Gru.setEdad(40);
        Gru.setCity("Lisboa");
        
        Villanos el_macho = new Villanos("El macho", Gru, "Illumination");
        System.out.println("Nombre: "+ el_macho.persona.name);
        System.out.println("Edad: "+ el_macho.persona.edad);
        System.out.println("Ciudad: "+ el_macho.persona.city);
        System.out.println("Héroe: "+ el_macho.evilName);
        System.out.println("Pertenece a: "+ el_macho.franquicia);
        System.out.println("Superpoder: "+ el_macho.powersv[1]+ "\n");
        
        //Evil 3
        Persona Alexander_Joseph = new Persona();
        Alexander_Joseph.setName("Alexander Joseph");
        Alexander_Joseph.setEdad(40);
        Alexander_Joseph.setCity("Lisboa");
        
        Villanos Lex_Luthor = new Villanos("Lex Luthor", Alexander_Joseph, "Illumination");
        System.out.println("Nombre: "+ Lex_Luthor.persona.name);
        System.out.println("Edad: "+ Lex_Luthor.persona.edad);
        System.out.println("Ciudad: "+ Lex_Luthor.persona.city);
        System.out.println("Héroe: "+ Lex_Luthor.evilName);
        System.out.println("Pertenece a: "+ Lex_Luthor.franquicia);
        System.out.println("Superpoder: "+ Lex_Luthor.powersv[2]+ "\n");
	}
	
	public static void op(String i)
	{
		if (i == "Heroes")
		{
			System.out.println("----------------Heroes----------------");
			Heroes();
			
		}
		if (i== "Villanos")
		{
			System.out.println("----------------Villanos----------------");
			Villanos();
		}
	}

    public static void main(String[] args) {
    	op("Heroes");
    	op("Villanos");
    	
    }
    }
