package animais.heranca;

public class Animal {

    public void emitirSom(){
        System.out.println("Som de Animal");
    }

    public void comer(String alimento){
        System.out.println("O animal está comendo "+alimento);
    }

    public void dormir(){
        System.out.println("O animal esta dormindo");
    }

    public void beberAgua(){
        System.out.println("O animal está bebendo água");
    }
}
