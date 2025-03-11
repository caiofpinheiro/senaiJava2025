package interface_animal;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        Gato gato = new Gato();
        
        System.out.println("Cachorro: " + cachorro.emitirSom() + " - " + cachorro.comer());
        System.out.println("Pato: " + pato.emitirSom() + " - " + pato.comer());
        System.out.println("Gato: " + gato.emitirSom() + " - " + gato.comer());
    }

}
