package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class LeitorDocumento {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\johnn\\Desktop\\DOCS\\Texto.txt"));

            // ler linha por linha
            //null == inexistente
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
