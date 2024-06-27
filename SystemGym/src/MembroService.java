import java.util.ArrayList;
import java.util.List;

public class MembroService {
    public List<Membro> membros = new ArrayList<>();

    // Método para adicionar um novo membro à lista de membros
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    // Método para remover um membro com base no número de matrícula
    public void removerMembro(String numeroMatricula) {
        membros.removeIf(membro -> membro.getNumeroMatricula().equals(numeroMatricula));
    }

    // Método para buscar um membro pelo nome, ignorando maiúsculas/minúsculas
    public Membro buscarMembroPorNome(String nome) {
        return membros.stream()
                .filter(membro -> membro.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    // Método para listar todos os membros (retorna uma cópia da lista original)
    public List<Membro> listarMembros() {
        return new ArrayList<>(membros);
    }
}
