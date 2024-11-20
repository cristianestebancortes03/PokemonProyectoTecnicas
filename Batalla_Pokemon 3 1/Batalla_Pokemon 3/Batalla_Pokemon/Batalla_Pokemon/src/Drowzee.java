public class Drowzee extends Pokemon{

public Drowzee(){  
    super("Drownzee", 60, 48, TipoPokemon.PSIQUICO);
}    
public void atacar(Pokemon oponente){
    System.out.println(getNombre() + "USA CONFUCION CONTRA" + oponente.getNombre() + "!");
    super.atacar(oponente);
}
}
