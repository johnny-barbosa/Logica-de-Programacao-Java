package logica.programacao;

public class Aula7_OperadoresAritimeticos {
    public static void main(String[] args) {
        double pao = 9.00;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDivido = valorTotalComDesconto / 2; //dividido para duas pessoas

        double ValorTotalMensal = valorTotalComDesconto * totalDiasDoMes;
        double ValorTotalMensalDivido = valorTotalDivido * totalDiasDoMes;


        System.out.println("Valor total com desconto: "+ valorTotalComDesconto);

        System.out.println("Gasto Mensal: " + ValorTotalMensal);

        System.out.println("Gasto mensal dividido: "+ValorTotalMensalDivido);

    }
}
