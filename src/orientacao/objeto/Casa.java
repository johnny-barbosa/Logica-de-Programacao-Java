package orientacao.objeto;

public class Casa {
    public static void main(String[] args) {

        PlantaCasa novaCasa = new PlantaCasa();

        novaCasa.metragem = 70;
        novaCasa.numeroQuartos = 4;
        novaCasa.numeroBanheiros = 2;
        novaCasa.material = "Tijolos";
        novaCasa.cor = "Cinza";

        novaCasa.construir();
        novaCasa.pintar();
        novaCasa.mudarCorParede("Branco");

        System.out.println("#### Alterando caracteristicas ####");
        novaCasa.alterarCaracteristicas(100 , 5, 3,"Madeira");

        int resultado = novaCasa.somarMetragem();
        System.out.println(resultado);

        //agora vamos criar outra casa
        System.out.println("------------ Casa Vizinho ------------");
        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 3;
        casaVizinho.numeroQuartos = 6;
        casaVizinho.cor = "amarela";

        casaVizinho.construir();
        casaVizinho.pintar();



    }
}
