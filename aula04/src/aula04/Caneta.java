package aula04;

public class Caneta {
    // Atributos
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    // Método construtor
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    // Métodos acessores e modificadores

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    // Métodos
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    // Estado atual
    public void status() {
        System.out.println("---------------------------------------------------");
        System.out.println("SOBRE A CANETA");
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
        System.out.println("---------------------------------------------------");
        System.out.println("");
    }
}