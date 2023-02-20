package Clases;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }
    @Override
    public String Comer() {
        return "El lobo caza con su camada de: "+getNumCamada()+" ejemplares en: "+getHabitat();
    }

    @Override
    public String Dormir() {
        return "El lobo duerme en: "+getHabitat();
    }

    @Override
    public String Correr() {
        return "El lobo de especie: "+getEspecieLobo()+" teniendo una altura de: "+getAltura()+" y un peso de: "+getPeso();
    }

    @Override
    public String Comunicarse() {
        return "El lobo se comunica con su camada aullando";
    }
}