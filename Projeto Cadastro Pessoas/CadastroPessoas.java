package cadrastro_pessoas;


public class CadastroPessoas {
    private String nome, sexo;
    private int idade;


    public CadastroPessoas(String n, String s, int i) {
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
