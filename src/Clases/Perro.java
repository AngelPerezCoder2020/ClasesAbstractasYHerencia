package Clases;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String Comer() {
        return "El perro usa su mordida de: "+getFuerzaMordida()+" para comer";
    }

    @Override
    public String Dormir() {
        return "El perro duerme en: "+getHabitat();
    }

    @Override
    public String Correr() {
        return "El perro corre teniendo "+getAltura()+"cm de altura y un peso de: "+getPeso();
    }

    @Override
    public String Comunicarse() {
        return "El perro se comunica ladrando";
    }
}