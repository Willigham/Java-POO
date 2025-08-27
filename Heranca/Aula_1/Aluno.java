package Heranca.Aula_1;

public class Aluno extends Pessoa{

    //Atributos
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    //Metodos
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
