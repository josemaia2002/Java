package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            this.setStatus(false);
            System.out.println("Conta com dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito");
        }
    }

    public void depositar(float v) {
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v) {
        if (this.isStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(float v) {
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    // Estado atual
    public void estadoAtual() {
        System.out.println("---------------------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("---------------------------------------------------");
        System.out.println("");
    }
}