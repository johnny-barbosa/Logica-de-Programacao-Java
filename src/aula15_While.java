public class aula15_While {
    public static void main(String[] args) {
        //CUIDADO!!!!
        //bem errei no codigo e paguei caro o contador conta infinitamente até bugar tudo
        //DEBUG é bom para ver o laço acontecendo devagar
        int contador = 0;

        while(contador< 5){
            System.out.println("Contador "+ contador);
            contador++;
        }
    }
}
