public class TerceiroExemploClasseAbstrata
{
    public static void main(String args[])
    {
        Professor professor = new Professor(
            Teclado.leInt("Informe a matricula do professor: "),
            Teclado.leString("Informe o nome do professor: "),
            Teclado.leString("Informe o login do professor: "),
            Teclado.leString("Informe a senha do professor: ")
        );

        professor.setAreaAtuacao(
            Teclado.leString("Informe a area de atuacao do professor: ")
        );

        Aluno aluno = new Aluno(
            Teclado.leInt("Informe a matricula do aluno: "),
            Teclado.leString("Informe o nome do aluno: "),
            Teclado.leString("Informe o login do aluno: "),
            Teclado.leString("Informe a senha do aluno: ")
        );

        professor.exibeDados();
        aluno.exibeDados();
    }
}