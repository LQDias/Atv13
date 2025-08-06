package academico;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor() {
    }

    public Professor(String nome, int idade, String cpf, String disciplina, double salario) {
        super(nome, idade, cpf); // Chamada ao construtor da superclasse
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("=== Professor ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
    }
}
