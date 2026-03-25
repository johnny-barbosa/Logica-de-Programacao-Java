package associação.composicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //exemplo de Composição - Carro e Motor , ex: um carro não pode existir sem um motor
        Carro fusca = new Carro(20);
        fusca.mostrarCilindradas();

        System.out.println("--------------------");

        //exemplo de Agregação - departamento e funcionarios

        Funcionarios joao = new Funcionarios("João");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios mateus = new Funcionarios("Mateus");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(mateus);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();
        System.out.println("--------------------");
        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
