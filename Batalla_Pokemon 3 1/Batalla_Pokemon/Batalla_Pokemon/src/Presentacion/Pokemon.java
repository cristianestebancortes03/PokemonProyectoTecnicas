package Presentacion;


import Presentacion.TipoPokemon;


//    Inicio

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private EstadoPokemon estado;
    
    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
       this.nombre = nombre;
       this.salud = salud;
       this.puntosDeAtaque = puntosDeAtaque;
       this.tipo = tipo;
       this.estado = EstadoPokemon.NORMAL;
   }
    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.objetenerMultiplicadorDeDaño(this.tipo, oponente.getTipo());
        int daño = (int) (this.puntosDeAtaque * multiplicador);
        oponente.recibirDaño(daño);
        System.out.println("this.nombre " + " Ataco a " + oponente.getNombre() + ", Salud: " + this.salud);    
    }
     
    public void recibirDaño(int daño){
        this.salud -= daño;
        if(this.salud <= 0) {
        this.estado = EstadoPokemon.DEBILITADO;
        System.out.println("this.nombre" + " Ha sido debilitado. ");
        }
    }
     
    public void entrenar(){
        this.puntosDeAtaque += 5;
        this.salud += 10;
        System.out.println("this.nombre" + " Ha entrenado. Ataque: " + this.puntosDeAtaque + ", Salud " + this.salud);
    }
    public TipoPokemon getTipo() {
        return this.tipo;
   }

    public String getNombre() {
        return this.nombre;
    }
    
    public int getSalud() {
        return this.salud;
    }
    
    public EstadoPokemon getEstado() {
        return this.estado;
    }
      public int getPuntosDeAtaque() {
        return this.puntosDeAtaque;
    }

    }

