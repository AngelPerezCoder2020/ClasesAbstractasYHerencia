package Clases;
public class Leon  extends Felino{
    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad, int numeroManada, float potenciaRugido) {
        super(habitat, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String Comer() {
        return "El León caza junto a su grupo de " + numeroManada + " individuos en las llanuras africanas";
    }

    @Override
    public String Dormir() {
        return "El León duerme con los ojos cerrados en: "+getHabitat();
    }

    @Override
    public String Correr() {
        return "El leon corre a una velocidad de: "+getVelocidad()+" en su habitat natural";
    }

    @Override
    public String Comunicarse() {
        return "El León se comuinca regiendo con una potencia promedion de: "+getPotenciaRugido();
    }
}