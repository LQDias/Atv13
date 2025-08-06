package academico;

public class Aluno extends Pessoa {
    private String curso;
    private int matricula;

    public Aluno() {}

    public Aluno(String nome, int idade, String cpf, String curso, int matricula) {
        super(nome, idade, cpf);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("=== Aluno ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
    }
}
