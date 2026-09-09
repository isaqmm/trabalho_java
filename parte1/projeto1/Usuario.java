public class Usuario
{
    // atributos comuns para todos os usuarios
    private int matricula;
    private String nome;
    private String login;
    private String senha;

    // metodo construtor
    public Usuario(int mat, String nom, String log, String sen)
    {
        matricula = mat;
        nome = nom;
        login = log;
        senha = sen;
    }

    // metodo de acesso ao atributo: matricula
    public int getMatricula()
    {
        return matricula;
    }

    // metodo de configuracao do atributo: matricula
    public void setMatricula(int mat)
    {
        matricula = mat;
    }

    // metodo de acesso ao atributo: nome
    public String getNome()
    {
        return nome;
    }

    // metodo de configuracao do atributo: nome
    public void setNome(String nom)
    {
        nome = nom;
    }

    // metodo de acesso ao atributo: login
    public String getLogin()
    {
        return login;
    }

    // metodo de configuracao do atributo: login
    public void setLogin(String log)
    {
        login = log;
    }

    // metodo de acesso ao atributo: senha
    public String getSenha()
    {
        return senha;
    }

    // metodo de configuracao do atributo: senha
    public void setSenha(String sen)
    {
        senha = sen;
    }
}