public class Snorlax extends Pokemon {
    public Snorlax() {
        super("Snorlax", 160, 110, TipoPokemon.NORMAL);
    }

    public void atacar(Pokemon oponente) {
        System.out.println(getNombre() + " usa aplastamiento contra " + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}