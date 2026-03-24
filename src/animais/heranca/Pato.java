package animais.heranca;

public class Pato extends Animal implements Voar, Nadar{
    @Override
    public void emitirSom() {
        System.out.println("O pato faz: Quack!");
    }
    @Override
    public void voar() {
        System.out.println("O pato está voando");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando");
    }
}
