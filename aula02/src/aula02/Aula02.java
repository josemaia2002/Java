package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Trilux";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 0;
        c1.tampada = false;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}