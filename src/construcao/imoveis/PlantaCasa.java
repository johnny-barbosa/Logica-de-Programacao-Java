package construcao.imoveis;



public class PlantaCasa implements Construcao {
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

public void construir(){
    System.out.println("A Casa foi construida, as características são:");
    System.out.println("Metragem "+ metragem);
    System.out.println("Numero de quartos "+ numeroQuartos);
    System.out.println("Numero de banheiros "+ numeroBanheiros);
    System.out.println("Material "+ material);
}

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor "+ cor);
    }
    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintar(){
    System.out.println("A casa foi pintada de "+ cor);
}

public void mudarCorParede(String novaCor){
    cor = novaCor;
    pintar();
}

public int somarMetragem(){
    return metragem * numeroBanheiros + numeroQuartos;
}
public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat ){
    metragem = metros;
    numeroQuartos = quartos;
    numeroBanheiros = banheiros;
    material = mat;
    construir();
    }


}
