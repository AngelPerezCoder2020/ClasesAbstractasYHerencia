package Clases;
public abstract class Felino extends Mamifero {
    private float tamanoGarras;
    private int velocidad;
    public Felino(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
    public float getTamanoGarras() {
        return tamanoGarras;
    }
    public int getVelocidad() {
        return velocidad;
    }
}