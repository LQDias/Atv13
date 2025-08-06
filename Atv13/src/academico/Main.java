package academico;

public class Main {
    public static void main(String[] args) {
        // Instância com construtor sem parâmetros
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setIdade(20);
        aluno1.setCpf("123.456.789-00");
        aluno1.setCurso("Engenharia");
        aluno1.setMatricula(2023001);
        aluno1.exibirDados();

        System.out.println();

        // Instância com construtor com parâmetros
        Professor professor1 = new Professor("Carla", 40, "987.654.321-00", "Matemática", 5500.00);
        professor1.exibirDados();
    }
}
