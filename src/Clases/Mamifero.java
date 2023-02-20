package Clases;

public abstract class Mamifero {
    private String habitat, nombreCientifico;
    private float altura, largo, peso;

    public Mamifero(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public abstract String Comer();
    public abstract String Dormir();
    public abstract String Correr();
    public abstract String Comunicarse();
}