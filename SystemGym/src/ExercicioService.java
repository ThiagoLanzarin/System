import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercicioService {
    private final List<Exercicio> exercicios = new ArrayList<>(); // Lista de todos os exercícios disponíveis
    private final Map<String, List<Exercicio>> treinos = new HashMap<>(); // Mapa para armazenar treinos por dia da semana

    // Construtor para inicializar os exercícios e os treinos
    public ExercicioService() {
        // Inicialização dos exercícios
        inicializarExercicios();

        // Inicialização dos treinos por dia da semana
        inicializarTreinos();
    }

    // Método privado para inicializar os exercícios disponíveis na academia
    private void inicializarExercicios() {
        exercicios.add(new Exercicio("Supino Inclinado", "Peito", "Halteres no banco"));
        exercicios.add(new Exercicio("Supino Reto", "Peito", "Halteres no banco"));
        exercicios.add(new Exercicio("Supino Declinado", "Peito", "Usar barra"));
        exercicios.add(new Exercicio("Puxada Aberta", "Costas", "Fazer com barra, pegada aberta"));
        exercicios.add(new Exercicio("Remada Baixa", "Costas", "Usar pegador triângulo"));
        exercicios.add(new Exercicio("Remada", "Costas", "Usar barra com pegada pronada"));
        exercicios.add(new Exercicio("Puxada Fechada", "Costas", "Usar pegador triângulo"));
        exercicios.add(new Exercicio("Extensora", "Quadríceps", "Usar máquina"));
        exercicios.add(new Exercicio("Agachamento", "Quadríceps", "Fazer no smith"));
        exercicios.add(new Exercicio("Passada", "Quadríceps", "Fazer com halter"));
        exercicios.add(new Exercicio("Mesa Flexora", "Posterior de Coxa", "Usar máquina"));
        exercicios.add(new Exercicio("Stiff", "Posterior de Coxa", "Usar halteres"));
        exercicios.add(new Exercicio("Elevação Lateral", "Ombro", "Usar halter"));
        exercicios.add(new Exercicio("Elevação Frontal", "Ombro", "Usar halter"));
        exercicios.add(new Exercicio("Crucifixo Inverso", "Ombro", "Usar máquina"));
        exercicios.add(new Exercicio("Elevação Lateral (máquina)", "Ombro", "Usar máquina"));
        exercicios.add(new Exercicio("Rosca", "Bíceps", "Usar halter"));
        exercicios.add(new Exercicio("Rosca Martelo", "Bíceps", "Usar halter"));
        exercicios.add(new Exercicio("Rosca (banco 30°)", "Bíceps", "Fazer no banco 30°"));
        exercicios.add(new Exercicio("Tríceps Pulley", "Tríceps", "Fazer na polia com barra"));
        exercicios.add(new Exercicio("Tríceps Francês", "Tríceps", "Usar corda na polia"));
        exercicios.add(new Exercicio("Tríceps Testa", "Tríceps", "Fazer com barra deitado no banco"));
    }

    // Método privado para inicializar os treinos por dia da semana
    private void inicializarTreinos() {
        // Treino de segunda-feira
        List<Exercicio> treinoSegunda = new ArrayList<>();
        treinoSegunda.add(buscarExercicioPorNome("Supino Inclinado"));
        treinoSegunda.add(buscarExercicioPorNome("Supino Reto"));
        treinoSegunda.add(buscarExercicioPorNome("Supino Declinado"));
        treinos.put("Segunda-feira", treinoSegunda);

        // Treino de terça-feira
        List<Exercicio> treinoTerca = new ArrayList<>();
        treinoTerca.add(buscarExercicioPorNome("Puxada Aberta"));
        treinoTerca.add(buscarExercicioPorNome("Remada Baixa"));
        treinoTerca.add(buscarExercicioPorNome("Remada"));
        treinoTerca.add(buscarExercicioPorNome("Puxada Fechada"));
        treinos.put("Terça-feira", treinoTerca);

        // Treino de quarta-feira
        List<Exercicio> treinoQuarta = new ArrayList<>();
        treinoQuarta.add(buscarExercicioPorNome("Extensora"));
        treinoQuarta.add(buscarExercicioPorNome("Agachamento"));
        treinoQuarta.add(buscarExercicioPorNome("Passada"));
        treinoQuarta.add(buscarExercicioPorNome("Mesa Flexora"));
        treinoQuarta.add(buscarExercicioPorNome("Stiff"));
        treinos.put("Quarta-feira", treinoQuarta);

        // Treino de quinta-feira
        List<Exercicio> treinoQuinta = new ArrayList<>();
        treinoQuinta.add(buscarExercicioPorNome("Elevação Lateral"));
        treinoQuinta.add(buscarExercicioPorNome("Elevação Frontal"));
        treinoQuinta.add(buscarExercicioPorNome("Crucifixo Inverso"));
        treinoQuinta.add(buscarExercicioPorNome("Elevação Lateral (máquina)"));
        treinos.put("Quinta-feira", treinoQuinta);

        // Treino de sexta-feira
        List<Exercicio> treinoSexta = new ArrayList<>();
        treinoSexta.add(buscarExercicioPorNome("Rosca"));
        treinoSexta.add(buscarExercicioPorNome("Rosca Martelo"));
        treinoSexta.add(buscarExercicioPorNome("Rosca (banco 30°)"));
        treinoSexta.add(buscarExercicioPorNome("Tríceps Pulley"));
        treinoSexta.add(buscarExercicioPorNome("Tríceps Francês"));
        treinoSexta.add(buscarExercicioPorNome("Tríceps Testa"));
        treinos.put("Sexta-feira", treinoSexta);
    }

    // Método para obter o treino do dia com base no dia da semana
    public List<Exercicio> getTreinoDoDia(String diaSemana) {
        return treinos.get(diaSemana);
    }

    // Método para buscar um exercício pelo nome na lista de exercícios
    public Exercicio buscarExercicioPorNome(String nome) {
        return exercicios.stream()
                .filter(exercicio -> exercicio.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
