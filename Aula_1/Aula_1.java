package Aula_1;

public class Aula_1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.cor = "vermelho";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
