public class Professor extends Usuario
{
    // atributo especifico para o Professor
    private String areaAtuacao;

    // construtor Professor
    public Professor(int mat, String nom, String log, String sen)
    {
        super(mat, nom, log, sen);
    }

    // metodo de acesso ao atributo: areaAtuacao
    public String getAreaAtuacao()
    {
        return areaAtuacao;
    }

    // metodo de configuracao do atributo: areaAtuacao
    public void setAreaAtuacao(String are)
    {
        areaAtuacao = are;
    }
}