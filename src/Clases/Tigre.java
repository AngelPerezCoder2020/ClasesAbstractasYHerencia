package Clases;
public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String Comer() {
        return "El Tigre caza con una velocidad de: "+getVelocidad()+
                ", sus garras de: "+getTamanoGarras()
                + "cm le ayudan en esta labor";
    }

    @Override
    public String Dormir() {
        return "El tigre de especie: "+this.especieTigre +" duerme en su habitat: "+getHabitat();
    }

    @Override
    public String Correr() {
        return "El tigre tiene un peso de: "+getPeso()+" y corre con una velocidad de: "+getVelocidad();
    }

    @Override
    public String Comunicarse() {
        return "El tigre de nombre cientifico: "+getNombreCientifico()+ "se comunica rugiendo";
    }
}