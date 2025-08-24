package Aula_3;

public class Aula_3 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC",0.4f,"Azul");
        c1.status();

        System.out.println("");

        Caneta c2 = new Caneta("BIC",  0.5f, "Vermelha");
        c2.status();
    }
}
