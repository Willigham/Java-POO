package Heranca.Aula_1;

public class Professor extends Pessoa{

    //Atributos
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    //Metodos
    public void receberAum(float aum){
        this.salario += aum;
    }


    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
