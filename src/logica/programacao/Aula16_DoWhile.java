package logica.programacao;

public class Aula16_DoWhile {
    public static void main(String[] args) {
        //raramente util
        //diferente do while a condição é no final

        int contador = 0;

        do{
            System.out.println("Contador "+ contador);
            contador++;
        }while (contador<5);
    }
}
