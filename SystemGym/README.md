Academia Java
Este projeto em Java é uma aplicação simples para gerenciar uma academia. A aplicação oferece funcionalidades básicas como criação de membros com números de matrícula aleatórios, e geração e exibição de treinos específicos para cada dia da semana.

Funcionalidades Implementadas

Criação de Membros: Permite criar novos membros com nome personalizado. Um número de matrícula único é gerado automaticamente para cada novo membro.
Geração de Treinos: Oferece a geração de treinos detalhados para cada dia da semana:

Segunda-feira: Treino de peito.
Terça-feira: Treino de costas.
Quarta-feira: Treino de quadríceps e posterior de coxa.
Quinta-feira: Treino de ombro.
Sexta-feira: Treino de bíceps e tríceps.
Cada treino inclui uma lista de exercícios específicos com nome, grupo muscular e descrição detalhada.

Estrutura do Projeto: O projeto é dividido em classes Java que implementam as funcionalidades principais:

Membro.java: Define a estrutura de um membro da academia, com nome e número de matrícula.
MembroService.java: Gerencia a criação e remoção de membros.
Exercicio.java: Representa um exercício com nome, grupo muscular e descrição.
ExercicioService.java: Controla a lista de exercícios e a geração dos treinos para cada dia da semana.
AcademiaUI.java: Interface de usuário que permite interagir com o sistema através de um menu simples, incluindo a criação de membros e a exibição de treinos.
Como Usar
Para executar a aplicação:

Siga as instruções no menu para criar membros, gerar treinos e sair do programa.