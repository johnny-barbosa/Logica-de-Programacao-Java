package logica.programacao;

public class Aula18_Arrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] frutas = {"Maçã", "Banana", "Laranja"};


        System.out.println("Numeros na lista!");
        for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("---------------------");

        System.out.println("Frutas na lista!");
        for (int f=0; f < frutas.length; f++){
            System.out.println(frutas[f]);
        }
        System.out.println("--------------------");
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

        for(int posicao = 3; posicao < salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
        System.out.println("----------------");
        for(double salario : salarios){
            System.out.println(salario);
        }

    }
}
