package interface_animal;

public class Gato implements Animal {
    @Override
    public String emitirSom() {
        return "Miau";
    }
    
    public String comer() {
        return "Ração";
    }


}
