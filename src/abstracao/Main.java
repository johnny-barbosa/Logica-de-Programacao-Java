package abstracao;

public class Main {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das flores" , "São paulo", "1542","SP", "7855525-88","João Paulo da Silva", "123123123123","Vendedor");

        Cliente joana = new Cliente("Rua das rosas" , "Rio de Janeiro", "0001" , "RJ","Joana Almeida", "456456456");



        System.out.println(joao);
        joao.mostrarEndereco();

        System.out.println("-----------------");

        System.out.println(joana);
        joana.mostrarEndereco();



    }
}
