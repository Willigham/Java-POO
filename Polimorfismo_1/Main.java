package Polimorfismo_1;

public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguro c = new Canguro();
        Cachorro k = new Cachorro();



        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
//
//        p.setPeso(0.35f);
//        p.setIdade(1);
//        p.setMembros(0);
//        p.locomover();
//        p.alimentar();
//        p.emitirSom();
//
//        a.setPeso(0.89f);
//        a.setIdade(2);
//        a.setMembros(2);
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();
//        a.fazerNinho();


    }
}
