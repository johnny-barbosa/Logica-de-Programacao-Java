package orientacao.objeto;

public class Execucao {
    public static void main(String[] args) {

        //jamais alguem faria isso é só para estudo dos metodos staticos
        Integer cpf = 012547;

        String cpfConvertido = Util.conversorString(cpf);

        System.out.println(cpfConvertido);
    }

}
