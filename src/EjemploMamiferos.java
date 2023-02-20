import Clases.*;

public class EjemploMamiferos {

    private static Mamifero animales[] = {
            new Geopardo("Selva","geopardis",12f,15f,20f,13f,145),
            new Leon("Sabana", "ci",12f,14f,15f,35f,12,18,123f),
            new Tigre("Selva","tigris",12f,13f,14f,15f,230,"de Bengala"),
            new Perro("Casa Humana","perronus",12f,12f,12f,"Azul",15f,789),
            new Lobo("Bosque","lobus",12f,13f,14f,"gris",45f,16,"lobo siveriano")
    };
    public static void main(String[] args) {
        for(Mamifero m:animales){
            StringBuilder mensaje = new StringBuilder();
            mensaje.append(m.Comer()+"\n")
                    .append(m.Correr()+"\n")
                    .append(m.Comunicarse()+"\n")
                    .append(m.Dormir());
            System.out.println(mensaje.toString());
            System.out.println();
        }
    }
}