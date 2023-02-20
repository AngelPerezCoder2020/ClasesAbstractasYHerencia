package Clases;

public class Geopardo extends Felino{
    public Geopardo(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
    }

    @Override
    public String Comer() {
        return "El Geopardo come carne y puede llegar a tener un peso de: "+getPeso();
    }

    @Override
    public String Dormir() {
        return "El geopardo duerme en: "+getHabitat();
    }

    @Override
    public String Correr() {
        return "El geopardo corre a una velocidad de: "+getVelocidad()+" con sus garras de: "+getTamanoGarras()+"cm";
    }

    @Override
    public String Comunicarse() {
        return "El geopardo ruje para comunicarse";
    }
}