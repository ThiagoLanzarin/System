import java.util.List;
import java.util.Scanner;

public class AcademiaUI {
    private MembroService membroService = new MembroService(); // Serviço para gerenciar membros
    private ExercicioService exercicioService = new ExercicioService(); // Serviço para gerenciar exercícios e treinos
    private Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário

    public void iniciar() {
        System.out.println("Bem-vindo à Academia!");

        while (true) {
            exibirMenuPrincipal(); // Exibe o menu principal
            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            scanner.nextLine();  // Consumir a nova linha após o nextInt()

            switch (opcao) {
                case 1:
                    criarNovoMembro(); // Opção para criar um novo membro
                    break;
                case 2:
                    gerarTreino(); // Opção para gerar e exibir um treino
                    break;
                case 3:
                    System.out.println("Saindo..."); // Opção para sair do programa
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente."); // Mensagem para opção inválida
            }
        }
    }

    private void exibirMenuPrincipal() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Criar novo membro");
        System.out.println("2. Gerar treino");
        System.out.println("3. Sair");
    }

    private void criarNovoMembro() {
        System.out.print("Digite o nome do novo membro: ");
        String nome = scanner.nextLine();
        
        // Gerar número de matrícula aleatório
        String numeroMatricula = gerarNumeroMatricula();

        // Criar um novo membro e adicionar ao serviço de membros
        Membro novoMembro = new Membro(nome, numeroMatricula);
        membroService.adicionarMembro(novoMembro);

        System.out.println("Novo membro criado com sucesso:");
        System.out.println(novoMembro); // Exibir informações do novo membro
    }

    private String gerarNumeroMatricula() {
        return String.format("%06d", (int) (Math.random() * 1000000)); // Gerar número de matrícula com 6 dígitos
    }

    private void gerarTreino() {
        System.out.println("\nEscolha o dia da semana para exibir o treino:");
        System.out.println("1. Segunda-feira");
        System.out.println("2. Terça-feira");
        System.out.println("3. Quarta-feira");
        System.out.println("4. Quinta-feira");
        System.out.println("5. Sexta-feira");

        int opcao = scanner.nextInt(); // Lê a opção de dia da semana escolhido
        scanner.nextLine();  // Consumir a nova linha após o nextInt()

        String diaSemana = null;
        switch (opcao) {
            case 1:
                diaSemana = "Segunda-feira";
                break;
            case 2:
                diaSemana = "Terça-feira";
                break;
            case 3:
                diaSemana = "Quarta-feira";
                break;
            case 4:
                diaSemana = "Quinta-feira";
                break;
            case 5:
                diaSemana = "Sexta-feira";
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                return; // Encerra o método se a opção for inválida
        }

        List<Exercicio> treinoDoDia = exercicioService.getTreinoDoDia(diaSemana); // Obter o treino do dia escolhido

        if (treinoDoDia == null || treinoDoDia.isEmpty()) {
            System.out.println("Não há treino cadastrado para " + diaSemana); // Mensagem se não houver treino cadastrado
        } else {
            System.out.println("\nTreino de " + diaSemana + ":");
            for (Exercicio exercicio : treinoDoDia) {
                System.out.println("Exercício: " + exercicio.getNome()); // Exibir nome do exercício
                System.out.println("Grupo Muscular: " + exercicio.getGrupoMuscular()); // Exibir grupo muscular do exercício
                System.out.println("Descrição: " + exercicio.getDescricao()); // Exibir descrição do exercício
                System.out.println("----------------------------------");
            }
        }
    }
}
