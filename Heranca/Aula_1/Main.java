package Heranca.Aula_1;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Joao", 15, "M", 1010, "Informatica");

        Professor professor = new Professor("Pedro", 37, "M", "Pedagogo", 2.750f);

        Funcionario funcionaria = new Funcionario("Maria", 40, "F", "cozinha", true);

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionaria.toString());
    }
}
