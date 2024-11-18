import java.util.ArrayList;  // Importa a classe ArrayList para manipulação de listas dinâmicas
import java.util.Scanner;    // Importa a classe Scanner para ler a entrada do usuário

public class Main {  // Inicia a classe principal do programa

    public static void main(String[] args) {  // Método principal que executa o programa

        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para ler dados do teclado

        // Criação de listas para armazenar os dados de animais, adotantes, voluntários e adoções
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Adotante> adotantes = new ArrayList<>();
        ArrayList<Voluntario> voluntarios = new ArrayList<>();
        ArrayList<Adocao> adocoes = new ArrayList<>();

        int idAnimal = 1;  // Variável para gerar um ID único para cada animal

        // Laço infinito que cria o menu de opções para o usuário
        while (true) {
            // Exibe o menu para o usuário
            System.out.println("Menu:");
            System.out.println("1. Cadastrar animal");
            System.out.println("2. Ver animais cadastrados");
            System.out.println("3. Adotar um animal");
            System.out.println("4. Cadastrar adotante");
            System.out.println("5. Cadastrar voluntário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();  // Lê a opção escolhida pelo usuário
            scanner.nextLine();  // Limpa o buffer de entrada

            // Verifica a opção escolhida pelo usuário
            if (opcao == 1) {
                // Cadastro de um novo animal
                System.out.print("Tipo do animal (ex: Cachorro, Gato): ");
                String tipo = scanner.nextLine();  // Lê o tipo do animal
                System.out.print("Raça do animal: ");
                String raca = scanner.nextLine();  // Lê a raça do animal
                System.out.print("Sexo do animal (M/F): ");
                String sexo = scanner.nextLine();  // Lê o sexo do animal
                System.out.print("Idade do animal: ");
                int idade = scanner.nextInt();  // Lê a idade do animal
                scanner.nextLine();  // Limpa o buffer de entrada
                System.out.print("Animal calmo? (true/false): ");
                boolean tranquilo = scanner.nextBoolean();  // Lê se o animal é calmo
                System.out.print("Animal gosta de passear? (true/false): ");
                boolean gostaPassear = scanner.nextBoolean();  // Lê se o animal gosta de passeios
                scanner.nextLine();  // Limpa o buffer de entrada

                // Criação de um objeto Animal com os dados informados
                Animal animal = new Animal(tipo, raca, sexo, idade, tranquilo, gostaPassear);
                animal.setId(idAnimal);  // Define o ID único para o animal
                animais.add(animal);  // Adiciona o animal à lista de animais
                idAnimal++;  // Incrementa o ID para o próximo animal
                System.out.println("Animal cadastrado com sucesso!");

            } else if (opcao == 3) {
                // Opção para adotar um animal
                System.out.println("Escolha um animal para adotar:");
                if (animais.isEmpty()) {
                    System.out.println("Nenhum animal disponível para adoção.");  // Se não houver animais, exibe uma mensagem
                } else {
                    // Exibe a lista de animais para o usuário
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println((i + 1) + ". " + animais.get(i));  // Exibe cada animal com seu número
                    }

                    System.out.print("Escolha o número do animal: ");
                    int indiceAnimal = scanner.nextInt() - 1;  // Lê a escolha do usuário
                    scanner.nextLine();  // Limpa o buffer de entrada

                    // Verifica se o número do animal é válido
                    if (indiceAnimal >= 0 && indiceAnimal < animais.size()) {
                        // Solicita as informações do adotante
                        System.out.print("Nome do adotante: ");
                        String nomeAdotante = scanner.nextLine();
                        System.out.print("Endereço do adotante: ");
                        String enderecoAdotante = scanner.nextLine();
                        System.out.print("Telefone do adotante: ");
                        String telefoneAdotante = scanner.nextLine();
                        System.out.print("Email do adotante: ");
                        String emailAdotante = scanner.nextLine();
                        
                        // Solicita as preferências do adotante em relação ao animal
                        System.out.print("Idade mínima do animal: ");
                        int idadeMinima = scanner.nextInt();
                        System.out.print("Idade máxima do animal: ");
                        int idadeMaxima = scanner.nextInt();
                        scanner.nextLine();  // Limpa o buffer de entrada
                        System.out.print("Sexo preferido do animal (masculino/feminino/indiferente): ");
                        String sexoPreferido = scanner.nextLine();
                        System.out.print("Tipo de animal preferido (Cachorro, Gato, etc.): ");
                        String tipoPreferido = scanner.nextLine();
                        System.out.print("Raça preferida do animal: ");
                        String racaPreferida = scanner.nextLine();
                        System.out.print("Prefere animal tranquilo? (true/false): ");
                        boolean prefereTranquilo = scanner.nextBoolean();
                        System.out.print("Prefere animal que gosta de passeios? (true/false): ");
                        boolean preferePasseios = scanner.nextBoolean();
                        scanner.nextLine();  // Limpa o buffer de entrada

                        // Criação do objeto Adotante com as informações fornecidas
                        Adotante adotante = new Adotante(nomeAdotante, enderecoAdotante, telefoneAdotante, emailAdotante, 
                                                         idadeMinima, idadeMaxima, sexoPreferido, tipoPreferido, racaPreferida, 
                                                         prefereTranquilo, preferePasseios);

                        // Verifica se o animal corresponde às preferências do adotante
                        Animal animalEscolhido = animais.get(indiceAnimal);
                        if (adotante.correspondeComAnimal(animalEscolhido)) {
                            adotantes.add(adotante);  // Adiciona o adotante à lista
                            Adocao adocao = new Adocao(animalEscolhido, adotante);  // Criação de uma adoção
                            adocoes.add(adocao);  // Adiciona a adoção à lista
                            System.out.println("Adoção realizada com sucesso!");
                        } else {
                            System.out.println("O animal não é compatível com o adotante.");
                        }
                    } else {
                        System.out.println("Animal inválido.");
                    }
                }

            } else if (opcao == 4) {
                // Cadastro de um novo adotante
                System.out.print("Nome do adotante: ");
                String nomeAdotante = scanner.nextLine();
                System.out.print("Endereço do adotante: ");
                String enderecoAdotante = scanner.nextLine();
                System.out.print("Telefone do adotante: ");
                String telefoneAdotante = scanner.nextLine();
                System.out.print("Email do adotante: ");
                String emailAdotante = scanner.nextLine();

                System.out.print("Idade mínima do animal: ");
                int idadeMinima = scanner.nextInt();
                System.out.print("Idade máxima do animal: ");
                int idadeMaxima = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer de entrada
                System.out.print("Sexo preferido do animal (masculino/feminino/indiferente): ");
                String sexoPreferido = scanner.nextLine();
                System.out.print("Tipo de animal preferido (Cachorro, Gato, etc.): ");
                String tipoPreferido = scanner.nextLine();
                System.out.print("Raça preferida do animal: ");
                String racaPreferida = scanner.nextLine();
                System.out.print("Prefere animal tranquilo? (true/false): ");
                boolean prefereTranquilo = scanner.nextBoolean();
                System.out.print("Prefere animal que gosta de passeios? (true/false): ");
                boolean preferePasseios = scanner.nextBoolean();
                scanner.nextLine();  // Limpa o buffer de entrada

                // Criação de um novo objeto Adotante e adição à lista
                Adotante adotante = new Adotante(nomeAdotante, enderecoAdotante, telefoneAdotante, emailAdotante, 
                                                 idadeMinima, idadeMaxima, sexoPreferido, tipoPreferido, racaPreferida, 
                                                 prefereTranquilo, preferePasseios);
                adotantes.add(adotante);
                System.out.println("Adotante cadastrado com sucesso!");

            } else if (opcao == 5) {
                // Cadastro de um novo voluntário
                System.out.print("Nome do voluntário: ");
                String nomeVoluntario = scanner.nextLine();
                System.out.print("Endereço do voluntário: ");
                String enderecoVoluntario = scanner.nextLine();
                System.out.print("Telefone do voluntário: ");
                String telefoneVoluntario = scanner.nextLine();
                System.out.print("Email do voluntário: ");
                String emailVoluntario = scanner.nextLine();

                // Criação de um novo objeto Voluntário e adição à lista
                Voluntario voluntario = new Voluntario(nomeVoluntario, enderecoVoluntario, telefoneVoluntario, emailVoluntario);
                voluntarios.add(voluntario);
                System.out.println("Voluntário cadastrado com sucesso!");

            } else if (opcao == 6) {
                // Encerra o programa
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();  // Fecha o scanner ao final do programa
    }
}
