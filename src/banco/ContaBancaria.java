package banco;

public class ContaBancaria {
    private String titular;
    private double saldo;

    //construitor sem atributos
    public ContaBancaria(){
    }
    //construtor com atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    //Getter e Setter - Métodos Padroes para acessar e modificar os atributos
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta Bancaria: " +
                "titular: " + titular +
                ", saldo: " + saldo;
    }
}
