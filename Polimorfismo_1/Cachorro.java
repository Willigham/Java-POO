package Polimorfismo_1;

public class Cachorro extends Mamifero{

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
    }
}
