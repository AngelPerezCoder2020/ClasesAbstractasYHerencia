package Clases;

public abstract class Canino extends Mamifero {

    private String color;
    private float tamanoColmillos;
    public Canino(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.color=color;
        this.tamanoColmillos=tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}