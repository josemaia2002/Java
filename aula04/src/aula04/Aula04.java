package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Cristal", "Azul", 0.5f);
        Caneta c2 = new Caneta("Trilux ", "Vermelha", 0.3f);
        Caneta c3 = new Caneta("Diamond", "Rosa", 0.8f);
        Caneta c4 = new Caneta("Cristal", "Preta", 0.3f);
        Caneta c5 = new Caneta("Gripmaster", "Roxa", 0.5f);

        c1.status();
        c2.status();
        c3.status();
        c4.status();
        c5.status();
    }
}