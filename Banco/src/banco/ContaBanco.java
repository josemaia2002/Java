package banco;

public class ContaBanco implements Conta {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private String status;

    // Método construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus("Conta Fechada");
    }

    // Métodos acessores e modificadores
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Métodos

    @Override
    public void abrirConta(String tipo) {
        this.setStatus("Conta aberta");
        this.setTipo(tipo);
        this.setNumConta(1111);

        if (this.getTipo() == "CC") {
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        }
    }

    @Override
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus("Conta fechada");
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        }
    }

    @Override
    public void depositar(int deposito) {
        if (this.getStatus() == "Conta aberta") {
            this.setSaldo(this.getSaldo() + deposito);
        } else {
            System.out.println("Impossível realizar depósito, conta fechada");
        }
    }

    @Override
    public void sacar(int saque) {
        if (this.getStatus() == "Conta aberta") {
            if (this.getSaldo() >= saque) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Valor sacado: R$" + saque);
            } else {
                System.out.println("Saldo insuficente");
            }
        }
    }

    @Override
    public void pagarMensal() {
        if (this.getStatus() == "Conta aberta") {
            if (this.getTipo() == "CP") {
                this.setSaldo(this.getSaldo() - 5);
            } else if (this.getTipo() == "CC") {
                this.setSaldo(this.getSaldo() - 12);
            }
        }
    }

    @Override
    public void menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------------------------");
        System.out.println("");
    }
}