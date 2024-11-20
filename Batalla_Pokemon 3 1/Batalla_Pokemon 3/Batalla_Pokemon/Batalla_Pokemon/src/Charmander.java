public class Charmander extends Pokemon {
    public Charmander(){
        super("Charmander", 39, 52, TipoPokemon.FUEGO);
    }
    
    public void atacar (Pokemon oponente) {
        System.out.println(getNombre() + "Manda una llamarada de fuego contra" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
