package animais.heranca;

public class Main {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro();
        caramelo.emitirSom();
        caramelo.comer("Carne");
        caramelo.beberAgua();
        caramelo.dormir();
        System.out.println("--------------------");
        Galinha gertrudez = new Galinha();
        gertrudez.emitirSom();
        gertrudez.comer("Grão de Milho");
        gertrudez.beberAgua();
        gertrudez.dormir();
        System.out.println("--------------------");


    }
}
