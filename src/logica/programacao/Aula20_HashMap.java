package logica.programacao;

import java.util.HashMap;
import java.util.Map;

public class Aula20_HashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria",9.5);

        for(String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " "+ nota);
        }
        System.out.println("--------------------");

        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }
        double nota = notasAlunos.get("Alice");
        notasAlunos.get("Alice");
        System.out.println("A nota da Alice é: "+ nota);

        int tamanhoHash = notasAlunos.size();
        System.out.println("O Tamanho do HashMap é: "+tamanhoHash);



    }
}
