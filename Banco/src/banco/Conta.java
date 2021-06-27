package banco;

public interface Conta {
    public abstract void abrirConta(String tipo);

    public abstract void fecharConta();

    public abstract void depositar(int deposito);

    public abstract void sacar(int saque);

    public abstract void pagarMensal();

    public abstract void menu();
}