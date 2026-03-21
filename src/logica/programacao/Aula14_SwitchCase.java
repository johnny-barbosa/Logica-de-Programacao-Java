package logica.programacao;

import java.util.Scanner;

public class Aula14_SwitchCase {
    public static void main(String[] args) {
        //quis testar com entrada e saida

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        //int dia =1; //use caso não queira usar o scanner

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;
            //pensei num ultimo caso porem apareceu a sugestão de default (padrao) quis testar

            default:
                System.out.println("Número inválido");
        }

        scanner.close();
    }
}
