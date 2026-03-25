package polimorfismo;

public class Carro extends Transporte {
    @Override
    public void mover() {
        System.out.println("O Carro está se movendo!");
    }
}
