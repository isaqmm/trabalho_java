public class Aluno extends Usuario
{
    // atributos especificos do aluno
    private double notaGA;
    private double notaGB;

    // construtor Aluno
    public Aluno(int mat, String nom, String log, String sen)
    {
        super(mat, nom, log, sen);
    }

    // metodo de acesso ao atributo: notaGA
    public double getNotaGA()
    {
        return notaGA;
    }

    // metodo de configuracao do atributo: notaGA
    public void setNotaGA(double not)
    {
        notaGA = not;
    }

    // metodo de acesso ao atributo: notaGB
    public double getNotaGB()
    {
        return notaGB;
    }

    // metodo de configuracao do atributo: notaGB
    public void setNotaGB(double not)
    {
        notaGB = not;
    }
}