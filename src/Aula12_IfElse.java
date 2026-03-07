public class Aula12_IfElse {
    public static void main(String[] args) {

        int idade = 17;

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        }
        else{
            System.out.println("Você é menor de idade.");
        }

        boolean estaChuvendo = true;

        if (!estaChuvendo){
            System.out.println("Podemos passear");
        }
        else{
            System.out.println("vamos esperar a chuva passar");
        }

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao){
            System.out.println("Compro o combo com batata e sorvete");
        }else if (temDinheiro || temCartao){
            System.out.println("só da para comprar um hamburguer e refrigerante");
        }else{
            System.out.println("to liso!");
        }

    }
}
