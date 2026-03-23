package banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria();

        primeiraConta.setTitular("Dieberson");
        primeiraConta.setSaldo(2000.0);

        System.out.println(primeiraConta.getTitular()+ " " + primeiraConta.getSaldo());

        ContaBancaria segundaConta = new ContaBancaria("Angelica", 3000.0);
        System.out.println(segundaConta);

        ContaBancaria terceiraConta = new ContaBancaria("Marie");
        System.out.println(terceiraConta);


    }
}
