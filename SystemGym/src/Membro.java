public class Membro {
    private String nome;
    private String numeroMatricula;

    // Construtor para inicializar um membro com nome e número de matrícula
    public Membro(String nome, String numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    // Método para obter o nome do membro
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do membro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o número de matrícula do membro
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    // Método para definir o número de matrícula do membro
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    // Sobrescrita do método toString para retornar uma representação textual do membro
    @Override
    public String toString() {
        return "Membro: " + nome + "; Número de Matrícula: " + numeroMatricula;
    }
}
