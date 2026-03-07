import java.util.Scanner;

public class Aula9_EntradaESaidaDados {
    public static void main(String[] args) {

        System.out.println("Olá faço impressao pulando uma linha");
        System.out.print("Mesma linha");
        System.out.print("Formatada");


        System.out.println("-------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("você esta empregado? (digite true para sim e false para não) ");
        boolean emprego = sc.nextBoolean();


        System.out.println("Olá "+ nome + " sua idade é: " + idade + " você esta empregado "+ emprego);


        sc.close();
    }
}
