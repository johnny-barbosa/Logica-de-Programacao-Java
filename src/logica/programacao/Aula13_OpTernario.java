package logica.programacao;

public class Aula13_OpTernario {
    public static void main(String[] args) {
        //operador ternario

        boolean temDinheiro = true;

        String mensagem = (temDinheiro)? "Pede um Ifood": "Fazer comida";

        System.out.println(mensagem);

        System.out.println("-------------------");

        if(temDinheiro){
            System.out.println("Pede um Ifood");
        }
        else {
            System.out.println("Fazer comida");
        }


    }
}
