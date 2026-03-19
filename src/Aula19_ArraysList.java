import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Aula19_ArraysList {
    public static void main(String[] args) {
        List<String> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add("Mamao");
        listaDeProdutos.add("Sabão em pó");
        listaDeProdutos.add("Jurubeba");
        listaDeProdutos.add("Arroz");
        listaDeProdutos.add(1, "Feijão"); //alocado no index 1

        for (String compras : listaDeProdutos){
            System.out.println(compras);
        }
        System.out.println("--------------");

        String item = listaDeProdutos.get(3);
        System.out.println(item);

        System.out.println("--------------");
        boolean eVazia = listaDeProdutos.isEmpty();
        int tamanho = listaDeProdutos.size();
        boolean contem = listaDeProdutos.contains("Arroz");
        //listaDeProdutos.remove(0); //remove o mamao tambem pode escrever o nome em string

        System.out.println("A lista esta vazia? " + eVazia + ", qual o tamanho da lista? "+ tamanho + "contem o item " + contem);

        System.out.println("A lista não contem itens " + !listaDeProdutos.isEmpty());
        System.out.println("###### FOR EACH #####");
        listaDeProdutos.forEach(produto -> System.out.println(produto));


    }
}
