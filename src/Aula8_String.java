public class Aula8_String {

    public static void main(String[] args) {
        String nome = "Johnny";
        String sobrenome = "Barbosa";

        String nomeAluno = "Joana";
        String nomeAlunoDois = "Dieberson";

        int tamanhoString = nome.length();
        boolean saoInguais = nomeAluno.equals(nomeAluno);

        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome + " seu nome tem " + tamanhoString + " caracteres " );
        System.out.println("Seu nome completo é: "+ nomeCompleto);

        System.out.println("----------------");
        System.out.println("Alunos: "+ nomeAluno + " e " + nomeAlunoDois );
        System.out.println("os nomes dos aluno são iguais: "+ saoInguais );

    }


}
