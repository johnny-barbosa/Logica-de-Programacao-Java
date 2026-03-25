package polimorfismo;

public class Main {
    public static void main(String[] args) {
        //Polimorfismo Sobrecarga de métodos
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cesoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata,cesoura, melancia);

        System.out.println(total);
        System.out.println(totalDouble);
        System.out.println(totalInteger);

        //sobrescrita de sobrecarga

        Transporte veiculo = new Transporte();
        veiculo.mover();
        System.out.println("--------------");

        Carro tesla = new Carro();
        tesla.mover();



    }
}
