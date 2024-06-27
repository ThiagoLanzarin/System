public class Exercicio {
    private String nome; // Nome do exercício
    private String grupoMuscular; // Grupo muscular ao qual o exercício pertence
    private String descricao; // Descrição do exercício

    // Construtor para inicializar um exercício com nome, grupo muscular e descrição
    public Exercicio(String nome, String grupoMuscular, String descricao) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.descricao = descricao;
    }

    // Método para obter o nome do exercício
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do exercício
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o grupo muscular do exercício
    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    // Método para definir o grupo muscular do exercício
    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    // Método para obter a descrição do exercício
    public String getDescricao() {
        return descricao;
    }

    // Método para definir a descrição do exercício
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Sobrescrita do método toString para retornar uma representação textual do exercício
    @Override
    public String toString() {
        return "Exercício: " + nome + "; Grupo Muscular: " + grupoMuscular + "; Descrição: " + descricao;
    }
}
