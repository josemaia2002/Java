package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status() {
        System.out.println("Modelo:  " + this.modelo);
        System.out.println(" Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? : " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == false) {
            if (this.carga > 0) {
                this.carga--;
                System.out.println("Rabisquei");
            } else {
                System.out.println("ERRO, caneta sem carga");
            }
        } else {
            System.out.println("ERRO, caneta tampada");
        }
    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }
}